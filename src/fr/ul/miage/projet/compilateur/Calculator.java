package fr.ul.miage.projet.compilateur;

import java.util.ArrayList;
import fr.ul.miage.projet.noeud.Noeud;
import fr.ul.miage.projet.noeud.NoeudAppel;
import fr.ul.miage.projet.noeud.NoeudDiv;
import fr.ul.miage.projet.noeud.NoeudLire;
import fr.ul.miage.projet.noeud.NoeudMoins;
import fr.ul.miage.projet.noeud.NoeudMul;
import fr.ul.miage.projet.noeud.NoeudPlus;
import fr.ul.miage.projet.noeud.NoeudValeur;


public class Calculator {

	private String opBinaire = "+-*/";
	private String chiffre = "0123456789";
	private String opUnaire = "-+";
	
	
	private ArrayList<String> formuleAdapte;
	private Noeud racine;
	private int i;
	
	
	public Calculator(){
		formuleAdapte = new ArrayList<String>();
		i  = 0;
	  }
	
	public Calculator(String formule){
		formuleAdapte = new ArrayList<String>();
		i=0;
		decoupe(formule);
		parseurPrefixe();
		racine = CreationNoeud();
	}	
	
	//Méthode de découpe de la formule dans une ArrayList
	private void decoupe (String s){
		boolean unaire = false;
		if (s.length() > 0){
			//Pour les opérateurs unaires
			if (formuleAdapte.isEmpty() && opUnaire.contains(s.substring(0,1)) ){
				formuleAdapte.add("0");
				formuleAdapte.add(s.substring(0,1));
				unaire = true;
				decoupe(s.substring(1));
				return;
			}
			
			// Pour les parenthèses
			if (s.substring(0,1).equals("(")){
				String parenthese = recupParenthese(s);
				formuleAdapte.add(parenthese);
				decoupe(s.substring(parenthese.length()+2 ));
				return;
			}
			
			//Pour les chiffres
			if ( (s.length() == 1 && chiffre.contains(s)) || chiffre.contains(s.substring(0,1)) ){
				String nombre = recupNombre(s);
				formuleAdapte.add(nombre);
				decoupe(s.substring( nombre.length() ));
				return;
			}
			
			//Pour opérateur Binaire
			if ( opBinaire.contains(s.substring(0,1)) && !unaire ){
				formuleAdapte.add(s.substring(0,1));
				decoupe(s.substring(1));
				return;
			}
			
			//Pour l'action APPEL
			if(s.substring(0,5).equals("appel")){
				formuleAdapte.add(s.substring(0, s.indexOf(")")+1));
				decoupe(s.substring(s.indexOf(")")+1));
				return;
			}
			
			//Pour l'action LIRE()
			if(s.substring(0,6).equals("lire()")){
				formuleAdapte.add(s.substring(0,6));
				decoupe(s.substring(6));
				return;
			}
		}	
	}
	
	//Méthode pour réorganiser la liste formuleAdapte, pour la création de l'arbre
	private void parseurPrefixe (){
		boolean chaineOpBinaire = false;
		ArrayList<String> listeU = new ArrayList<String>();
		ArrayList<String> listeB = new ArrayList<String>();
		for(int i = 0 ; i < formuleAdapte.size(); i++){
			if ( i == formuleAdapte.size() - 1){
				listeB.add(formuleAdapte.get(i));
				listeU.addAll(listeB);
			}
			if (opUnaire.contains(formuleAdapte.get(i))){
				listeU.add(0,formuleAdapte.get(i));
				if (chaineOpBinaire){
					chaineOpBinaire = false;
					listeB.add(formuleAdapte.get(i-1));
					listeU.addAll(listeB);
					listeB.clear();
				}
				else{
					listeU.add(formuleAdapte.get(i-1));
				}
			}
			if( formuleAdapte.get(i).equals("*") || formuleAdapte.get(i).equals("/")){
				listeB.add(0,formuleAdapte.get(i));
				listeB.add(formuleAdapte.get(i-1));
				chaineOpBinaire = true;
			}
		}
		formuleAdapte = listeU;
	}
	
	//Méthode pour récupérer la formule entre parenthèse
	private String recupParenthese (String p){
		int j = 1;
		int i = 0;
		while ( i != p.length()){
			i++;
			if(p.substring(i,i+1).equals("(")){
				j++;
			}
			if (p.substring(i,i+1).equals(")")){
				j--;
				if (j == 0){
					return p.substring(1,i);
				}
			}
		}
		return p;
	}
	
	//Méthode pas récuperer un nombre dans la formule
	private String recupNombre (String c){
		String rep = "";
		if (c.length() == 1){
			rep = c;
		}
		else{
			if(chiffre.contains(c.substring(0,1))){
				rep = c.substring(0,1) + recupNombre (c.substring(1)) ;
			}
		}
		return rep;
	}
	
	
	//Méthode de création de l'arbre
	private Noeud CreationNoeud(){
		i++;
		if (formuleAdapte.size()==0){return null;}
		switch(formuleAdapte.get(i-1)){
	      case "+" : return new NoeudPlus(CreationNoeud(), CreationNoeud());
	      case "*" : return new NoeudMul(CreationNoeud(), CreationNoeud());
	      case "-" : return new NoeudMoins(CreationNoeud(), CreationNoeud());
	      case "/" : return new NoeudDiv(CreationNoeud(), CreationNoeud());
	      case "lire()" : return new NoeudLire();
	      default:
	    	  if(estAppel()){
	    		  return new NoeudAppel(formuleAdapte.get(i-1).substring(5, formuleAdapte.get(i-1).indexOf("(")));
	    		  //appelP()
	    	  }
	    	  if (estFormule()){
	    		  Calculator sousArbre = new Calculator (formuleAdapte.get(i-1));
		    	  return sousArbre.racine;
		      }
	    	  return new NoeudValeur(Double.parseDouble(formuleAdapte.get(i-1)));
	    }
	}
	
	//Méthode pour détermine le type d'un élement de formuleAdapte, entre autre si c'est un appel ou non
	private boolean estAppel(){
		if(formuleAdapte.get(i-1).length() != 1 && formuleAdapte.get(i-1).contains("appel")){
			return true;
		}
		return false;
	}
	
	//Méthode pour détermine le type d'un élement de formuleAdapte, entre autre si c'est une formule ou non  
	private boolean estFormule(){
		if ( (formuleAdapte.get(i-1).length() != 1) && 
			 (formuleAdapte.get(i-1).contains("+") || formuleAdapte.get(i-1).contains("-") ||
			  formuleAdapte.get(i-1).contains("*") || formuleAdapte.get(i-1).contains("/") || 
			  formuleAdapte.get(i-1).contains("(")) ){
			return true;
		}
		return false;	  
	}
	
	//Retourne le code assembleur associé à l'opération
	public String traduire(String formule){
		decoupe(formule);
		parseurPrefixe();
		racine = CreationNoeud();
		if(racine == null){
			return "";
		}
		return racine.retour();
	}
}


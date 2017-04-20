package fr.ul.miage.projet.compilateur;

import java.util.Map.Entry;

/**
 * Class qui permet de générer le code assembleur beta (UASM).
 * @authors Matthieu VINCENT, Martin LEMAITRE, Loic REISDOERFER, Mervine LIEFFROY.
 */
public class GenerateurUASM {
	protected Noeud ast;
	protected TableDesSymboles tds;
	protected String res = "---- Programme source traduit en assembleur beta ----";
	
	/**
	 * Constructeur de la class GenerateurUASM
	 * @param ast
	 * @param tds
	 */
	public GenerateurUASM(Noeud ast, TableDesSymboles tds){
		this.ast = ast;
		this.tds = tds;
	}
	
	/**
	 * Méthode qui permet de générer le code assembleur correspondant au programme source.
	 * @return res -> Contient le code assembleur généré.
	 */
	public String genererCodeUASM(){
		genererProg(this.ast);
		// Contient l'ensemble du code assembleur.
		return this.res;
	}
	
	/**
	 * Méthode qui permet de générer le programme source en assembleur
	 * @param ast
	 */
	public void genererProg(Noeud ast){
		res += "\nCMOVE(pile, SP)"
			   + "\nCALL(principal)"
			   + "\nHALT()";
		// Permet de générer l'ensemble des données utiles au programme
		generer_data();
		// Partie qui contien le code du programme
		res += "\nprincipal :";
		// On parcours tous les fils du noeud prog
		for(Noeud noeud : this.ast.getListeFils()){
			// Si le ou les fil(s) sont des fonction, on génère le code de celles-ci.
			if(ast.getType() == Type.FONCT || ast.getType() == Type.PRINC){
				generer_fonction(ast);	
			}
		}
		// On déclare la partie de la pile
		res += "\npile :";
	}
	
	/**
	 * Méthode qui permet de générer les données du programme
	 */
	public void generer_data(){
		// On parcours tous les éléments de la table des symboles
		for (Entry<Integer, Symbole> entry : this.tds.getTds().entrySet()){
			// On récupère les informations utiles au data
			Integer clef = entry.getKey();
			Symbole symbole = entry.getValue(); 
			// Si c'est une variable global, on l'ajoute à la partie des datas
			if (symbole.getScope() == Scope.GLOB){  
				res += "\n" + symbole.getNom() + ": LONG(" + symbole.getValeur() + ")";
			}
		}
	}
	
	public void generer_fonction(Noeud ast){
		
	}
}

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
		res += "\n" + ast.getNom() + ":";
		generer_data_loc();
		res += "\nPUSH(LP)";
		res += "\nPUSH(BP)";
		res += "\nMOVE(SP,BP)";
		res += "\nALLOCATE(" + ast.getListeFils().get(0).getListeFils().size() + ")";
		for (Noeud n : ast.getListeFils()){
			generer_instruction(n);
		}
		if(ast.getType() == Type.FONCT){
			if(ast.getListeFils().get(ast.getListeFils().size() - 1).getType() == Type.RETURN){
				res+="\nreturn_" + ast.getValeur();
				res+="\nDEALLOCATE(" + ast.getListeFils().size() + ")";
				res+="\nPOP(BP)";
				res+="\nPOP(LP)";
				res+="\nRTN()";
				generer_retour(ast.getListeFils().get(ast.getListeFils().size() - 1));
			}
		}
	}
	
	public void generer_data_loc(){
		// On parcours tous les éléments de la table des symboles
		for (Entry<Integer, Symbole> entry : this.tds.getTds().entrySet()){
			// On récupère les informations utiles au data
			Integer clef = entry.getKey();
			Symbole symbole = entry.getValue(); 
			// Si c'est une variable global, on l'ajoute à la partie des datas
			if (symbole.getScope() == Scope.LOC){  
				res += "\n" + symbole.getNom() + "=" + symbole.getValeur();
			}
		}
	}
	
	public void generer_retour(Noeud ast){
		generer_expression(ast.getListeFils().get(0));
		res+= "\nPOP(R0)";
		int tmp = ast.getListeFils().get(0).getListeFils().size(); 		
		res+= "\nPUTFRAME(R0,"+ tmp + ")";
		res+= "\nBR("+ ast.getNom() + ")";
	}
	
	public void generer_instruction(Noeud ast){
		switch(ast.getType()){
			case AFFECTATION :
				generer_affectation(ast);
				break;
			case APPEL :
				generer_appel(ast);
				break;
			case SI :
				generer_si(ast);
				break;
			case TANTQUE : 
				generer_tantQue(ast);
				break;
			case ECRIRE :
				generer_ecrire(ast);
				break;
			default :
				break;
		}
	}
	
	public void generer_ecrire(Noeud ast){
		generer_expression(ast.getListeFils().get(0));
		res+= "\nPOP(R0)";
		res+= "\nWRINT()";
	}

	public void generer_tantQue(Noeud ast){
		// TODO Auto-generated method stub
	}

	public void generer_si(Noeud ast){
		// TODO Auto-generated method stub
	}

	public void generer_appel(Noeud ast) {
		res += "\nCALL(" + ast.getNom() + ")";
	}

	public void generer_affectation(Noeud ast){
		// TODO Auto-generated method stub
	}

	public void generer_expression(Noeud ast){
		//TODO
	}
	
	public void generer_lire(){
		res+= "\nPOP(R0)";
		res+= "\nRDINT()";
	}
}

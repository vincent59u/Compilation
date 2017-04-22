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
		res +=  "\n.include beta.uasm"
				+ "\n.include intio.uasm"
				+ "\nCMOVE(pile, SP)"
			    + "\nCALL(principal)"
			    + "\nHALT()";
		// Permet de générer l'ensemble des données utiles au programme
		generer_data();
		// Partie qui contien le code du programme
		res += "\nprincipal :";
		// On parcours tous les fils du noeud prog
		for(Noeud noeud : ast.getListeFils()){
			// Si le ou les fil(s) sont des fonction, on génère le code de celles-ci.
			if(noeud.getType() == Type.FONCT || noeud.getType() == Type.PRINC){
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
		for (Entry<String, Symbole> entry : this.tds.getTds().entrySet()){
			// On récupère les informations utiles au data
			String clef = entry.getKey();
			Symbole symbole = entry.getValue(); 
			// Si c'est une variable global, on l'ajoute à la partie des datas
			if (symbole.getScope() == Scope.GLOB){  
				res += "\n" + symbole.getNom() + ": LONG(" + symbole.getValeur() + ")";
			}
		}
	}
	
	public void generer_fonction(Noeud ast){
		res += "\n" + ast.getNom() + ":";
		//System.out.println(res);
		generer_data_loc();
		res += "\nPUSH(LP)";
		res += "\nPUSH(BP)";
		res += "\nMOVE(SP,BP)";
		res += "\nALLOCATE(" + ast.getListeFils().get(0).getListeFils().size() + ")";
		for (Noeud n : ast.getListeFils()){
			System.out.println(ast.getType());
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
		for (Entry<String, Symbole> entry : this.tds.getTds().entrySet()){
			// On récupère les informations utiles au data
			String clef = entry.getKey();
			Symbole symbole = entry.getValue(); 
			// Si c'est une variable global, on l'ajoute à la partie des datas
			if (symbole.getScope() == Scope.LOC){  
				res += "\n" + symbole.getNom() + "=" + symbole.getValeur();
				System.out.println(res);
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
				System.out.println("test");
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
		res += "\nBR(" + ast.getNom() + ")";
		res += "\n" + ast.getNom() + ":";
		generer_condition(ast.getListeFils().get(0));
		res+= "\nPOP(R0)";
		res+= "\nBF(R0,fin" + ast.getNom() +")";
		generer_bloc(ast.getListeFils().get(1));
		res+= "\nBR(" + ast.getNom() + ")";
		res+= "\nfin" + ast.getNom() + ":";
	}

	private void generer_bloc(Noeud ast) {
		for (Noeud n : ast.getListeFils()){
			generer_instruction(n);			
		}
	}

	private void generer_condition(Noeud ast) {
		generer_expression(ast.getListeFils().get(0));
		generer_expression(ast.getListeFils().get(1));
		
		res+= "\nPOP(R1)";
		res+= "\nPOP(R0)";
		
		switch ((String)ast.getValeur()) {
		case "<" :
			res += "\nCMPLT(R0,R1,R0)";
			res += "\nPUSH(R0)";
			break;
		case ">" :
			res += "\nCMPLT(R1,R0,R0)";
			//res += "\nCMPEQ(R1,R2,R0)";
			//res += "\nX0RC(R0,-1,R0)";
			res += "\nPUSH(R0)";
			break;
		case "==" :
			res += "\nCMPEQ(R0,R1,R0)";
			res += "\nPUSH(R0)";
			break;
		case "<=" :
			res += "\nCMPLE(R0,R1,R0)";
			res += "\nPUSH(R0)";
			break;
		case ">=" :
			res += "\nCMPLE(R1,R0,R0)";
			res += "\nPUSH(R0)";
			break;
		case "!=" :
			res += "\nCMPEQ(R0,R1,R0)";
			res += "\nX0RC(R0,1,R0)";
		}
	}

	public void generer_si(Noeud ast){
		res += "\n" + (String)ast.getValeur() + ":";
	    generer_condition(ast.getListeFils().get(0));
		res += "\nPOP(R0)";
		if(ast.getListeFils().size()>2){
			res += "\nBF(R0,sinon" + (String)ast.getValeur() +")";
		}
		generer_bloc(ast.getListeFils().get(1));		
		if(ast.getListeFils().size()>2){
			res += "\nBR(finsi" + (String)ast.getValeur() + ")";
			res += "\nsinon" + (String)ast.getValeur() + ":";
			generer_bloc(ast.getListeFils().get(2));
		}
		res+= "\nfinsi" + (String)ast.getValeur()+":";
	}

	public void generer_appel(Noeud ast) {
		res += "\nCALL(" + ast.getNom() + ")";
	}

	public void generer_affectation(Noeud ast){
		generer_expression(ast.getListeFils().get(1));
		res += "\nPOP(R0)";
		res += "\nST(R0," + ast.getListeFils().get(0).getValeur() + ")";
	}

	public void generer_expression(Noeud ast){
		if (ast.getType() == Type.CONSTANTE){
			if(ast.getNom() != ""){
				if (this.tds.getSymbole(ast.getNom()).getScope() == Scope.GLOB){
					res += "\nCMOVE(" + this.tds.getSymbole(ast.getNom()).getValeur() + ",R0)";
					res += "\nPUSH(R0)";
				}else if (this.tds.getSymbole(ast.getNom()).getScope()  == Scope.LOC){
						res += "\nGETFRAME("+ this.tds.getSymbole(ast.getNom()).getValeur() +",R0)";
						res += "\nPUSH(R0)";				
				}
			}else{
				res += "\nGETFRAME("+ ast.getValeur() +",R0)";
				res += "\nPUSH(R0)";	
			}
		}else if (ast.getType() == Type.NUM) {
			res += "\nLD(" + ast.getValeur()+ ", R0)" ;
			res += "\nPUSH(R0)";	
		
		}else if (ast.getType() == Type.ADD){
			generer_expression (ast.getListeFils().get(0));
			generer_expression (ast.getListeFils().get(1));
			res += "\nPOP(R0)";
			res += "\nPOP(R1)";
			res += "\nADD(R0,R1,R2)";
			res += "\nPUSH(R2)";		
		}else if (ast.getType() == Type.MOINS){
			generer_expression (ast.getListeFils().get(0));
		    generer_expression (ast.getListeFils().get(1));
			res += "\nPOP(R0)";
			res += "\nPOP(R1)";
			res += "\nSUB(R0,R1,R2)";
			res += "\nPUSH(R2)";
		}else if (ast.getType() == Type.MUL){
			generer_expression (ast.getListeFils().get(0));
			generer_expression (ast.getListeFils().get(1));
			res += "\nPOP(R0)";
			res += "\nPOP(R1)";
			res += "\nMUL(R0,R1,R2)";
			res += "\nPUSH(R2)";
		}else if(ast.getType() == Type.DIV){
			generer_expression (ast.getListeFils().get(0));
			generer_expression (ast.getListeFils().get(1));
			res += "\nPOP(R0)";
			res += "\nPOP(R1)";
			res += "\nDIV(R0,R1,R2)";
			res += "\nPUSH(R2)";
		}else if (ast.getType() == Type.APPEL){
			generer_fonction(ast.getListeFils().get(1));
			res += "\nPOP(R0)";
			res += "\nPUSH(R0)";
			generer_appel(ast);
		}else if (ast.getType() == Type.LIRE){
			generer_lire(ast);
			res += "\nPOP(R0)";
			res += "\nPUSH(R0)";
		}
	}
	
	public void generer_lire(Noeud ast){
		generer_expression(ast.getListeFils().get(0));
		res+= "\nPOP(R0)";
		res+= "\nRDINT()";
	}
}

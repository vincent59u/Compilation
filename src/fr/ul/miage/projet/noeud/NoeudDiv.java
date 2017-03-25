package fr.ul.miage.projet.noeud;

public class NoeudDiv extends Noeud {

	public NoeudDiv (Noeud fg, Noeud fd){
		super(fg, fd);
	}
	
	public double calculer(){
		if(getFd().calculer() == 0){throw new ArithmeticException();}
		return getFg().calculer() / getFd().calculer();
	}
	
	public String retour(){
		return getFg().retour()+getFd().retour()+"POP(r2)\nPOP(r1)\nDIV(r1, r2, r0)\nPUSH (r0)\n";
	}
}

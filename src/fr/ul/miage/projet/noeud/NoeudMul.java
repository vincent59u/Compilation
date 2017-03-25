package fr.ul.miage.projet.noeud;

public class NoeudMul extends Noeud {

	public NoeudMul (Noeud fg, Noeud fd){
		super(fg, fd);
	}
	
	public double calculer(){
		return getFg().calculer() * getFd().calculer();
	}
	
	public String retour(){
		return getFg().retour()+getFd().retour()+"POP(r2)\nPOP(r1)\nMUL(r1, r2, r0)\nPUSH (r0)\n";
	}
}


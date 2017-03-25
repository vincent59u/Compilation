package fr.ul.miage.projet.noeud;

public class NoeudMoins extends Noeud {

	public NoeudMoins (Noeud fg, Noeud fd){
		super(fg, fd);
	}
	
	public double calculer(){
		return getFg().calculer() - getFd().calculer();
	}
	
	public String retour(){
		return getFg().retour()+getFd().retour()+"POP(r2)\nPOP(r1)\nSUB(r1, r2, r0)\nPUSH (r0)\n";
	}
}


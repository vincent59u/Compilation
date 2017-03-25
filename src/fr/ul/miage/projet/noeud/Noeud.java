package fr.ul.miage.projet.noeud;

public abstract class Noeud {

	private Noeud fg;
	private Noeud fd;
	
	protected Noeud(String formule, boolean j){
	}
 
	protected Noeud(Noeud newFg, Noeud newFd){
		fg = newFg;
		fd = newFd;
	}
 
	protected Noeud getFg(){
		return fg;
	}
 
	protected Noeud getFd(){
		return fd;
	}
	
	public abstract double calculer();
	
	public abstract String retour();

}


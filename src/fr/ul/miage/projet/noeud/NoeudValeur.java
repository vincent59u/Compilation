package fr.ul.miage.projet.noeud;

public class NoeudValeur extends Noeud {
	private double valeur;
	
	public NoeudValeur (double valeur){
		super(null, null);
		this.valeur = valeur;
	}
	
	public double calculer(){
		return valeur;
	}
	
	public String retour(){
		return "CMOVE("+valeur+", r0)\nPUSH(r0)\n";
	}

}


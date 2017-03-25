package fr.ul.miage.projet.noeud;

public class NoeudAppel extends Noeud {
	
	String label;

	public NoeudAppel(String label) {
		super(null, null);
		this.label=label;
	}

	public double calculer() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String retour() {
		return "CALL("+label+")\n";
	}

}

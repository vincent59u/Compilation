package fr.ul.miage.projet.compilateur;

/**
 * Class qui permet de modéliser un symbole du langage de programmation.
 * Ce symbole sera utilisé dans la table des symboles (TDS)
 * @authors Matthieu VINCENT, Martin LEMAITRE, Loic REISDOERFER, Mervine LIEFFROY.
 */
public class Symbole {
	protected String nom;
	protected Scope scope;
	protected int valeur;
	protected String retour;
	
	/**
	 * Premier constructeur de la classe Symbole
	 * @param nom
	 * @param scope
	 */
	public Symbole(String nom, Scope scope){
		this.nom = nom;
		this.scope = scope;
		this.valeur = 0;
	}
	
	/**
	 * Deuxième constructeur de la classe Symbole
	 * @param nom
	 * @param scope
	 * @param valeur
	 */
	public Symbole(String nom, Scope scope, int valeur){
		this.nom = nom;
		this.scope = scope;
		this.valeur = valeur;
	}
	
	public Symbole(String nom, Scope scope, String retour){
		this.nom = nom;
		this.scope = scope;
		this.retour = retour;
	}

	/**
	 * Getter qui permet de retourner le nom du symbole
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter qui permet de modifier le nom du symbole
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter qui permet de retourner le scope du symbole
	 * @return scope
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * Setter qui permet de modifier le scope du symbole
	 * @param scope
	 */
	public void setScope(Scope scope) {
		this.scope = scope;
	}

	/**
	 * Getter qui permet de retourner la valeur du symbole
	 * @return valeur
	 */
	public int getValeur() {
		return valeur;
	}

	/**
	 * Setter qui permet de modifier la valeur du symbole
	 * @param valeur
	 */
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
}

package fr.ul.miage.projet.compilateur;

import java.util.ArrayList;

/**
 * Class qui permet de modéliser un Noeud de l'AST. L'ensemble des noeuds formeront l'arbre.
 * @authors Matthieu VINCENT, Martin LEMAITRE, Loic REISDOERFER, Mervine LIEFFROY.
 */
public class Noeud {
	protected String nom;
	protected Type type;
	protected Object valeur;
	public ArrayList<Noeud> listeFils;
	
	/**
	 * Constructeur de la class Noeud
	 * @param nom
	 * @param type
	 * @param valeur
	 */
	public Noeud(String nom, Type type, Object valeur){
		this.nom = nom;
		this.type = type;
		this.valeur = valeur;
		this.listeFils = new ArrayList<Noeud>();
	}
	
	/**
	 * Méthode qui permet d'ajouter un noeud
	 * @param noeud
	 */
	public void ajoutFils(Noeud noeud){
		this.listeFils.add(noeud);
	}
	
	/**
	 * Méthode qui permet de vérifier que chaque noeud qui constitue l'arbre sont bien structurés au niveaux de leurs fils
	 * @return boolean verification
	 */
	public boolean verifierStructure(){
		boolean verification = true;
		// On test pour chaque type de noeud qu'ils possèdent le bon nombre de fils
		switch(this.type){
			case AFFECTATION :
				//2 fils : variable et valeur
				if (this.listeFils.size() != 2){
					verification = false;
					System.err.println("Le Noeud AFFECTATION ne possède pas le bon nombre de fils");
				}
				break;
			case ADD :
				//2 fils : membre droit et membre gauche
				if (this.listeFils.size() != 2){
					verification = false;
					System.err.println("Le Noeud ADD ne possède pas le bon nombre de fils");
				}
				break;
			case MUL :
				//2 fils : membre droit et membre gauche 
				if (this.listeFils.size() != 2){
					verification = false;
					System.err.println("Le Noeud MUL ne possède pas le bon nombre de fils");
				}
				break;
			case MOINS : 
				//2 fils : membre droit et membre gauche
				if (this.listeFils.size() != 2){
					verification = false;
					System.err.println("Le Noeud MOINS ne possède pas le bon nombre de fils");
				}
				break;
			case DIV :
				//2 fils : membre droit et membre gauche
				if (this.listeFils.size() != 2){
					verification = false;
					System.err.println("Le Noeud DIV ne possède pas le bon nombre de fils");
				}
				break;
			case SI : 
				//2 fils : condition et bloc de code
				//3 fils : condition, bloc de code et sinon
				if (this.listeFils.size() != 2 && this.listeFils.size() != 3){
					verification = false;
					System.err.println("Le Noeud SI ne possède pas le bon nombre de fils");
				}
				break;
			case TANTQUE :
				//2 fils : condition et bloc de code
				if (this.listeFils.size() != 2){
					verification = false;
					System.err.println("Le Noeud TANTQUE ne possède pas le bon nombre de fils");
				}
				break;
			case LIRE :
				//0 fils : L'element à lire est placé sur le noeud (pas en enfant)
				if (this.listeFils.size() > 0){
					verification = false;
					System.err.println("Le Noeud LIRE ne possède pas le bon nombre de fils");
				}
				break;
			case ECRIRE :
				//1 fils : resultat ou valeur à écrire
				if (this.listeFils.size() != 1){
					verification = false;
					System.err.println("Le Noeud ECRIRE ne possède pas le bon nombre de fils");
				}
				break;
			//Pas de cas par défaut car les autres type de noeud peuvent avoir 0 à n fils
			default :	
				break;
		}
		//On effectue cette vérification pour tous les fils de chaque noeuds (récursivité) ce qui permet de vérifier l'arbre complet
		for (Noeud n : listeFils){
			if(!n.verifierStructure()){
				verification = false;
			}
		}
		//On retourne le résultat final concernant la structure de l'arbre
		return verification;
	}

	/**
	 * Getter qui permet de retourner le nom du noeud
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter qui permet de modifier le nom du noeud
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter qui permet de retourner le type du noeud
	 * @return type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Setter qui permet de modifier le type du noeud
	 * @param type
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * Getter qui permet de retourner la valeur du noeud
	 * @return valeur
	 */
	public Object getValeur() {
		return valeur;
	}

	/**
	 * Setter qui permet de modifier la valeur du noeud
	 * @param valeur
	 */
	public void setValeur(Integer valeur) {
		this.valeur = valeur;
	}

	/**
	 * Getter qui permet de retourner la liste des fils du noeud
	 * @return listeFils
	 */
	public ArrayList<Noeud> getListeFils() {
		return listeFils;
	}

	/**
	 * Setter qui permet de modifier la liste des fils du noeud
	 * @param listeFils
	 */
	public void setListeFils(ArrayList<Noeud> listeFils) {
		this.listeFils = listeFils;
	}

	/**
	 * Surcharge de la méthode ajoutFils qui permet d'ajouter une liste de fils
	 * @param block
	 */
	public void ajoutFils(ArrayList<Noeud> block) {
		for(Noeud n : block){
			ajoutFils(n);
		}
	}
}
package fr.ul.miage.projet.compilateur;

import java.util.ArrayList;
import fr.ul.miage.projet.compilateur.enumeration.Type;

/**
 * Class qui permet de modéliser un Noeud de l'AST. L'ensemble des noeuds formeront l'arbre.
 * @authors Matthieu VINCENT, Martin LEMAITRE, Loic REISDOERFER, Mervine LIEFFROY.
 */
public class Noeud {
	protected String nom;
	protected Type type;
	protected Integer valeur;
	protected ArrayList<Noeud> listeFils;
	
	/**
	 * Constructeur de la class Noeud
	 * @param nom
	 * @param type
	 * @param valeur
	 */
	public Noeud(String nom, Type type, Integer valeur){
		this.nom = nom;
		this.type = type;
		this.valeur = valeur;
		this.listeFils = new ArrayList<Noeud>();
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
	public Integer getValeur() {
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
}
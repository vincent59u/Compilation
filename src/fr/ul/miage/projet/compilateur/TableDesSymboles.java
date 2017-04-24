package fr.ul.miage.projet.compilateur;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Class qui modélise la table des symboles (TDS) de notre compilateur
 * @authors Matthieu VINCENT, Martin LEMAITRE, Loic REISDOERFER, Mervine LIEFFROY.
 */
public class TableDesSymboles {
	protected HashMap<String, Symbole> tds;
	
	/**
	 * Constructeur de la classe TDS qui permet d'initialiser un HashMap.
	 */
	public TableDesSymboles(){
		this.tds = new HashMap<String, Symbole>();
	}
	
	/**
	 * Méthode qui permet d'ajouter un symbole dans la table des symboles
	 * @param sym
	 */
	public void ajouterSymbole(Symbole sym){
		this.tds.put("#" + this.tds.size(), sym);
	}
	
	/**
	 * Méthode qui permet de supprimer une entrée dans la table des symboles
	 * @param clef
	 */
	public void supprimerSymbole(String clef){
		this.tds.remove(clef);
	}
	
	/**
	 * Méthode qui permet de supprimer une entrée dans la table des symboles
	 * @param sym
	 */
	public void supprimerSymbole(Symbole sym){
		// On pacours la TDS tant que nous n'avons pas trouvé le symbole
		for(Entry<String, Symbole> entry : this.tds.entrySet()) {
		    String clef = entry.getKey();
		    Symbole symbole = entry.getValue();
		    // Si le symbole à supprimer se trouve dans la table
		    if(symbole.getNom() == sym.getNom() && symbole.getScope() == sym.getScope()){
		    	// On le supprime
		    	this.supprimerSymbole(clef);
		    	// On arrête le parcours de la TDS
		    	break;
		    }   
		}
	}
	
	/**
	 * Getter qui permet de retourner un symbole présent dans la table des symboles
	 * @param clef
	 * @return Symbole
	 */
	public Symbole getSymbole(String clef){
		
		return this.tds.get(clef);
	}
	
	/**
	 * Getter qui permet de retourner un symbole présent dans la table des symboles
	 * @param sym
	 * @return Symbole
	 */
	public Symbole findSymbole(String sym){
		// On pacours la TDS tant que nous n'avons pas trouvé le symbole
		for(Entry<String, Symbole> entry : this.tds.entrySet()) {
		    String clef = entry.getKey();
		    Symbole symbole = entry.getValue();
		    // Si le symbole à supprimer se trouve dans la table
		    if(symbole.getNom().equals(sym)){
		    	// On le supprime
		    	return this.getSymbole(clef);
		    }   
		}
		// Si le symbole n'existe pas, on return la valeur null;
		return null;
	}

	/**
	 * Getter qui permet de retourner la table des symboles
	 * @return tds
	 */
	public HashMap<String, Symbole> getTds() {
		return tds;
	}

	/**
	 * Setter qui permet de modifier la table des symboles
	 * @param tds
	 */
	public void setTds(HashMap<String, Symbole> tds) {
		this.tds = tds;
	}
	
	
}

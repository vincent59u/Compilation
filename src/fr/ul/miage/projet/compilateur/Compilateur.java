package fr.ul.miage.projet.compilateur;

import java.io.File;
import java.io.FileWriter;

/**
 * Class Compilateur qui permet de générer le code UASM dans le fichier texte de sortie
 * @authors Matthieu VINCENT, Martin LEMAITRE, Loic REISDOERFER, Mervine LIEFFROY.
 */
public class Compilateur {
	protected GenerateurUASM gen;
	protected TableDesSymboles tds;
	protected Noeud ast;
	
	/**
	 * Constructeur de la classe Compilateur
	 * @param tds
	 * @param ast
	 */
	public Compilateur(TableDesSymboles tds, Noeud ast) {
		this.tds = tds;
		this.ast = ast;
		this.gen = new GenerateurUASM(this.ast, this.tds);
	}
	
	/**
	 * Méthode qui permet d'écrire le code UASM dans le fichier texte de sortie
	 */
	public void genererUASM(){
		//Permet de récuperer les éventuelles erreurs
		try{
			// On crée le fichier cible
			File f = new File("samples/resultat/cible.uasm");
			f.createNewFile();
			FileWriter ffw=new FileWriter(f);
			// On écrit dans le fichier tout le code UASM qui a été généré
			ffw.write(gen.genererCodeUASM());
			ffw.close();
		} catch (Exception e) {
			System.out.println("Erreur à la création du fichier");
		}
		
	}
	
	
	
}

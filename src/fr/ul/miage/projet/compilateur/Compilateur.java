package fr.ul.miage.projet.compilateur;

import java.io.File;
import java.io.FileWriter;

public class Compilateur {
	protected GenerateurUASM gen;
	protected TableDesSymboles tds;
	protected Noeud ast;
	
	public Compilateur(TableDesSymboles tds, Noeud ast) {
		this.tds = tds;
		this.ast = ast;
		this.gen = new GenerateurUASM(this.ast, this.tds);
	}
	
	public void genererUASM(){
		try{
			File f=new File("samples/cible.uasm");
			f.createNewFile();
			FileWriter ffw=new FileWriter(f);
			ffw.write(gen.genererCodeUASM());
			ffw.close();
		} catch (Exception e) {
			System.out.println("Erreur à la création du fichier");
		}
		
	}
	
	
	
}

package fr.ul.miage.exemple;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import fr.ul.miage.exemple.generated.ParserCup;
import fr.ul.miage.exemple.generated.Yylex;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 1){
			System.err.println("il manque un argument");
			System.exit(1);
		}
		try {
			ParserCup parser = new ParserCup(new Yylex(new FileReader(args[0])));
			parser.parse();
			System.out.println("Analyse terminé avec succès");
		} catch (Exception e) {
			System.err.println("Erreur de syntaxe :");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}

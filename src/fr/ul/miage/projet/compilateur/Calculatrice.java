package fr.ul.miage.projet.compilateur;

public class Calculatrice {

	public static void traduire(String formule){
		Calculator a = new Calculator ();
		System.out.println(a.traduire(formule));
	}
	
	
	public static void main(String[] args) {
	}
}


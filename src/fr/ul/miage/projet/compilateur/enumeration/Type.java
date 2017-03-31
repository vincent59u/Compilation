package fr.ul.miage.projet.compilateur.enumeration;

/**
 * Enum qui permet de lister les différents type de noeud qu'il est possible de créer dans l'AST (arbre syntaxique)
 * @authors Matthieu VINCENT, Martin LEMAITRE, Loic REISDOERFER, Mervine LIEFFROY.
 */
public enum Type {
	PRINC,
	FONCT,
	PROG,
	ADD,
	MUL,
	MOINS,
	DIV,
	SI,
	TANTQUE,
	POUR,
	CONST,
	VAR,
	LIRE,
	ECRIRE;
}

/*
 * Projet de compilation L3 Miage :
 * Ecriture d'un compilateur
 *
 * auteurs : Matthieu VINCENT, Martin LEMAITRE, Loic REISDOERFER, Mervine LIEFFROY
 * (c) 2017
 */


package fr.ul.miage.projet.generated;
import java_cup.runtime.Symbol;


%%

/* options */
%line
%public
%cup
%debug


/* macros */
NUM = [0-9]+
NOM = [a-zA-Z][a-zA-Z0-9]*
COM = \/\/[^\n]*|\/\*(([^*])|(\*[^/]))*\*\/
SEP = [ \t]|\n|\r|\r\n
OPBOOL = ==|<|>|<=|>=|\!=|\! 

%%

/* regles */

"("			{ return new Symbol(sym.PO); }
")"			{ return new Symbol(sym.PF); }
"{"			{ return new Symbol(sym.AO); }
"}"			{ return new Symbol(sym.AF); }
"*"			{ return new Symbol(sym.MUL); }
"/"			{ return new Symbol(sym.DIV); }
"-"			{ return new Symbol(sym.MOINS); }
"+"			{ return new Symbol(sym.PLUS); }
"="			{ return new Symbol(sym.EG); }
";"			{ return new Symbol(sym.PV); }
","			{ return new Symbol(sym.V); }
"ecrire"	{ return new Symbol(sym.ECRIRE); }
"lire"	{ return new Symbol(sym.LIRE); }
"tantQue"	{ return new Symbol(sym.TQ); }
"si"		{ return new Symbol(sym.SI); }
"sinon"		{ return new Symbol(sym.SINON); }
"loc"		{ return new Symbol(sym.LOC); }
"retourner" { return new Symbol(sym.RET); }
"glob"		{ return new Symbol(sym.GLOB); }
"entier"    { return new Symbol(sym.ENTIER); }
"fonction"	{ return new Symbol(sym.FONCTION); }
"principal"	{ return new Symbol(sym.PRINC); }
"appel"		{ return new Symbol(sym.APPEL,yytext()); }
{NUM}		{ return new Symbol(sym.NUM,yytext()); }
{NOM}		{ return new Symbol(sym.NOM,yytext()); }
{COM}		{ return new Symbol(sym.COM); }
{OPBOOL}	{ return new Symbol(sym.OPBOOL);}
{SEP}		{ ; }

.			{ return null; }



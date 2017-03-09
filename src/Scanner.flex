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
COM = \/\/[^\n]*
COMMULTI = \/\*(([^*])|(\*[^/]))*\*\/
NOM = [a-zA-Z]+[\w]*
SEP = [ \t]
OPBOOL = ==|<|>|<=|>=|=\!|\!


%%

/* règles */

"("			{ return new Symbol(sym.PO); }
")"			{ return new Symbol(sym.PF); }
"{"			{ return new Symbol(sym.AO); }
"}"			{ return new Symbol(sym.AF); }
"="			{ return new Symbol(sym.EG); }
";"			{ return new Symbol(sym.PV); }
","			{ return new Symbol(sym.V); }
"!="		{ return new Symbol(sym.DIFF); }
"+"			{ return new Symbol(sym.PLUS); }
"++"        { return new Symbol(sym.PP); }
"-"			{ return new Symbol(sym.MOINS); }
"--"		{ return new Symbol(sym.MM); }
"*"			{ return new Symbol(sym.MUL); }
"/"			{ return new Symbol(sym.DIV); }
">"			{ return new Symbol(sym.SUP); }
"<"			{ return new Symbol(sym.INF); }
">="		{ return new Symbol(sym.SUPEG); }
"<="		{ return new Symbol(sym.INFEG); }
"=="		{ return new Symbol(sym.EGEG); }
"loc"		{ return new Symbol(sym.LOC); }
"glob"		{ return new Symbol(sym.GLOB); }
"entier"    { return new Symbol(sym.ENTIER); }
"fonction"	{ return new Symbol(sym.FONCTION); }
"appel"		{ return new Symbol(sym.APPEL); }
"lire()"	{ return new Symbol(sym.LIRE); }
"ecrire"	{ return new Symbol(sym.ECR); }
"retourner" { return new Symbol(sym.RET); }
"si"		{ return new Symbol(sym.SI); }
"sinon"		{ return new Symbol(sym.SINON); }
"tantQue"	{ return new Symbol(sym.TQ); }
"pour"		{ return new Symbol(sym.POUR); }
"principal"	{ return new Symbol(sym.PRINC); }
{COM}		{ return new Symbol(sym.COM); }
{COMMULTI}	{ return new Symbol(sym.COMMULTI); }
{NUM}		{ return new Symbol(sym.NUM); }
{NOM}		{ return new Symbol(sym.NOM); }
{OPBOOL}		{ return new Symbol(sym.OPBOOL); }
{SEP}		{ ; }

.			{ return null; }
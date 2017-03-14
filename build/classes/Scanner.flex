
package fr.ul.miage.exemple.generated;
import java_cup.runtime.Symbol;


%%

/* options */
%line
%public
%cup
%debug


/* macros */

NUM = [0-9]+
COM = \/\/[^\n]*|\/\*(([^*])|(\*[^/]))*\*\/
NOM = [a-zA-Z]+[\w]*([a-zA-Z]|[0-9])*
SEP = [ \t]|\n|\r|\r\n
OP	= ([0-9]+|[a-zA-Z]+)([\+\-\/\*]([0-9]+|[a-zA-Z]+))*

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

"loc"		{ return new Symbol(sym.LOC); }
"retourner" { return new Symbol(sym.RET); }
"glob"		{ return new Symbol(sym.GLOB); }
"entier"    { return new Symbol(sym.ENTIER); }

"fonction"	{ return new Symbol(sym.FONCTION); }
"principal"	{ return new Symbol(sym.PRINC); }


{NUM}		{ return new Symbol(sym.NUM); }
{NOM}		{ return new Symbol(sym.NOM); }
{COM}		{ return new Symbol(sym.COM); }
{OP}		{ return new Symbol(sym.OP); }
{SEP}		{ ; }

.			{ return null; }






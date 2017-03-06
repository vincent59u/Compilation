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


%%

/* règles */

.			{ return null; }
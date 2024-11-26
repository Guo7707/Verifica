/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lombardo_verifica;

import java.util.Scanner;

/**
 *
 * @author Lombardo Guido
 */

/*
Salve a tutti!, questo programma gestisce una scuola con studenti e docenti. 
Ogni studente ha cognome, nome, e 3 tre voti (1 per ogni materia), mentre ogni 
docente ha un cognome e una materia che insegna.
 */
 /*
Il programma permette di aggiungere e visualizzare tutti i docenti fino a un 
massimo di 3, gli studenti e i voti degli studenti, la media aritmetica dei voti
degli studenti, dicendo se lo studente ha avuto un debito nella materia oppure 
non lo ha ricevuto e dice anche se allo studente mancano dei voti.
 */
public class Scuola {

    public static void main(String[] args) {
        //Stampa
        System.out.println("La scuola e' composta da 3 studenti:");
        //richiamo oggetti
        Studenti studente1 = new Studenti();
        Studenti studente2 = new Studenti();
        Studenti studente3 = new Studenti();
        studente1.Cognome="Lombardo";
        studente1.Nome="Guido";
        studente1.StampaStudenti();
        studente1.VotoInformatica=10;
        studente1.VotoMatematica=7;
        studente1.VotoStoria=6.5;
        studente1.CalcoloDebiti();
        studente1.CalcoloMedia();
        studente2.Cognome="Gallo";
        studente2.Nome="Andrea";
        studente2.StampaStudenti();
        studente2.VotoInformatica=3;
        studente2.VotoMatematica=6;
        studente2.VotoStoria=5.75;
        studente2.CalcoloDebiti();
        studente2.CalcoloMedia();
        studente3.Cognome="Bianco";
        studente3.Nome="Mario";
        studente3.StampaStudenti();
        studente3.VotoInformatica=6;
        studente3.VotoMatematica=2;
        studente3.VotoStoria=8.5;
        studente3.CalcoloDebiti();
        studente3.CalcoloMedia();
        System.out.println("La scuola e' composta da 3 docenti:");
        Docenti docente1 = new Docenti();
        Docenti docente2 = new Docenti();
        Docenti docente3 = new Docenti();
        docente1.Cognome="Rossi";
        docente1.Nome="Giuseppe";
        docente1.Materia="Matematica";
        docente1.StampaDocenti();
        docente2.Cognome="Gialli";
        docente2.Nome="Tommaso";
        docente2.Materia="Informatica";
        docente2.StampaDocenti();
        docente3.Cognome="Verdi";
        docente3.Nome="Manuela";
        docente3.Materia="Storia";
        docente3.StampaDocenti();
               
       
        
    }

}

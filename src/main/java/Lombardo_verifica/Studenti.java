package Lombardo_verifica;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lombardo Guido
 */
public class Studenti {
    //Creazione degli attributi della classe

    public String Cognome;
    public String Nome;
    public double VotoInformatica;
    public double VotoMatematica;
    public double VotoStoria;
    public double Media;

    //Creazione metodo di calcolo dei debiti
    public void CalcoloDebiti() {
        if (VotoInformatica < 6) {
            System.out.println("Lo studente " + Cognome + " ha un debito in Informatica!");
        }
        if (VotoMatematica < 6) {
            System.out.println("Lo studente " + Cognome + " ha un debito in Matematica!");
        }
        if (VotoStoria < 6) {
            System.out.println("Lo studente " + Cognome + " ha un debito in Storia!");
        }
        if (VotoInformatica > 6 && VotoMatematica > 6 && VotoStoria > 6) {
            System.out.println("Lo studente " + Cognome + " non ha debiti!!");
        }
    }

    //Creazione metodo di calcolo della media
    public void CalcoloMedia() {
        Media = (VotoInformatica + VotoMatematica + VotoStoria) / 3;
        System.out.println("La  media dello studente e': " + Media);
    }

    //Creazione metodo di stampa dei docenti
    public void StampaStudenti() {

        System.out.println("Uno studente si chiama " + Cognome + " " + Nome);
    }

}

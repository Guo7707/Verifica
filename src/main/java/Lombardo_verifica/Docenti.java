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
public class Docenti {
    //Creazione degli attributi della classe
    public String Cognome;
    public String Nome;
    public String Materia;
    //Creazione metodo di stampa dei docenti
    public void StampaDocenti(){
        System.out.println("Un Docente si chiama " +Cognome+ " " +Nome+ " e la sua materia e' " +Materia);
    }
    
}

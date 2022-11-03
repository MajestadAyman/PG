/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implemenació_de_java;

// Ayman Bourhim
/*  
   Nom: Ayman 
   Cognoms: Bourhim
   INS Manuel Vázquez Montalbán
   Data d'edició: 01/11/22
   Nom del Cicle Formatiu: Disseny d'Aplicació Web (DAW)
   Nom del mòdul: PG
 */
//Pre: El usuari introduix un valor.
import java.util.Scanner;

public class Ej_3g {

    private static final String MSG_1 = "Introduce un número: ";
    private static final String MSG_2 = "El número es par";
    private static final String MSG_3 = "El número es impar";

    public static void main(String[] args) {
        double num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextFloat();
        if (num % 2 == 0) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }

}
  //Post: El programa comprova el valor i informa si es parell o imparell.

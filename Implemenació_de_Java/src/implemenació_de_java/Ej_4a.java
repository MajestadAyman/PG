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
//Pre: El usuari introduix dos valors.
import java.util.Scanner;

public class Ej_4a {

    private static final String MSG_1 = "Introduce un número entre el 1 y el 12: ";
    private static final String MSG_2 = "El mes es enero";
    private static final String MSG_3 = "El mes es febrero";
    private static final String MSG_4 = "El mes es marzo";
    private static final String MSG_5 = "El mes es abril";
    private static final String MSG_6 = "El mes es mayo";
    private static final String MSG_7 = "El mes es junio";
    private static final String MSG_8 = "El mes es julio";
    private static final String MSG_9 = "El mes es agosto";
    private static final String MSG_10 = "El mes es septiembre";
    private static final String MSG_11 = "El mes es octubre";
    private static final String MSG_12 = "El mes es noviembre";
    private static final String MSG_13 = "El mes es diciembre";
    private static final String MSG_14 = "El número introducido no esta entre el 1 y el 12";

    public static void main(String[] args) {
        double num1;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        if (num1 == 1) {
            System.out.println(MSG_2);
        } else if (num1 == 2) {
            System.out.println(MSG_3);
        } else if (num1 == 3) {
            System.out.println(MSG_4);
        } else if (num1 == 4) {
            System.out.println(MSG_5);
        } else if (num1 == 5) {
            System.out.println(MSG_6);
        } else if (num1 == 6) {
            System.out.println(MSG_7);
        } else if (num1 == 7) {
            System.out.println(MSG_8);
        } else if (num1 == 8) {
            System.out.println(MSG_9);
        } else if (num1 == 9) {
            System.out.println(MSG_10);
        } else if (num1 == 10) {
            System.out.println(MSG_11);
        } else if (num1 == 11) {
            System.out.println(MSG_12);
        } else if (num1 == 12) {
            System.out.println(MSG_13);
        } else {
            System.out.println(MSG_14);
        }

    }
}
   
  //Post: El programa comprova el valor i et dona el mes.

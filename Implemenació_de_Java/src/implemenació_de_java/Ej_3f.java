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

public class Ej_3f {

    private static final String MSG_1 = "Introduce un número: ";
    private static final String MSG_2 = "Introduce otro número: ";
    private static final String MSG_3 = "El número es más pequeño que 15";
    private static final String MSG_4 = "El número es 15";
    private static final String MSG_5 = "El número es más grande que 15";

    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        System.out.println(MSG_2);
        num2 = sc.nextFloat();
        if (num1 % num2 > 15) {
            System.out.println(MSG_3);
        } else if (num1 % num2 == 15) {
            System.out.println(MSG_4);
        } else {
            System.out.println(MSG_5);
        }
    }

}
  //Post: El programa comprova el valor i informa al usuari si el mòdul del primer nombre i l'altre) és menor que 15 .

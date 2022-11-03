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

public class Ej_3k {

    private static final String MSG_1 = "Introduce un número: ";
    private static final String MSG_2 = "Introduce otro número: ";
    private static final String MSG_3 = "Són multiplos";
    private static final String MSG_4 = "No són multiplos";

    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        System.out.println(MSG_2);
        num2 = sc.nextFloat();
        if (num1 % num2 == 0) {
            System.out.println(MSG_3);
        } else {
            System.out.println(MSG_4);
        }
    }
}
   
  //Post: El programa comprova el valor i informa si els nombres són multiples o no.

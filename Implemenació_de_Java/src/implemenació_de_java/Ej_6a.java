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
//Pre: El usuari introduix un año y un mes.
import java.util.Scanner;

public class Ej_6a {

    private static final String MSG_1 = "Introduce un año: ";
    private static final String MSG_2 = "Introduce un mes";
    private static final String MSG_3 = "28";
    private static final String MSG_4 = "29";
    private static final String MSG_5 = "30";
    private static final String MSG_6 = "31";

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = (int) sc.nextFloat();
        num2 = (int) sc.nextFloat();
        if (num1 % 4 == 0 && num1 % 100 != 0 || num1 % 400 == 0) {
            if (num2 == 2) {
                System.out.println(MSG_4);
            } else if (num2 % 2 == 0 && num2 != 2) {
                System.out.println(MSG_6);
            } else if (num2 % 2 != 0) {
                System.out.println(MSG_5);
            }
        } else {
            if (num2 == 2) {
                System.out.println(MSG_3);
            } else if (num2 % 2 == 0 && num2 != 2) {
                System.out.println(MSG_6);
            } else if (num2 % 2 != 0) {
                System.out.println(MSG_5);
            }
        }
    }
}
  //Post: El programa comprova los dos valores i informa cuantos dias tiene es mes en ese año.

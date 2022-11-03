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
//Pre: El usuari introduix tres valors.
import java.util.Scanner;

public class Ej_3j {

    private static final String MSG_1 = "Introduce un número: ";
    private static final String MSG_2 = "Introduce otro número: ";
    private static final String MSG_3 = "El máxim  dels tres es:";
    private static final String MSG_4 = "Els dos numeros són iguals";

    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        System.out.println(MSG_2);
        num2 = sc.nextFloat();
        System.out.println(MSG_2);
        num3 = sc.nextFloat();
        if (num1 > num2 && num1 > num3) {
            System.out.print(MSG_3);
            System.out.println(num1);

        } else if (num2 > num1 && num2 > num3) {
            System.out.println(MSG_3);
            System.out.println(num2);
        } else {
            System.out.println(MSG_3);
            System.out.println(num3);
        }
    }

}
  //Post: El programa comprova el valor i informa al usuari quins dels tres valors es maxim.

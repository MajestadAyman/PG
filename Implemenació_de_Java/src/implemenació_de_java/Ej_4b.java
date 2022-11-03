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

public class Ej_4b {

    private static final String MSG_1 = "Introduce un número entre el 1 y el 12: ";

    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = (int) sc.nextFloat();
        switch (num1) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiempre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;

        }

    }
}
   
  //Post: El programa comprova el valor i et dona el mes.

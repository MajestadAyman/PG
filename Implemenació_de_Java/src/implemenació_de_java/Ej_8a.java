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
//Pre: El usuario introduce un número entero.
import java.util.Scanner;

public class Ej_8a {

    private static final String MSG_1 = "Introduce un número entero: ";
    private static final String MSG_2 = "Error, ese no es un 0, vuelve a introducir un número entero: ";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        while (num != 0) {
            System.out.println(MSG_2);
            num = sc.nextInt();

        }
    }
}
  //Post: El programa valida si es 0, en caso negativo vuelve a hacerlo hasta que se de la premisa.

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

public class Ej_3l {

    private static final String MSG_1 = "Introduce los litros de agua consumidos: ";
    private static final String MSG_2 = "La factura es 6 euros: ";

    public static void main(String[] args) {
        double num1, num2, num3;
        float cuota_fija = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        if (num1 >= 0 && num1 <= 50) {
            System.out.println(MSG_2);
        } else if (num1 > 50 && num1 <= 200) {
            num2 = (num1 * 0.1) + cuota_fija;
            System.out.println(num2);
        } else if (num1 > 200) {
            num3 = (num1 * 0.3) + cuota_fija;
            System.out.println(num3);
        }
    }
}
   
  //Post: El programa comprova el valor i informa cuant a de pagar de factura en euros.

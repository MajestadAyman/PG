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
//Pre: El usuario introduce un número uno tras otro.
import java.util.Scanner;

public class Ej_9 {

    private static final String MSG_1 = "Introduce números uno tras otro, cuando introduzcas 0, se calculara la media aritmética. \nIntroduce un numero:";
    private static final String MSG_2 = "Introduce otro numero:";
    private static final String MSG_3 = "La media es:";
    private static final String MSG_4 = "La media es 0";

    public static void main(String[] args) {
        double num1, num2;
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        if (num1 == 0) {
            System.out.println(MSG_4);

        } else {
            do {
                System.out.println(MSG_2);
                num2 = sc.nextInt();
                num1 = num1 + num2;
                count++;
            } while (num2!=0);
            System.out.print(MSG_3);
            System.out.println(num1 / count);
    

        
    


        }

    }
}
  //Post: El programa lee y guarda los valores que introduce el usuario, cuando introduce 0, le calcula la media de todos los valores juntos.

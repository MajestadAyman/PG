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

public class Ej_10 {

    private static final String MSG_1 = "Introduce dos numeros enteros, el primer més gran que el segon";
    private static final String MSG_2 = "Los números pares són:";
    private static final String MSG_3 = "";

    public static void main(String[] args) {
        double num1, num2;
        double num3=0; 
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        do{
            
          num3==(num1<num2 && num3%2==0);
          System.out.println(num3);
          
        }while (num3 <=num2);
      
        

    }
}
  //Post: El programa lee y guarda los valores que introduce el usuario, cuando introduce 0, le calcula la media de todos los valores juntos.

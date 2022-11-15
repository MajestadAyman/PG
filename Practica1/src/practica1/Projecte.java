/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;
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
        
public class Projecte {
    private static final String MSG_1 = "El tipus no es correcte";
    private static final String MSG_2 = "Quin es el teu tipus de venda?\n" + 
"venda lliure (0)  pensionista (1)  carnet jove (2)  soci (3)";
    private static final String MSG_3 = "Ok";
    
            public static void main (String[] args) {
                int tipusVenda;
                boolean tipusCorrecte;
                Scanner sc = new Scanner (System.in);
                System.out.println (MSG_2);
                tipusCorrecte = sc.hasNextInt();
               
                if(tipusCorrecte){
                    tipusVenda = sc.nextInt();
                    System.out.println(MSG_3);
                }
                else{
                System.out.println(MSG_1);
            }
                    
                
                        
                        
            }
}

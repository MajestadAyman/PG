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

public class ProjecteFinal {

    private static final String MSG_1 = "El tipus no es correcte";
    private static final String MSG_2 = "Quin és el teu id?";
    private static final String MSG_3 = "Quina és la teva edat?";
    private static final String MSG_4 = "Quin és el teu tipus de venda?\n"
            + "venda lliure (0)  pensionista (1)  carnet jove (2)  soci (3)";
    private static final String MSG_5 = "Quin és l'import de la compra?";
    private static final String MSG_6 = "Quin és el teu telefón de contacte?";
    private static final String MSG_7 = "Ok";
    private static final String MSG_8 = "Error, torna a posar-ho";
    private static final String MSG_9 = "Quantitat d'intents esgotada";
    private static final String MSG_10 = "És menor que 9 xifres, torna a posar-ho";
    

    public static void main(String[] args) {
        int id = 0;
        int edat = 0;
        int importcompra = 0;
        int telefoncontacte = 0;
        int tipusvenda = 0;
        int cont = 0;
        boolean tipusCorrecte = false;
        boolean Bien = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_2);
        do {
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                id = sc.nextInt();
                if (id >= 111 && id <= 999) {
                    Bien = true;
                } else {
                    System.out.println(MSG_8);
                    cont++;
                }

            } else {
                sc.next();
                System.out.println(MSG_1);
                cont++;
            }
            if (cont == 3) {
                Bien = true;
            }
        } while (Bien != true);
        if (cont == 3) {
            System.out.println(MSG_9);
        } else {
            System.out.println(MSG_7);
            Bien = false;
            cont = 0;
        }
        System.out.println(MSG_3);
        do {
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                edat = sc.nextInt();
                if (edat >= 14 && edat <= 120) {
                    Bien = true;
                } else {
                    System.out.println(MSG_8);
                    cont++;
                }

            } else {
                sc.next();
                System.out.println(MSG_1);
                cont++;
            }
            if (cont == 3) {
                Bien = true;
            }
        } while (Bien != true);
        if (cont == 3) {
            System.out.println(MSG_9);
        } else {
            System.out.println(MSG_7);
            Bien = false;
            cont = 0;
        }
        System.out.println(MSG_4);
        do {
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                tipusvenda = sc.nextInt();
                switch (tipusvenda) {
                    case 0:
                        System.out.println(MSG_7);
                        tipusvenda = sc.nextInt();
                        Bien = true;
                        break;
                    case 1:
                        System.out.println(MSG_7);
                        tipusvenda = sc.nextInt();
                        Bien = true;
                        break;
                    case 2:
                        System.out.println(MSG_7);
                        tipusvenda = sc.nextInt();
                        Bien = true;
                        break;
                    case 3:
                        System.out.println(MSG_7);
                        tipusvenda = sc.nextInt();
                        Bien = true;
                        break;
                    default:
                        System.out.println(MSG_8);
                        cont++;
                        break;
                }
                
            }
            else{
                    sc.next();
                    System.out.println(MSG_8);
                    cont++;
                }
                if(cont == 3)
                    Bien = true;
        } while (Bien != true);
        if (cont == 3){
            System.out.println(MSG_9);
    }
        else{
//Aqui creo que habria que limpiar el buffer, pero no encuentro el comando.
//I sinceramente,mejor así, me da miedo por si se rompe todo.
            cont = 0;
            Bien =false;
        }
        System.out.println(MSG_5);
        do {
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                importcompra = sc.nextInt();
                if (importcompra >= 0 && importcompra <= 1000) {
                    Bien = true;
                } else {
                    System.out.println(MSG_8);
                    cont++;
                }

            } else {
                sc.next();
                System.out.println(MSG_1);
                cont++;
            }
            if (cont == 3) {
                Bien = true;
            }
        } while (Bien != true);
        if (cont == 3) {
            System.out.println(MSG_9);
        } else {
            System.out.println(MSG_7);
            Bien = false;
            cont = 0;
        }
        System.out.println(MSG_6);
        do {
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                telefoncontacte = sc.nextInt();
            if(telefoncontacte>=99999999)
                if (telefoncontacte >= 111111111 && telefoncontacte <= 999999999) {
                    Bien = true;
                } else {
                    System.out.println(MSG_8);
                    cont++;
                }

            } else {
                sc.next();
                System.out.println(MSG_1);
                cont++;
            }
            if (cont == 3) {
                System.out.println(MSG_9);
                Bien = true;
            }
            else{
                System.out.println(MSG_10);
                cont++;
            }
            if (cont == 3) {
                Bien = true;
            }
        } while (Bien != true);
        if (cont == 3) {
            System.out.println(MSG_9);
        } else {
            System.out.println(MSG_7);
            System.out.print(id + " ");
            System.out.print(edat + " ");
            System.out.print(tipusvenda + " ");
            System.out.print(importcompra + " ");
            System.out.print(telefoncontacte + " ");

        }
        
    }
}

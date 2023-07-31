/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programation.secondpractice;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Number_05 {

    //5. Hallar el mayor de 6 números ingresados por el usuario 
    //   los números pueden ser iguales.
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int aux;
        int accountant = 1;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("THE HIGHEST");
        while (!flag) { 
            try {
                do {
                    System.out.println("Insert the number: " + accountant);
                    String auxiliar1 = reader.nextLine();
                    aux = Integer.parseInt(auxiliar1);
                    if (aux > max) {
                        max = aux;
                    }
                    accountant++;
                } while (accountant <= 6);
                flag = true;

            } catch (NumberFormatException e) {
                System.out.println("You have to insert an integer number");
            }
        }
        System.out.println("The highest number is: " + max);
    }
}

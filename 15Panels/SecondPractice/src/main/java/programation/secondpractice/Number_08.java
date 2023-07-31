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
public class Number_08 {

    //8.Invertir el primer y último dígito de un número cualquiera. 
    //  El número ingresado debe tener al menos dos dígitos.
    public static void main(String[] args) {
        String texto = "", intro = "", middle = "", last = "";
        int number = 0;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("THE FIRST TO THE LAST");
        while (!flag) { // flag == false
            try {
                System.out.println("Insert your number");
                texto = reader.nextLine();
                number = Integer.parseInt(texto);
                flag = true;
                if (flag = true) {
                    if (number >= 10) {
                        intro = texto.substring(0, 1);
                        middle = texto.substring(1, texto.length() - 1);
                        last = texto.substring(texto.length() - 1);
                    } else {
                        System.out.println("Please, more than 2 characters and"
                                + " a positive number");
                        flag = false;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("You have to insert an integer number");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("After the exchange");
        System.out.println(last + middle + intro);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programation.secondpractice;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Number_15 {

    //15. Dado un número entero cualquiera, invertirlo.
    public static void main(String[] args) {
        String texto = "", result = "";
        int number;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("INVERT NUMBER");
        while (!flag) { // flag == false
            try {
                System.out.println("Insert your number");
                texto = reader.nextLine();
                number = Integer.parseInt(texto);
                flag = true;
                if (flag == true) {
                    if (number > 0) {
                        for (int i = texto.length() - 1; i >= 0; i--) {
                            result += texto.charAt(i);
                        }
                    } else {
                        System.out.println("Insert a positive number");
                        flag = false;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("You have to insert a integer number");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("After the exchange");
        System.out.println(result);
    }
}

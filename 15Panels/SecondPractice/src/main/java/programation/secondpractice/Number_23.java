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
public class Number_23 {

    //23. Generar un programa que reemplace los caracteres pares de una palabra ingresada por el usuario por un
    //    *. Ejemplo: Prueba de texto → P*u*b* *e*t*x*o
    public static void main(String[] args) {
        String text = "";
        int count = 2;
        float number;
        Scanner reader = new Scanner(System.in);
        boolean flag = false;
        System.out.println("THE ASTERISK");
        while (!flag) { 
            try {
                System.out.println("Insert the text");
                text = reader.nextLine();
                number = Float.parseFloat(text);
                if ((number <= 0) || (number >= 0)) {
                    System.out.println("Insert a text no a number");
                }
            } catch (NumberFormatException e) {
                flag = true;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("After the change");
        for (int i = 1; i <= text.length(); i++) {
            String part = text.substring(i - 1, i);
            if (i != count) {
                System.out.print(part);
            } else {
                System.out.print("*");
                count += 2;
            }
        }
    }
}

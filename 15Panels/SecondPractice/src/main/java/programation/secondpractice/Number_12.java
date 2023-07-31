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
public class Number_12 {

    //12. Generar los primeros n elementos de la serie de Fibonacci: 
    //    0, 1, 1, 2, 3, 5, 8, 13, 21, ...
    public static void main(String[] args) {
        int number = 0, i = 1, a = 0, b = 1, s = 0;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("SERIE FIBONACCI");
        while (!flag) { // flag == false
            try {
                System.out.println("Insert your limit");
                String auxiliar = reader.nextLine();
                number = Integer.parseInt(auxiliar);
                if (number > 0) {
                    flag = true;
                } else {
                    System.out.println("Insert a positive number");
                }
            } catch (NumberFormatException e) {
                System.out.println("You have to insert an integer number");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        while (i <= number) {
            System.out.print(s + ",");
            s = a + b;
            a = b;
            b = s;
            i = i + 1;
        }
        System.out.println("...");
    }
}

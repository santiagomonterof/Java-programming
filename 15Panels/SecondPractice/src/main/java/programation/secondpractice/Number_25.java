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
public class Number_25 {
    
    //25. Generar la siguiente figura en pantalla. Si N → 4:
    //            1
    //           12
    //           123
    //          1234
    //          1234
    //           123
    //           12
    //            1
    public static void main(String[] args) {
        int x = 0;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("FIGURE 2");
        while (!flag) { // flag == false
            try {
                System.out.println("Insert your limit");
                String auxiliar1 = reader.nextLine();
                x = Integer.parseInt(auxiliar1);
                if (x > 0) {
                    flag = true;
                } else {
                    System.out.println("Insert a positive number");
                    flag = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("The number that you insert have to be integer");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        int less = x;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= less; j++) {
                System.out.print(" ");

            }
            for (int d = 1; d <= i; d++) {
                System.out.print(d + " ");
            }
            System.out.println(" ");
            System.out.println(" ");
            less = less - 1;
        }
        int lesser = x;
        int counter = 1;
        for (int i = 1; i <= x; i++) {
            for (int d = 1; d <= counter; d++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= lesser; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
            System.out.println(" ");
            lesser = lesser - 1;
            counter = counter + 1;
        }
    }
}

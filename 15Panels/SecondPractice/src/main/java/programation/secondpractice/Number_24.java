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
public class Number_24 {

    //24. Generar la siguiente figura en pantalla: N →5
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    public static void main(String[] args) {
        int x = 0;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("FIGURE 1");
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
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                for (int k = 1; k <= j; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}

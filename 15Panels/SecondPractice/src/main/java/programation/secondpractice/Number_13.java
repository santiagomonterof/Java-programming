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
public class Number_13 {

    //13. Generar la serie: 1 12 123 1234 12345 Hasta el número ingresado.
    public static void main(String[] args) {
        int number = 0;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("SERIE 1 12 123 1234 12345...");
        while (!flag) {
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
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print(" ");
        }
    }
}

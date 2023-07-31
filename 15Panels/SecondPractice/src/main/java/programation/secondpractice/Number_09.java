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
public class Number_09 {

    //9. Ingresar un número y devolver la tabla de multiplicar (hasta el 10) 
    //   desde el 1 hasta el número ingresado
    public static void main(String[] args) {
        int number = 0;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("MULTIPLICATION TABLE");
        while (!flag) { 
            try {
                System.out.println("Insert your number");
                String auxiliar1 = reader.nextLine();
                number = Integer.parseInt(auxiliar1);
                if (number > 0) {
                    flag = true;
                } else {
                    System.out.println("The number has to be positive");
                }
            } catch (NumberFormatException e) {
                System.out.println("You have to insert an integer number");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("The table of: " + number);
        for (int i = 1; i <= number; i++) {
            System.out.println(i + " * " + number + " = " + i * number);
        }
    }
}

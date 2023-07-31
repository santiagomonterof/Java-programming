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
public class Number_10 {

    //10. Leer un número y verificar si es primo.
    public static void main(String[] args) {
        int number = 0, counter = 1, result, comparator = 0;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("IT'S PRIME ?");
        while (!flag) { 
            try {
                System.out.println("Insert your number");
                String auxiliar1 = reader.nextLine();
                number = Integer.parseInt(auxiliar1);
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
        while (counter <= number) {
            result = number % counter;
            if (result == 0) {
                comparator++;
            }
            counter += 1;
        }
        if (comparator == 2) {
            System.out.println("It´s prime");
        } else {
            System.out.println("It´s not prime");
        }
    }
}

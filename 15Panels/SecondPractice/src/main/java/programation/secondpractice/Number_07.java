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
public class Number_07 {

    //7. Calcular el producto los N primeros números naturales
    public static void main(String[] args) {
        long number = 0, trunk = 1, counter = 1;
        Scanner reader = new Scanner(System.in);
        boolean flag = false;
        System.out.println("THE PRODUCT OF N NUMBERS");
        while (!flag) { // flag == false
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
                System.out.println("You have to insert a integer number");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        while (counter <= number) {
            trunk = trunk * counter;
            counter++;
        }
        System.out.println("The product of " + number + " is " + trunk);
    }
}

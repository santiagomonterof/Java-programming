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
public class Number_04 {

    //4. Leer un número cualquiera y mostrar si es: 
    //   neutro, positivo o negativo.
    public static void main(String[] args) {
        int number = 0;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("POSITIVE,NEGATIVE OR NEUTRAL ?");
        while (!flag) { 
            try {
                System.out.println("Insert your number");
                String auxiliar1 = reader.nextLine();
                number = Integer.parseInt(auxiliar1);
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("The number that you insert has to be integer");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if (number == 0) {
            System.out.println("The number " + number + " is neutral. ");
        } else {
            if (number >= 0) {
                System.out.println("The number " + number + " is positive. ");
            } else {
                System.out.println("The number " + number + " is negative. ");
            }
        }
    }
}

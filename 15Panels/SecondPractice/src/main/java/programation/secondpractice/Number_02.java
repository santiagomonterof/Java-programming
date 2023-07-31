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
public class Number_02 {

    //2. Intercambiar los valores de A y B sin utilizar una variable auxiliar.
    public static void main(String[] args) {
        int a = 0, b = 0;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("EXCHANGE OF VALUES");
        while (!flag) { 
            try {
                System.out.println("Insert your first number");
                String auxiliar1 = reader.nextLine();
                a = Integer.parseInt(auxiliar1);
                if (a > 0) {
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("The number that you insert has to be integer");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        flag = false;
        while (!flag) { // flag == false
            try {
                System.out.println("Insert your second number");
                String auxiliar2 = reader.nextLine();
                b = Integer.parseInt(auxiliar2);
                if (b > 0) {
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("The number that you insert has to be integer");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        // a = 32
        // b = 10
        b = a - b; //22 
        a = a - b; //10
        b = b + a;
        System.out.println("        " + "-=[+]=-");
        System.out.println("After the exchange");
        System.out.println("A. " + a);
        System.out.println("B. " + b);
    }
}

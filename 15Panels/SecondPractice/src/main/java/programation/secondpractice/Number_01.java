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
public class Number_01 {

    //1. Escribir las instrucciones necesarias para intercambiar entre si 
    //   los valores de 3 variables:
    //     B toma el valor de A
    //     C toma el valor de B
    //     A toma el valor de C
    //Nota. Sólo se debe utilizar una variable auxiliar.
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, aux;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("EXCHANGE OF NUMBERS");
        while (!flag) { // flag == false
            try {
                System.out.println("Insert your first number");
                String auxiliar1 = reader.nextLine();
                a = Integer.parseInt(auxiliar1);
                if (a > 0) {
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("The number that you insert have to be integer");
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
                System.out.println("The number that you insert have to be integer");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        flag = false;
        while (!flag) { // flag == false
            try {
                System.out.println("Insert your third number");
                String auxiliar3 = reader.nextLine();
                c = Integer.parseInt(auxiliar3);
                if (c > 0) {
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("The number that you insert have to be integer");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        aux = a;
        a = b;
        b = c;
        c = aux;
        System.out.println("        " + "-=[+]=-");
        System.out.println("After the exchange");
        System.out.println("A. " + a);
        System.out.println("B. " + b);
        System.out.println("C. " + c);
    }
}

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
public class Number_03 {

    //3. Convertir Pesos Mexicanos a bolivianos. 
    //   Tenga en cuenta el tipo de cambio actual
    public static void main(String[] args) {
        int money = 0;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("MXN TO BS");
        while (!flag) {
            try {
                System.out.println("Insert your number");
                String auxiliar1 = reader.nextLine();
                money = Integer.parseInt(auxiliar1);
                if (money > 0) {
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
        double Bs = 0.30;
        double exchange = (double) money * Bs;
        System.out.println("After the change");
        System.out.println(money + " MXN " + "are in total " + exchange + "Bs");
    }
}

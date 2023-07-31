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
public class Number_11 {

    //11. Verificar si un número entero es capicúa
    public static void main(String[] args) {
        String texto = "", result = "";
        int number;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("CAPICUA");
        while (!flag) {
            try {
                System.out.println("Insert your number");
                texto = reader.nextLine();
                number = Integer.parseInt(texto);
                flag = true;
                if (flag == true) {
                    if (number >= 0) {
                        for (int i = texto.length() - 1; i >= 0; i--) {
                            result += texto.charAt(i);
                        }
                    } else {
                        System.out.println("Insert a positive number");
                        flag = false;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("You have to insert a integer number");
            } catch (Exception e) {
                System.out.println();
            }
        }
        if (result.equals(texto)) {
            System.out.println("It's capicua");
        } else {
            System.out.println("It's not capicua");
        }
    }
}

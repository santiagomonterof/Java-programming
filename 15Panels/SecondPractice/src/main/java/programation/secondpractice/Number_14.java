package programation.secondpractice;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Number_14 {

    //14. Dado un número entero cualquiera, mostrar la cantidad de dígitos que tiene.
    public static void main(String[] args) {
        String texto;
        int number = 0;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("HOW MANY DIGITS DOES IT HAVE?");
        while (!flag) {
            try {
                System.out.println("Insert your number");
                texto = reader.nextLine();
                number = Integer.parseInt(texto);
                flag = true;
                if (flag = true) {
                    if (number > 0) {
                        number = texto.length();
                    } else {
                        System.out.println("Insert a positive number");
                        flag = false;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("You have to insert a integer number");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("The group of numbers have " + number + " digits");
    }
}

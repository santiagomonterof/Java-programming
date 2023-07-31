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
public class Number_06 {

    //6. Leer un número entre 1 y 12 y luego mostrar su mes equivalente, es decir: enero, febrero, marzo, ...,
    //   noviembre o diciembre. También un mensaje de ERROR.
    public static void main(String[] args) {
        int number = 0;
        boolean flag = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("THE MONTH OF THE YEAR");
        while (!flag) { 
            try {
                System.out.println("Insert your number");
                String auxiliar1 = reader.nextLine();
                number = Integer.parseInt(auxiliar1);
                if (number > 0 && number <= 12) {
                    flag = true;
                } else {
                    System.out.println("Insert a number between 1-12");
                }
            } catch (NumberFormatException e) {
                System.out.println("You have to insert a integer number");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        switch (number) {
            case 1:
                System.out.println("You are in January");
                break;
            case 2:
                System.out.println("You are in February");
                break;
            case 3:
                System.out.println("You are in March");
                break;
            case 4:
                System.out.println("You are in April");
                break;
            case 5:
                System.out.println("You are in May");
                break;
            case 6:
                System.out.println("You are in June");
                break;
            case 7:
                System.out.println("You are in July");
                break;
            case 8:
                System.out.println("You are in August");
                break;
            case 9:
                System.out.println("You are in September");
                break;
            case 10:
                System.out.println("You are in October");
                break;
            case 11:
                System.out.println("You are in November");
                break;
            case 12:
                System.out.println("You are in December");
                break;
        }
    }
}

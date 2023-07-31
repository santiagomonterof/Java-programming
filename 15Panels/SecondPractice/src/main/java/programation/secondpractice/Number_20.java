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
public class Number_20 {

    //20. Escribir un programa que convierta una fecha ingresada a su forma formal. 
    //    Ejemplo: 12/05/2020 --> 12 de Mayo de 2020.
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = 1;
        int number = 0;
        String date = "";
        String part1 = "";
        String part2 = "";
        String part22 = "";
        String part3 = "";
        boolean flag = false;
        System.out.println("THE DATE");
        while (!flag) {
            //  0 6 / 0 4 / 2 0 2 0
            // 0 1 2 3 4 5 6 7 8 9 0
            try {
                System.out.println("Insert the date. Example: 05/04/2020");
                date = reader.nextLine();
                number = Integer.parseInt(date);
            } catch (NumberFormatException e) {
                if (date.substring(2, 3).equals("/") && date.substring(5, 6).equals("/")) {
                    flag = true;
                } else {
                    System.out.println("You have to insert like the example");
                }
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("You have to insert like the example");
            }
        }
        for (int i = 0; i < date.length(); i++) {
            if (part1.equals("")) {
                if (date.charAt(i) == '/') {
                    part1 = date.substring(0, i);
                    count += i;
                }
            } else if (part2.equals("")) {
                if (date.charAt(i) == '/') {
                    part2 = date.substring(count, i);
                }
            } else {
                part3 += date.charAt(i);
            }
        }
        switch (part2) {
            case "01":
                part22 = "January";
                break;
            case "02":
                part22 = "February";
                break;
            case "03":
                part22 = "March";
                break;
            case "04":
                part22 = "April";
                break;
            case "05":
                part22 = "May";
                break;
            case "06":
                part22 = "June";
                break;
            case "07":
                part22 = "July";
                break;
            case "08":
                part22 = "August";
                break;
            case "09":
                part22 = "September";
                break;
            case "10":
                part22 = "October";
                break;
            case "11":
                part22 = "November";
                break;
            case "12":
                part22 = "December";
                break;
        }

        System.out.println("The result is: " + part1 + " de " + part22 + " del " + part3);
    }

}

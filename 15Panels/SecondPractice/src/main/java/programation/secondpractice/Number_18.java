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
public class Number_18 {

    //18. Escribir un programa que codifique y descodifique según el cifrado ROT13
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String total = "abcdefghijklmnopqrstuvwxyz";
        String total1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //   a b c d e f g h i j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
        //  0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
        String up = "abcdefghijklm";
        String down = "nopqrstuvwxyz";
        String up1 = "ABCDEFGHIJKLM";
        String down1 = "NOPQRSTUVWXYZ";
        String text = "";
        int number = 0;
        String word = "";
        String encryption = "";
        float number1;
        boolean flag = false;
        System.out.println("ROT13");
        while (!flag) { // flag == false
            try {
                System.out.println("Insert the text");
                text = reader.nextLine();
                number1 = Float.parseFloat(text);
                if ((number1 <= 0) || (number1 >= 0)) {
                    System.out.println("Insert a text no a number");
                }
            } catch (NumberFormatException e) {
                flag = true;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        //MAGIC!
        for (int i = 0; i < text.length(); i++) {
            word = text.substring(i, i + 1);
            number = total.indexOf(word);
            if (number != -1) {
                if (number <= 12) {
                    encryption += down.charAt(number);
                } else {

                    number = number - 13;
                    encryption += up.charAt(number);
                }
            }
            number = total1.indexOf(word);
            if (number != -1) {
                if (number <= 12) {
                    encryption += down1.charAt(number);
                } else {
                    number = number - 13;
                    encryption += up1.charAt(number);
                }
            }
            if (word.equals(" ")) {
                encryption += " ";
            }
        }
        System.out.println("After the exchange");
        System.out.print(encryption);
    }
}

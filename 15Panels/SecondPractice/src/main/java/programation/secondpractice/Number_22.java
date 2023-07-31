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
public class Number_22 {

    //22. Escribir un programa que cuente la cantidad de vocales que tiene el texto ingresado por el usuario:
    //    Ejemplo: Mensajes secretos → Tiene 6 vocales
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text = "";
        float number;
        boolean flag = false;
        int trunk = 0;
        while (!flag) { 
            System.out.println("VOWELS");
            try {
                System.out.println("Insert the text");
                text = reader.nextLine();
                number = Float.parseFloat(text);
                if ((number <= 0) || (number >= 0)) {
                    System.out.println("Insert a text no a number");
                }
            } catch (NumberFormatException e) {
                flag = true;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        for (int posicion = 1; posicion <= text.length(); posicion++) {
            String word = text.substring(posicion - 1, posicion);
            switch (word) {
                case "a":
                    trunk++;
                    break;
                case "e":
                    trunk++;
                    break;
                case "i":
                    trunk++;
                    break;
                case "o":
                    trunk++;
                    break;
                case "u":
                    trunk++;
                    break;
                case "A":
                    trunk++;
                    break;
                case "E":
                    trunk++;
                    break;
                case "I":
                    trunk++;
                    break;
                case "O":
                    trunk++;
                    break;
                case "U":
                    trunk++;
                    break;
            }
        }
        System.out.println("The message has " + trunk + " vowels");
    }
}

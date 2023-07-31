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
public class Number_17 {

    //17.Escribir un programa que reciba una llave de cifrado, luego solicite al usuario un texto para codificar 
    //   y devuelva el texto codificado según la llave. La llave no puede tener más de 10 caracteres.
    public static void main(String[] args) {
        String texto;
        String encryption = "";
        String key;
        Scanner reader = new Scanner(System.in);
        System.out.println("THE IMPROVE BAT");
        System.out.println("Insert the key");
        key = reader.nextLine();
        System.out.println("Insert the text to encrypt it");
        texto = reader.nextLine();
        if (key.length() < 11) {
            for (int posicion = 0; posicion < texto.length(); posicion++) {
                String word = texto.substring(posicion, posicion + 1);
                int subsitution = key.indexOf(word.toLowerCase());
                if (subsitution != -1) {
                    encryption += subsitution;
                } else {
                    encryption += word;
                }
            }
            System.out.println("The encrypted message is: " + encryption);
        } else {
            System.out.println("Must be less than 10");
        }
    }
}

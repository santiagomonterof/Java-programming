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
public class Number_21 {

    //21. Crear un programa que permita al usuario ingresar su nombre completo y lo devuelva invertido:
    //    Ejemplo: Eduardo Flores Coppede → Coppede Flores Eduardo
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String texto = "";
        float number;
        boolean flag = false;
        System.out.println("THE CHANGE");
        while (!flag) { 
            try {
                System.out.println("Insert your full name");
                texto = reader.nextLine();
                number = Float.parseFloat(texto);
                if ((number <= 0) || (number >= 0)) {
                    System.out.println("Insert a text no a number");
                }
            } catch (NumberFormatException e) {
                flag = true;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        String[] palabras = texto.split(" ");
        for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.print(palabras[i] + " ");
        }
    }
}

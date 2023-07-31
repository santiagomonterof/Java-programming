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
public class Number_19 {

    //19. Escribir un programa que coloque la cantidad de letras de cada posición en la cadena original. Ejemplo:
    //Original: Hola amigo → Hoolllaaaa aaaaaammmmmmmiiiiiiiigggggggggggoooooooooo
    public static void main(String[] args) {
        String characters = "";
        Scanner reader = new Scanner(System.in);
        float number1;
        boolean flag = false;
        System.out.println("DUPLICATOR");
        while (!flag) { // flag == false
            try {
                System.out.println("Insert the group of characters");
                characters = reader.nextLine();
                number1 = Float.parseFloat(characters);
                if ((number1 <= 0) || (number1 >= 0)) {
                    System.out.println("Insert characters no a number");
                }
            } catch (NumberFormatException e) {
                flag = true;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("After the exchange");
        for (int index = 0; index < characters.length(); index++) {
            for (int index1 = 0; index1 <= index; index1++) {
                String letra = characters.substring(index, index + 1);
                System.out.print(letra);
            }
        }
    }
}

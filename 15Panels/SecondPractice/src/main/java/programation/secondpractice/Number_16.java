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
public class Number_16 {

    //16. Elaborar un programa que solicite al usuario ingresar una clave de acceso y 3 intentos para acceder a una
    //zona virtual. Mostrar un mensaje de bloqueo en caso de que falle las tres veces y un mensaje de
    //bienvenida para el acierto.
    public static void main(String[] args) {
        String number, password = "Pedrito", finish = " ";
        int attempt = 3;
        Scanner reader = new Scanner(System.in);
        System.out.println("WELCOME TO FAKEINSTAGRAM");
        System.out.println("Mr.Eduardo");
        System.out.println("Insert your password");
        number = reader.nextLine();
        System.out.println(" ");
        do {
            if (password.equals(number)) {
                System.out.println("Welcome again Mr.Eduardo ");
                System.out.println("       xxxx   xxxx       ");
                System.out.println("      x     x     x      ");
                System.out.println("       x         x       ");
                System.out.println("        x       x        ");
                System.out.println("          x   x          ");
                System.out.println("           x x           ");
                System.out.println("            x            ");
                finish = "end";
            } else {
                if (attempt != 0) {
                    System.out.println("You are not Mr.Eduardo");
                    System.out.println("Try again");
                    System.out.println("You only have " + attempt + " more attempts");
                    number = reader.nextLine();
                } else {
                    if (attempt == 0) {
                        System.out.println("you exhausted all your attempts");
                        finish = "end";
                    }
                }
            }
            attempt--;
        } while (!finish.equals("end"));
    }
}

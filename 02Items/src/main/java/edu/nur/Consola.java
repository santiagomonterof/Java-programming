package edu.nur;

import edu.nur.herencia.Arma;
import edu.nur.herencia.Item;
import java.util.Scanner;

public class Consola {

    public static void main(String[] args) {

        Item pocion = new Item("Pocion Pequeña", 10, 5);
        Item veneno = new Item("Veneno", -50);
        

        Arma espada = new Arma(500, 5, 10);
        System.out.println(espada.inspeccionar());
        System.out.println(pocion.inspeccionar());
        System.out.println(espada.usar());
        System.out.println(espada.usar());
        System.out.println(espada.usar());
        System.out.println(espada.usar());

        Personaje geralt = new Personaje("Geralt de Rivia", 100);
        geralt.guardar(pocion);
        geralt.guardar(pocion);
        geralt.guardar(veneno);
        //geralt.guardar(veneno);

        //geralt.crearPocion("cualquiera");
        geralt.crearPocion("Pocion Pequeña");
        geralt.crearPocion("Elixir");
        //geralt.crearPocion("a");

        geralt.verMochila();

        System.out.println("\n\nVida: " + geralt.getVida());
        geralt.usar(0);
        geralt.usar(0);
        System.out.println("\n\nVida: " + geralt.getVida());
        geralt.usar(3);
        System.out.println("\n\nVida: " + geralt.getVida());
        geralt.verMochila();

        geralt = null;

        // 0 - 3-2
        // 1 - 4-2
        // 2 - 5-2
    }
}

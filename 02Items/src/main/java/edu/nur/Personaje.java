package edu.nur;

import edu.nur.herencia.Item;
import java.util.Random;

public class Personaje {

    private String nombre;
    private int vida;
    private int vida_max;

    private Item[] inventario = new Item[5];

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public void guardar(Item objeto) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null) {
                inventario[i] = objeto;
                return;
            }
        }
        System.out.println("la mochila esta llena");
    }

    public void crearPocion(String nombre) {
        Random aleatorio = new Random();
        int vida = aleatorio.nextInt(100);
        if (aleatorio.nextInt(10) > 5) {
            vida = -vida;
        }
        Item nuevo=new Item(nombre, vida);
        
        //D.R.Y. -- Don't Repeat Yourself
        guardar(nuevo);
        
        
        /*int aleatorio=(int)(Math.random()*100)+1;
        System.out.println(aleatorio);*/

    }

    //TAREA: Agregar funcionalidad de botar items
    public void botar() {

    }

////  + validar que no exceda la vida máxima y si la vida llega a cero... X_X
    public void usar(int casilla) {
        Item aux = inventario[casilla];
        //inventario[casilla] = null;
        vida += aux.consumir();
    }
    
    //TAREA : Agregar funcionalidad de usar un item por su nombre
    //  + validar que no exceda la vida máxima y si la vida llega a cero... X_X
    public void usar(String nombre){
        
    }

    public int getVida() {
        return vida;
    }

    public void verMochila() {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != null) {
                System.out.println(i + ". " + inventario[i].inspeccionar());
            } else {
                System.out.println(i + ". " + "- vacio -");
            }
        }
    }

    public void llenar() {
        vida = vida_max;
    }

}

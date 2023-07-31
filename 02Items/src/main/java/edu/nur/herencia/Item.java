package edu.nur.herencia;

public class Item {

    // pociones --> +vida
    // venenos --> -vida;
    protected int vida;

    protected int peso;
    protected float precio;
    private String color;
    protected String nombre;
    private String descripcion;

    private int usos;

    public Item() {
    }
    
    public Item(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
        this.usos = 1;
    }

    public Item(String nombre, int vida, int usos) {
        this.nombre = nombre;
        this.vida = vida;
        this.usos = usos;
    }

    public Item(String nombre, int vida, int peso, float precio, int usos) {
        this.vida = vida;
        this.peso = peso;
        this.precio = precio;
        this.nombre = nombre;
        this.usos = usos;
    }

    public String inspeccionar() {
        //System.out.println(nombre);
        return nombre + "- tienes " + usos + " usos";
    }

    public int consumir() {
        if (usos > 0) {
            usos--;
            return vida;
        } else {
            return 0;
        }
    }

}

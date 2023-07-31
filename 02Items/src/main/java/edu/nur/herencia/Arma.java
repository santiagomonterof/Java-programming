package edu.nur.herencia;

import java.util.Random;

public class Arma extends Item {

    private int precision;

    public Arma(int daño, int peso, int precision) {
        this.vida = daño;
        super.peso = peso;
        this.precision = precision;
    }
    
    @Override
    public String inspeccionar() {
        //System.out.println(nombre);
        return super.inspeccionar()+" y esta arma tiene " + vida + " de daño";
    }

    public int usar() {
        Random aleatorio = new Random();
        if (aleatorio.nextInt(100) < precision) {
            return vida;
        }else{
            System.out.println("miss..");
            return 0;
        }
    }
}

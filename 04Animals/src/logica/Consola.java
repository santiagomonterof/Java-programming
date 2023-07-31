package logica;

import animales.*;

public class Consola {

    public static void main(String[] args) {
        Conejo animal=new Conejo("Oryctolagus cuniculus");
        System.out.println(animal.getInfo());
    }
    
}

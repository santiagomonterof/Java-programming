package edu.nur.herencia;

public class Circulo extends Figura {

    private float radio;
    
    public Circulo(float radio) {
        this.radio=radio;
    }

    @Override
    public float getPerimetro() {
        return (float)(2 * Math.PI * radio);
    }

    @Override
    public float getArea() {
        return (float)(Math.PI * Math.pow(radio, 2));
    }

}

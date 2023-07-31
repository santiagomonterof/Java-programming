package edu.nur.herencia;

public class Triangulo extends Figura {

    public Triangulo(float base, float altura) {
        super(base, altura);
        this.lados = 3;

    }

    @Override
    public float getPerimetro() {
        return lados * base;
    }

    @Override
    public float getArea() {
        return base * altura / 2;
    }

}

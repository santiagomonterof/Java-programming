package edu.nur.herencia;

public class TrianguloEquilatero extends Triangulo {

    public TrianguloEquilatero(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float getPerimetro() {
        return lados * base;
    }

}

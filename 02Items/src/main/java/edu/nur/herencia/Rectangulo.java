package edu.nur.herencia;

public class Rectangulo extends Figura {

    public Rectangulo(float base, float altura) {
        super(base,altura);
        this.lados = 4;
        
    }

    @Override
    public float getPerimetro() {
        return 2 * base + 2 * altura;
    }

    @Override
    public float getArea() {
        return base * altura;
    }

}

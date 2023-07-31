package edu.nur.herencia;

public abstract class Figura {
    
    protected int lados;
    protected float base;
    protected float altura;

    public Figura() {
    }
    
    public Figura(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    
    //perimetro
    public abstract float getPerimetro();
    //area
    public abstract float getArea();
    
    
}

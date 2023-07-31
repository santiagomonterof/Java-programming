package edu.nur;

import edu.nur.herencia.Circulo;
import edu.nur.herencia.Figura;
import edu.nur.herencia.Rectangulo;
import edu.nur.herencia.Triangulo;

public class Consola_Figuras {
    
    public static void main(String[] args){
        Figura fig=new Figura() {
            @Override
            public float getPerimetro() {
                return 1;
            }

            @Override
            public float getArea() {
                return 7;
            }
        };
        
        System.out.println(fig.getArea());
        fig=new Rectangulo(5, 2);
        System.out.println(fig.getArea());
        
        fig=new Triangulo(5, 2);
        System.out.println(fig.getArea());
        
        fig=new Circulo(5);
        System.out.println(fig.getArea());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programation.personal;

/**
 *
 * @author user
 */
public class ClassMath {

    public static void main(String[] args) {
        //Métodos Matemáticos 

        // Raíz Cuadrada 
        /*double raiz = Math.sqrt(9);
        int resultado = (int) raiz; or double raiz = (int)Math.sqrt(9);
         */
        double raiz = Math.sqrt(9);
        System.out.println(raiz);

        //Potencia
        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente);
        System.out.println(resultado);

        //redondear un numero
        double numero = 4.57;
        long resultado1 = Math.round(numero);
        System.out.println(resultado1);

        float numero1 = 5.55f;
        int resultado2 = Math.round(numero1);
        System.out.println(resultado2);

        //random
        int numerorandom = (int) Math.random();
        System.out.println(numerorandom);

    }

}

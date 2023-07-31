package principal;

import java.util.Scanner;

public class Celular {
    public static void main(String[] args) {
        String numero;
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("Ingrese un número de celular válido: (8 dígitos)");
            numero = lector.nextLine();
        } while (numero.length() != 8);
        System.out.println("Los primeros dígitos son: " + numero.substring(0, 3));
        System.out.println("Los útlimos dígitos son: " + numero.substring(5));
    }
}

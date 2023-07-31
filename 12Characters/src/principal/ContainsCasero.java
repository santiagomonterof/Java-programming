package principal;

import java.util.Scanner;

public class ContainsCasero {
    public static void main(String[] args) {
        String texto;
        String buscado;
        boolean bandera;
        Scanner lector = new Scanner(System.in);

        bandera = false;
        System.out.println("===  Encontrado letras o frases en un texto (contains) ===");
        System.out.println("Ingrese el texto de estudio:");
        texto = lector.nextLine();
        System.out.println("Ingrese la letra o palabra a buscar");
        buscado = lector.nextLine();
        // Obtener la longitud del valor buscado
        int buscadoLenght = buscado.length(); // 4 --> todo
        for (int posicion = 0; posicion < texto.length(); posicion++) { // 40
            if ((posicion + buscadoLenght) < texto.length()) { // 44 < 43
                //     estudio = texto.substring(2, 6);
                String estudio = texto.substring(posicion, posicion + buscadoLenght);
                // ste_ == todo
                if (estudio.equals(buscado)) {
                    bandera = true;
                }
            }
        }
        if (bandera) {
            System.out.println(buscado + " está presente en el texto proporcionado.");
        } else {
            System.out.println(buscado + " NO está presente en el texto proporcionado.");
        }
    }
}

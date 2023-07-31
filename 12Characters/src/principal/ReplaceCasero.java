package principal;

import java.util.Scanner;

public class ReplaceCasero {
    public static void main(String[] args) {
        String texto;
        String buscado;
        String reemplazo;
        String nuevaCadena;
        Scanner lector = new Scanner(System.in);
        System.out.println("=== Reemplazando dos letras de una palabra ===");
        System.out.println("Ingrese el texto para revisión:");
        texto = lector.nextLine();
        System.out.println("Ingrese la letra o palabra a ser reemplazada:");
        buscado = lector.nextLine(); // es
        System.out.println("Ingrese la letra o palabra de reemplazo:");
        reemplazo = lector.nextLine(); // te
        // Aquí comienza la lógica el reemplazo
        nuevaCadena = "";
        int buscadoLenght = buscado.length(); // 2
        boolean cambio = false;
        for (int posicion = 0; posicion < texto.length(); posicion = posicion + 1) { // posicion++ // posicion += 1
            int limiteSuperior = posicion + buscadoLenght;
            if (limiteSuperior <= texto.length()) {
                String subcadena = texto.substring(posicion, limiteSuperior); // Es
                if (subcadena.toUpperCase().equals(buscado.toUpperCase())) { // ES == ES
                    nuevaCadena = nuevaCadena.concat(reemplazo); // "" + te
                    cambio = true;
                } else {
                    // Para evitar que se dupliquen las cadenas se debe siempre iniciar en una posición adicional a la actual
                    if (!cambio) { // false == false
                        nuevaCadena = nuevaCadena.concat(texto.substring(posicion, posicion + 1)); // "" + _
                    }
                    cambio = false;
                }
            } else {
                nuevaCadena = nuevaCadena.concat(texto.substring(posicion, posicion + 1));
            }
        }
        System.out.println("El texto con  los reemplazos es:");
        System.out.println(nuevaCadena);
    }

}
// Solicitar al usuario su número de celular y obtener los 3 primeros digitos del mismo y lo lo tres últimos

package Prueba;

import javax.swing.Timer;

public class Consola {

    public static void main(String[] args) {
        Oyente ola = new Oyente();

        Timer miTemporizador = new Timer(100, ola);

        miTemporizador.start();
        miTemporizador.isRepeats();

    }
}

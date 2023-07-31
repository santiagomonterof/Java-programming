package Logica;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Ventana extends JFrame {

    Panel jp = new Panel();

    public Ventana() {
        super("Pelotas Rebotando");

        setSize(500, 500);
        setLocationRelativeTo(null);
        add(jp, BorderLayout.CENTER);
        addMouseListener(jp);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Thread t1 = new Thread(jp);
        t1.start();

    }

    public static void main(String[] args) {
        Ventana miVentana = new Ventana();
    }

}

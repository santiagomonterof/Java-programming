package grafica;

import Logica.Calculadora;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame implements ActionListener {

    private Calculadora casio = new Calculadora();
    private JLabel pantalla = new JLabel("");

    private String nro1 = "";
    private String nro2 = "";
    private char operador;

    public Ventana() {
        setSize(500, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pantalla.setPreferredSize(new Dimension(100, 100));
        pantalla.setOpaque(true);
        pantalla.setBackground(Color.WHITE);
        add(pantalla, BorderLayout.NORTH);
        cargarBotones();
        setVisible(true);
    }

    private void cargarBotones() {
        JPanel panel_botones = new JPanel(new GridLayout(4, 3));

        for (int i = 1; i <= 12; i++) {
            if (i != 10 && i != 12) {
                int nro = i;
                if (i == 11) {
                    nro = 0;
                }
                JButton boton = new JButton("" + nro);
                boton.setName("" + nro);
                boton.addActionListener(e -> {
                    if (operador == 0) {
                        nro1 += (e.getActionCommand());
                    } else {
                        nro2 += (e.getActionCommand());
                    }
                    pantalla.setText(pantalla.getText() + e.getActionCommand());
                    System.out.println(nro2);
                });
                panel_botones.add(boton);
            } else {
                if (i == 10) {
                    panel_botones.add(new JButton("-/+"));
                } else {
                    panel_botones.add(new JButton("."));
                }
            }
        }
        add(panel_botones, BorderLayout.CENTER);
        JPanel panel_acciones = new JPanel(new GridLayout(5, 1));
        JButton suma = new JButton("+");
        JButton resta = new JButton("-");
        JButton multiplicacion = new JButton("*");
        JButton division = new JButton("/");
        JButton igual = new JButton("=");
        panel_acciones.add(suma);
        panel_acciones.add(resta);
        panel_acciones.add(multiplicacion);
        panel_acciones.add(division);
        panel_acciones.add(igual);
        suma.addActionListener(this);
        resta.addActionListener(this);
        multiplicacion.addActionListener(this);
        division.addActionListener(this);
        igual.addActionListener(this);
        panel_acciones.setPreferredSize(new Dimension(150, 150));
        add(panel_acciones, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        new Ventana();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (operador != 0) {
            nro1 = "" + casio.calcular(nro1, operador, nro2);
            nro2 = "";
            pantalla.setText(nro1);
        }
        operador = ((JButton) e.getSource()).getText().charAt(0);
        System.out.println(operador);
        pantalla.setText(pantalla.getText() + operador);

    }

}

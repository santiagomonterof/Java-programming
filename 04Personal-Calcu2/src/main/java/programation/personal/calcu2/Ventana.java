package programation.personal.calcu2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame implements ActionListener {

    private String nro1 = "";
    private String nro2 = "";
    private char operador;
    private boolean flag = false;
    private JButton mas = new JButton("+");
    private JButton menos = new JButton("-");
    private JButton igual = new JButton("=");
    private JLabel pantalla = new JLabel("0");

    public Ventana() {
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        añadirbotones();
        setVisible(true);
    }

    public void añadirbotones() {
        pantalla = new JLabel("0");
        JPanel botones = new JPanel();

        for (int i = 0; i < 5; i++) {
            JButton boton = new JButton("" + i);
            botones.setLayout(new FlowLayout());
            boton.addActionListener(e -> {
                if (flag == true) {
                    nro1 = "";
                    nro2 = "";
                    flag = false;
                }
                if (operador == 0) {
                    nro1 += e.getActionCommand();
                    pantalla.setText(nro1);
                } else {
                    nro2 += e.getActionCommand();
                    pantalla.setText(nro2);
                }

                System.out.println(nro1);

            });
            botones.add(boton);
            mas.addActionListener(this);
            menos.addActionListener(this);
            igual.addActionListener(this);
            botones.add(mas);
            botones.add(menos);
            botones.add(igual);
        }
        add(pantalla, BorderLayout.NORTH);
        add(botones, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Ventana v1 = new Ventana();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = new Double(nro1);
        double num2 = new Double(nro2);
        int c = 0;
        if (e.getSource().equals(mas)) {
            operador = '+';
            c++;
            if (c == 2) {
               
                pantalla.setText(String.valueOf(num1 + num2));
                operador = 0;
                c = 0;
            }
        }
        if (e.getSource().equals(menos)) {
            operador = '-';
        }
        if (e.getSource().equals(igual)) {

            switch (operador) {
                case '+':
                   
                    pantalla.setText(String.valueOf(num1 + num2));
                    operador = 0;
                    flag = true;
                    break;
                case '-':
                   
                    pantalla.setText(String.valueOf(num1 - num2));
                    operador = 0;
                    flag = true;
                    break;
                default:

            }

        }

    }

}

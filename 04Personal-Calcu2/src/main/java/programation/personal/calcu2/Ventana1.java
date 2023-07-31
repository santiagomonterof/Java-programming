package programation.personal.calcu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana1 extends JFrame implements ActionListener {

    private JButton[][] botones_numeros = new JButton[4][3];
    private JButton[][] botones_operadores = new JButton[5][1];
    private JLabel pantalla = new JLabel(" ", SwingConstants.RIGHT);
    private String num1 = "";
    private String num2 = "";
    private boolean flag = false;
    private String operador = "";

    public Ventana1() {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        añadirPantalla();
        añadirBotones();
        añadirOperadores();
        setVisible(true);
    }

    public void añadirPantalla() {
        JPanel tablero_pantalla = new JPanel(new BorderLayout());
        pantalla.setFont(new Font("Windows", Font.PLAIN, 40));
        tablero_pantalla.add(pantalla, BorderLayout.EAST);
        add(tablero_pantalla, BorderLayout.NORTH);

    }

    public void añadirBotones() {
        JPanel tablero_numeros = new JPanel(new GridLayout(4, 3));

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                JButton boton = new JButton();
                botones_numeros[i][j] = boton;
                botones_numeros[i][j].addActionListener(e -> {
                    if (flag == true) {
                        pantalla.setText("");
                        flag = false;
                    }
                    if (operador == "") {
                        num1 += e.getActionCommand();
                        pantalla.setText(num1);
                        System.out.println(num1);
                    } else {
                        num2 += (e.getActionCommand());
                        pantalla.setText(num2);
                        System.out.println(num2);
                    }
               
                });
                tablero_numeros.add(botones_numeros[i][j]);
            }
        }
        añadirValores1();
        add(tablero_numeros, BorderLayout.CENTER);

    }

    public void añadirOperadores() {
        JPanel tablero_operadores = new JPanel(new GridLayout(5, 1));

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                JButton boton = new JButton();
                botones_operadores[i][j] = boton;
                botones_operadores[i][j].addActionListener(this);
                tablero_operadores.add(botones_operadores[i][j]);
            }
        }
        añadirValores2();
        tablero_operadores.setPreferredSize(new Dimension(100, 100));
        add(tablero_operadores, BorderLayout.EAST);

    }

    public void añadirValores1() {
        int contador = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones_numeros[i][j].setText(String.valueOf(contador));
                contador++;
            }
        }
        botones_numeros[3][0].setText("+/-");
        botones_numeros[3][1].setText("0");
        botones_numeros[3][2].setText(".");
    }

    public void añadirValores2() {
        botones_operadores[0][0].setText("+");
        botones_operadores[1][0].setText("-");
        botones_operadores[2][0].setText("*");
        botones_operadores[3][0].setText("/");
        botones_operadores[4][0].setText("=");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("=") && operador != "") {
            double resultado;
            switch (operador) {
                case "+":
                    resultado = Double.parseDouble(num1) + Double.parseDouble(num2);
                    System.out.println(resultado);
                    pantalla.setText(String.valueOf(resultado));
                    operador = "";
                    num1 = "";
                    num2 = "";
                    break;
                case "-":
                    resultado = Double.parseDouble(num1) - Double.parseDouble(num2);
                    System.out.println(resultado);
                    pantalla.setText(String.valueOf(resultado));
                    operador = "";
                    num1 = "";
                    num2 = "";
                    break;
                case "*":
                    resultado = Double.parseDouble(num1) * Double.parseDouble(num2);
                    System.out.println(resultado);
                    pantalla.setText(String.valueOf(resultado));
                    operador = "";
                    num1 = "";
                    num2 = "";
                    break;
                case "/":
                    resultado = Double.parseDouble(num1) / Double.parseDouble(num2);
                    System.out.println(resultado);
                    pantalla.setText(String.valueOf(resultado));
                    operador = "";
                    num1 = "";
                    num2 = "";
                    break;
                default:

            }
        } else {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 1; j++) {
                    if (e.getSource().equals(botones_operadores[i][j])) {
                        operador += botones_operadores[i][j].getActionCommand();
                        if (operador.length() >=2) {
                            operador = operador.substring(1, 2);
                            switch (operador) {
                                case "+":
                                    num1 = String.valueOf(Double.parseDouble(num1) + Double.parseDouble(num2));
                                    num2 = "";
                                    pantalla.setText(num1);
                                    operador = "+";
                                    break;
                                case "-":
                                    num1 = String.valueOf(Double.parseDouble(num1) - Double.parseDouble(num2));
                                    num2 = "";
                                    pantalla.setText(num1);
                                    operador = "-";
                                    break;
                                case "*":
                                    num1 = String.valueOf(Double.parseDouble(num1) * Double.parseDouble(num2));
                                    num2 = "";
                                    pantalla.setText(num1);
                                    operador = "*";
                                    break;
                                case "/":
                                    num1 = String.valueOf(Double.parseDouble(num1) / Double.parseDouble(num2));
                                    num2 = "";
                                    pantalla.setText(num1);
                                    operador = "/";
                                    break;
                                default:
                                  
                            }
                            
                        }
                        System.out.println(operador);
                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        Ventana1 v1 = new Ventana1();
    }

}

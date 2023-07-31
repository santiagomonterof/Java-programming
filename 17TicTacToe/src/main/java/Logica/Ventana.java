package Logica;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    //Inicio
    private JPanel panel_inicio = new JPanel();
    private JLabel fondo = new JLabel();
    private JTextField espacio1 = new JTextField("Jugador 1");
    private JTextField espacio2 = new JTextField("Jugador 2");
    private JButton comenzar = new JButton("Comenzar");

    //Juego
    private JPanel panel_juego = new JPanel();
    private JLabel juga1 = new JLabel();
    private JLabel juga2 = new JLabel();
    
    public Ventana() {
        super("TRES EN RAYA");
        setSize(550, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        añadirPaneles();
        setVisible(true);
    }
    
    public void añadirPaneles() {
        panel_inicio.setSize(getWidth(), getHeight());
        panel_juego.setSize(getWidth(), getHeight());
        panel_inicio.setLayout(null);
        panel_juego.setLayout(null);
        
        fondo.setIcon(new ImageIcon("imagenes/fondo.jpg"));
        fondo.setSize(getWidth(), getHeight());
        
        espacio1.setBounds(175, 220, 200, 30);
        espacio2.setBounds(175, 260, 200, 30);
        
        juga1.setBounds(10, 10, 200, 30);
        juga1.setForeground(Color.WHITE);
        panel_juego.add(juga1);
        
        juga2.setBounds(10, 30, 200, 30);
        juga2.setForeground(Color.WHITE);
        panel_juego.add(juga2);
        
        
        comenzar.setBounds(225, 300, 100, 30);
        comenzar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Presione el boton");
                if (!espacio1.getText().equals("") && !espacio2.getText().equals("")) {                   
                    panel_inicio.setVisible(false);
                    juga1.setText("Jugador1: "+espacio1.getText());                   
                    juga2.setText("Jugador2: "+espacio2.getText());                   
                    panel_juego.add(fondo);                     
                    add(panel_juego);
                }
            }
        });
        
        panel_inicio.add(espacio1);
        panel_inicio.add(espacio2);
        panel_inicio.add(comenzar);
        panel_inicio.add(fondo);
        add(panel_inicio);
        
    }
    
}

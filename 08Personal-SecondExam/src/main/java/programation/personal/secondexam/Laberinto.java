package programation.personal.secondexam;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Laberinto extends JFrame implements KeyListener {

    private JPanel mapa1 = new JPanel();
    private Jugador j1 = new Jugador(60, 70, Color.RED);

    private JLabel victoria = new JLabel();
    private int contador = 0;
    private Bloque b1 = new Bloque(0, 0, 500, 50);    //Primera linea superior
    private Bloque b2 = new Bloque(0, 100, 380, 50);  //Segunda línea inferior de primera
    private Bloque b3 = new Bloque(435, 0, 50, 250);  //Tercera línea de choque lateral
    private Bloque b4 = new Bloque(100, 200, 480, 50);//Cuarta línea tercera horizontal
    private Bloque b5 = new Bloque(0, 0, 50, 300);  //Quinta línea lateral izquierdo
    private Bloque b6 = new Bloque(0, 300, 385, 50);  //Quinta línea cuarta horizontal

    public Laberinto() {
        setSize(500, 390);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        añadirMapa1();
        addKeyListener(this);
        setVisible(true);
    }

    public void añadirMapa1() {
        mapa1.setLayout(null);
        mapa1.setSize(500, 390);

        victoria.setBounds(385, 250, 100, 100);
        victoria.setOpaque(true);
        victoria.setBackground(Color.green);

        b1.setText("Puntos " + contador);
        mapa1.add(j1);
        mapa1.add(victoria);
        mapa1.add(b1);
        mapa1.add(b2);
        mapa1.add(b3);
        mapa1.add(b4);
        mapa1.add(b5);
        mapa1.add(b6);
        add(mapa1);
    }

    public static void main(String[] args) {
        Laberinto mapa = new Laberinto();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            j1.avanzarDerecha();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            j1.avanzarIzquierda();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            j1.avanzarArriba();
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            j1.avanzarAbajo();
        }

        if (b1.colision(j1) == true || b2.colision(j1) == true || b3.colision(j1) == true || b4.colision(j1) == true || b5.colision(j1) == true || b6.colision(j1) == true) {
            JOptionPane.showMessageDialog(rootPane, "Perdio");
            j1.setXYLocation(60, 70);
        }

        if (victoria.getBounds().intersects(j1.getBounds())) {
            JOptionPane.showMessageDialog(rootPane, "Ganador");
            contador++;
            b1.setText("Puntos " + contador);
            j1.setXYLocation(60, 70);

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}

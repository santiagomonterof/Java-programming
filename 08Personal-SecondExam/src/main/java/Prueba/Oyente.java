package Prueba;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Oyente extends JFrame implements ActionListener, KeyListener {

    private JLabel jugador = new JLabel();
    JLabel miLabel1;
    JLabel miLabel2;
    int x = 20;
    int x1 = 20;
    int x_player = 100;
    int y_player = 100;
    boolean uno = true;
    boolean dos = false;

    public Oyente() {
        setLayout(null);
        setBounds(20, 20, 400, 400);
        miLabel1 = new JLabel();
        miLabel1.setBounds(x, 20, 10, 10);
        miLabel1.setOpaque(true);
        miLabel1.setBackground(Color.RED);
        miLabel2 = new JLabel();
        miLabel2.setBounds(x, 50, 10, 10);
        miLabel2.setOpaque(true);
        miLabel2.setBackground(Color.GREEN);
        activarJugadores();
        this.addKeyListener(this);
        add(miLabel1);
        add(miLabel2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void activarJugadores() {
        jugador.setOpaque(true);
        jugador.setBackground(Color.blue);
        jugador.setBounds(x_player, y_player, 10, 10);
        add(jugador);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (uno) {
            if (x < 300) {
                x += 20;
                x1 += 20;
                miLabel1.setLocation(x, 20);
                miLabel2.setLocation(x1, 50);
                System.out.println(x);
            }
            if (x == 300) {
                uno = false;
                dos = true;
            }
        }

        if (dos) {
            x -= 20;
            x1 -= 20;
            miLabel1.setLocation(x, 20);
            miLabel2.setLocation(x1, 50);
            if (x == 20) {
                uno = true;
                dos = false;
            }

        }

        if (miLabel1.getBounds().intersects(jugador.getBounds()) || miLabel2.getBounds().intersects(jugador.getBounds())) {
            JOptionPane.showMessageDialog(rootPane, "KABOOMMMMMMMMMS");
            System.out.println("KABOMMMMMM");
            x_player = 100;
            y_player = 100;
            jugador.setLocation(x_player, y_player);
        }
        /*
        if (x > 0) {
            x -= 5;
            miLabel1.setLocation(x, 20);
        }*/
        repaint();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x_player -= 10;
            jugador.setLocation(x_player, y_player);
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x_player += 10;
            jugador.setLocation(x_player, y_player);
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            y_player -= 10;
            jugador.setLocation(x_player, y_player);
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y_player += 10;
            jugador.setLocation(x_player, y_player);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}

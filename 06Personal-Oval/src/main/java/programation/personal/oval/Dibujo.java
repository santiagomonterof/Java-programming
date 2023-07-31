package programation.personal.oval;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Dibujo extends JPanel implements KeyListener {
    
    private int x_c1 = 50;
    private int y_c1 = 50;
    private int x_c2 = 50;
    private int y_c2 = 300;
    private boolean bandera;
    public Dibujo() {
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillOval(x_c1, y_c1, 100, 100);
        g.setColor(Color.RED);
        g.fillOval(x_c2, y_c2, 100, 100);
        g.setColor(Color.GRAY);
        g.fillRect(500, 0, 30, 500);
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (bandera) {
                x_c1 += 10;
                if (x_c1+100 > 500) {
                    JOptionPane.showMessageDialog(this, "Ganador 1");
                    x_c1 = 0;
                }
                bandera = !bandera;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (!bandera) {
                x_c1 += 10;
                bandera = !bandera;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            x_c2 += 10;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}

package programation.guardadocirculos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Panel extends JPanel implements MouseListener, Runnable {

    ArrayList<Pelota> pelota = new ArrayList();

    public Panel() {
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (pelota.size() > 0) {
            for (int i = 0; i < pelota.size(); i++) {
                pelota.get(i).dibujar(g);
            }
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        Random random = new Random();
        int random1 = random.nextInt(113) + 1;
        int random2 = random.nextInt(113) + 1;
        int random3 = random.nextInt(113) + 1;
        int ramodom4 = random.nextInt(113) + 1;
        Color color = new Color(random1, random2, random3, ramodom4);
        Pelota pelota1 = new Pelota(x - 40, y - 50, color);
        pelota.add(pelota1);

    }

    public void verificarColisionVertical() {
        for (int i = 0; i < pelota.size(); i++) {
            if (pelota.get(i).gety() > this.getHeight() - pelota.get(i).getTamano()) {

                pelota.get(i).sety(this.getHeight() + 50);
                pelota.get(i).setVertical(false);
            } else if (pelota.get(i).gety() < 0) {
                pelota.get(i).sety(0);
                pelota.get(i).setVertical(true);
            }
        }
    }

    public void verificarColisionHorizontal() {
        for (int i = 0; i < pelota.size(); i++) {
            if (pelota.get(i).getx() > this.getWidth() - pelota.get(i).getTamano()) {
                pelota.get(i).setx(this.getWidth() + 50);
                pelota.get(i).setHorizontal(false);
            } else if (pelota.get(i).getx() < 0) {
                pelota.get(i).setx(0);
                pelota.get(i).setHorizontal(true);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {

                if (pelota.size() > 0) {
                    verificarColisionHorizontal();
                    verificarColisionVertical();
                    for (int i = 0; i < pelota.size(); i++) {
                        pelota.get(i).moverHorizontal();
                        pelota.get(i).moverVertical();
                    }
                }

                repaint();
                Thread.sleep(5);

            } catch (InterruptedException ex) {
                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

package Logica;

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

    ArrayList<Pelota> pelotas = new ArrayList();

    public Panel() {
        setLayout(null);
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (pelotas.size() > 0) {
            for (int i = 0; i < pelotas.size(); i++) {
                pelotas.get(i).dibujar(g);
            }
        }

    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();

        Random random = new Random();

        int aleatorio1 = random.nextInt(215) + 1;
        int aleatorio2 = random.nextInt(215) + 1;
        int aleatorio3 = random.nextInt(215) + 1;
        int aleatorio4 = random.nextInt(215) + 1;

        Color color = new Color(aleatorio1, aleatorio2, aleatorio3, aleatorio4);

        Pelota pelota1 = new Pelota(x - 40, y - 50, color);
        pelotas.add(pelota1);

     
    }

    public void verificarColisionVertical() {
        for (int i = 0; i < pelotas.size(); i++) {
            if (pelotas.get(i).getPosY() > this.getHeight()) {

                pelotas.get(i).setPosY(this.getHeight());
                pelotas.get(i).setVertical(false);
            } else if (pelotas.get(i).getPosY() < 0) {
                pelotas.get(i).setPosY(0);
                pelotas.get(i).setVertical(true);
            }
        }
    }

    public void verificarColisionHorizontal() {
        for (int i = 0; i < pelotas.size(); i++) {
            if (pelotas.get(i).getPosX() > this.getWidth()) {
                pelotas.get(i).setPosX(this.getWidth());
                pelotas.get(i).setHorizontal(false);
            } else if (pelotas.get(i).getPosX() < 0) {
                pelotas.get(i).setPosX(0);
                pelotas.get(i).setHorizontal(true);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

    @Override
    public void run() {
        while (true) {
            try {

                if (pelotas.size() > 0) {
                    verificarColisionVertical();
                    verificarColisionHorizontal();
                    for (int i = 0; i < pelotas.size(); i++) {
                        pelotas.get(i).moverHorizontal();
                        pelotas.get(i).moverVertical();
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

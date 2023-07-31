package grafica;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Dibujo extends JPanel implements KeyListener, Runnable {

	private Figura pelota = new Figura();

	public Dibujo() {
		setBackground(Color.white);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		pelota.dibujar(g);

	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e) {
//		System.out.println(e.getKeyChar()+" -- "+e.getKeyCode());
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			pelota.moverIzquierda();
			if (pelota.getX() < 0) {
				pelota.setX(0);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			pelota.moverDerecha();
			if (pelota.getX() > this.getWidth() - pelota.getTamanio()) {
				pelota.setX(this.getWidth() - pelota.getTamanio());
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			pelota.moverArriba();
			if (pelota.getY() < 0) {
				pelota.setY(0);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			pelota.moverAbajo();
			if (pelota.getY() > getHeight() - pelota.getTamanio()) {
				pelota.setY(this.getHeight() - pelota.getTamanio());
			}
		}

		repaint();
		// TODO Auto-generated method stub

	}

	public void keyReleased(KeyEvent e) {

		// TODO Auto-generated method stub

	}

	private void verificarLimites() {
		if (pelota.getX() < 0) {
			pelota.cambiarHorizontal();
			pelota.setX(0);
		}

		if (pelota.getX() > this.getWidth() - pelota.getTamanio()) {
			pelota.cambiarHorizontal();
			pelota.setX(this.getWidth() - pelota.getTamanio());
		}
	

	}

	@Override
	public void run() {
		while (true) {
			try {
				verificarLimites();
				pelota.mover();
				repaint();
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

package grafica;

import java.awt.Color;
import java.awt.Graphics;

public class Figura {
	private int x = 100;
	private int y = 100;
	private int tamanio = 100;
	private int velocidad = 1;

	private boolean irDerecha = true;

	public void mover() {
		if (irDerecha)
			moverDerecha();
		else
			moverIzquierda();
	}

	public void moverIzquierda() {
		x -= velocidad;
	}

	public void moverDerecha() {
		x += velocidad;
	}

	public void moverArriba() {
		y -= velocidad;
	}

	public void moverAbajo() {
		y += velocidad;
	}
	
	public void cambiarHorizontal() {
		irDerecha = !irDerecha;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void dibujar(Graphics g) {
		g.setColor(Color.gray);
		g.fillOval(x - 5, y + 5, tamanio, tamanio);
		g.setColor(Color.RED);
		g.fillOval(x, y, tamanio, tamanio);
	}

}

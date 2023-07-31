package programation.guardadocirculos;

import java.awt.Color;
import java.awt.Graphics;

public class Pelota {

    private int x;
    private int y;
    private int tamano = 50;
    private Color color;
    int velocidad = 1;
    boolean vertical = true;
    boolean horizontal = true;

    public Pelota() {

    }

    public Pelota(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillOval(x, y, tamano, tamano);
    }

    public void moverVertical() {
        if (vertical) {
            moverVerticalAbajo();
        } else {
            moverVerticalArriba();
        }
    }

    public void moverHorizontal() {
        if (horizontal) {
            moverDerecha();
        } else {
            moverIzquierda();
        }
    }

    public void moverVerticalArriba() {
        y -= velocidad;
    }

    public void moverVerticalAbajo() {
        y += velocidad;
    }

    public void moverDerecha() {
        x += velocidad;
    }

    public void moverIzquierda() {
        x -= velocidad;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }

    public int gety() {
        return y;
    }

    public void sety(int y) {
        this.y = y;
    }

    public boolean isHorizontal() {
        return horizontal;
    }

    public void setHorizontal(boolean horizontal) {
        this.horizontal = horizontal;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isVertical() {
        return vertical;
    }

    public void setVertical(boolean vertical) {
        this.vertical = vertical;
    }

}

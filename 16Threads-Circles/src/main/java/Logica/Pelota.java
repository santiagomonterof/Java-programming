package Logica;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Pelota {

    private int tamano = 50;
    private int posX;
    private int posY;
    private Color color;

    int velocidad = 1;
    boolean vertical = true;
    boolean horizontal = true;

    public Pelota() {

    }

    public Pelota(int posX, int posY, Color color) {
        this.posX = posX;
        this.posY = posY;
        this.color = color;
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
        posY -= velocidad;
    }

    public void moverVerticalAbajo() {
        posY += velocidad;
    }

    public void moverDerecha() {
        posX += velocidad;
    }

    public void moverIzquierda() {
        posX -= velocidad;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void dibujar(Graphics g) {
        Random random = new Random();

        Color color0 = new Color(200, 21, 88, 101);
        Color color1 = new Color(100, 91, 2, 77);
        Color color2 = new Color(88, 199, 29, 114);

        g.setColor(this.color);
        g.fillOval(posX, posY, tamano, tamano);

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

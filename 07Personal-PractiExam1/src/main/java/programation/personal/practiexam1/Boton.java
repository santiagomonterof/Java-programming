package programation.personal.practiexam1;

import java.awt.Color;
import javax.swing.JButton;

public class Boton extends JButton {

    private int x;
    private int y;
    private int tamaño;
    private Color c;

    public Boton() {
        
    }

    public Boton(int x, int y, int tamaño, Color c) {
        this.x = x;
        this.y = y;
        this.tamaño = tamaño;
        this.c = c;
        setBounds(x, y, tamaño, tamaño);
        setOpaque(true);
        setBackground(c);
    }

    public void avanzarIzquierda(int ancho, int alto) {
        if (x+tamaño < 0) {
            x = 10;
        }else{
            x -= 10;
        }
       
    }

    public void avanzarDerecha(int ancho, int alto) {  
        if (x+tamaño >= ancho) {
            x = 10;
        }else{
            x += 100;
            setLocation(x, y);
        }
           
    }

    public void avanzarArriba(int ancho, int alto) {
        y -= 10;
    }

    public void avanzarAbajo(int ancho, int alto) {
        y += 10;
    }

}

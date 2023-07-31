package programation.personal.secondexam;

import java.awt.Color;
import javax.swing.JLabel;

public class Jugador extends JLabel {

    private int x;
    private int y;

    public Jugador() {

    }

    public Jugador(int x, int y, Color c) {
        this.x = x;
        this.y = y;
        setOpaque(true);
        setBackground(c);
        setBounds(x, y, 10, 10);
    }

    public void setXYLocation(int x, int y) {
        this.x = x;
        this.y = y;
        setLocation(x, y);
    }

    public void avanzarDerecha() {
        x += 10;
        setLocation(x, y);
    }

    public void avanzarIzquierda() {
        x -= 10;
        setLocation(x, y);
    }

    public void avanzarArriba() {
        y -= 10;
        setLocation(x, y);
    }

    public void avanzarAbajo() {
        y += 10;
        setLocation(x, y);
    }

}

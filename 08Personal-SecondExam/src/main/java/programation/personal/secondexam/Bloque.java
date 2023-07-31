package programation.personal.secondexam;

import java.awt.Color;
import javax.swing.JLabel;

public class Bloque extends JLabel {

    private int x;
    private int y;
    private int ancho;
    private int alto;

    public Bloque() {

    }

    public Bloque(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        setOpaque(true);
        setBackground(Color.GRAY);
        setBounds(x, y, ancho, alto);
    }

    public boolean colision(JLabel x) {
        if (this.getBounds().intersects(x.getBounds())) {
            return true;
        }
        return false;
    }

}

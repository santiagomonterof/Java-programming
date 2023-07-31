package programation.personal.oval;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame implements MouseListener {

    private Dibujo circulos = new Dibujo();
    private Arte circulo = new Arte();

    public Ventana() {
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //add(circulos);
        addMouseListener(this);
        //addKeyListener(circulos);
        setVisible(true);
    }

    

    public static void main(String[] args) {
        Ventana v1 = new Ventana();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    
    }

    @Override
    public void mousePressed(MouseEvent e) {
        circulo.paintComponent(this.getGraphics(),e.getX(),e.getY());
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

}

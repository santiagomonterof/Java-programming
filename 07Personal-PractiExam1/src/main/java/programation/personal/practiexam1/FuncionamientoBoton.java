package programation.personal.practiexam1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class FuncionamientoBoton extends JFrame {

    private Boton bloque1 = new Boton(10, 10, 100, Color.BLUE);
    private Boton bloque2 = new Boton(10, 300, 100, Color.RED);

    public FuncionamientoBoton() {
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        añadirCorredores();
        añadirFuncionamiento();
        setLayout(null);
        setVisible(true);
    }

    private void añadirCorredores() {

        add(bloque1);
        add(bloque2);
    }

    private void añadirFuncionamiento() {

        bloque1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               
            }

            @Override
            public void mousePressed(MouseEvent e) {
               bloque1.avanzarDerecha(getWidth(), getHeight());
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
        });
    }

    public static void main(String[] args) {
        FuncionamientoBoton v1 = new FuncionamientoBoton();
    }
}

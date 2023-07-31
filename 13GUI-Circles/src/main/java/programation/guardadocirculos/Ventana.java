package programation.guardadocirculos;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Ventana extends JFrame {

    Panel panel = new Panel();

    public Ventana() {
        super("Rebotar");

        setSize(500, 500);
        setLocationRelativeTo(null);
        add(panel, BorderLayout.CENTER);
        addMouseListener(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Thread thread = new Thread(panel);
        thread.start();

    }

    public static void main(String[] args) {
        new Ventana();
    }

}

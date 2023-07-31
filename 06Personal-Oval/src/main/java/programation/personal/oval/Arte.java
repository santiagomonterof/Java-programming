package programation.personal.oval;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class Arte extends JLabel {

    private Color color;
    private int x;
    private int y;
    private int dir;

    public Arte() {
    }

    public Arte(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void paintComponent(Graphics g, int x, int y) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x-50, y-50, 100, 100);
        g.setColor(Color.RED);

    }

}

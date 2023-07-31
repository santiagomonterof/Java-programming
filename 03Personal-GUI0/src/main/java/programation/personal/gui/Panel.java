package programation.personal.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Panel extends JFrame {

    public Panel() {
        //-=[+]=-
        //Primero Ancho.
        //Segundo Largo
        setSize(500, 500);//Establecemos tamaño
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Hello World");
        //-=[+]=-
        //Primero Eje X
        //Segundo Eje Y
        //setLocation(100, 100);//Establecemos el lugar de inicio
        //-=[+]=-
        //setBounds(100, 200, 500, 500);//Funcion doble. Establece coordenadas y tamaño 
        setLocationRelativeTo(null);
        //-=[+]=-
        setMinimumSize(new Dimension(500, 500));
        startComponent();
        //this.getContentPane().setBackground(Color.BLACK);
    }

    private void startComponent() {
        JPanel panel = new JPanel();//Creacion de un panel
        panel.setLayout(null);//Desactivando el diseño por defecto del panel
        //panel.setBackground(Color.red);//Color del panel
       

        //Etiqueta tipo texto
        JLabel label = new JLabel("Mundial 2018", SwingConstants.CENTER);//Creamos una etiqueta
        label.setOpaque(true);//Para poder añadir color a fondo
        //label.setText("Hello");//Establecemos texto de la etiqueta
        label.setBounds(85, 10, 300, 80);
        //label.setHorizontalAlignment(SwingConstants.CENTER);//Lo mismo que el constructor
        label.setForeground(Color.black);
        //label.setBackground(Color.black);
        label.setFont(new Font("cooper black", Font.PLAIN, 40));
        panel.add(label);//Añadimos etiqueta

        //Etiqueta tipo imagen
        JLabel img1 = new JLabel(new ImageIcon("balonMundial.jpg"));
        JButton img2 = new JButton(new ImageIcon("balonMundial.jpg"));
        img1.setBounds(10, 80, 500, 500);
        img2.setBounds(10, 80, 500, 500);
        panel.add(img1);
        panel.add(img2);
    }

}

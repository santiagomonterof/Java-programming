package programation.personal.change;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {

    ArrayList<Equipo> inventario = new ArrayList();
    private int contador;

    private JPanel datos = new JPanel();
    private JTextField nombre = new JTextField();
    private JTextField potencia = new JTextField();
    private JLabel n1 = new JLabel("Nombre");
    private JLabel p1 = new JLabel("Potencia");
    private JButton enchufar = new JButton("Enchufar");
    private JButton atras = new JButton("<");
    private JButton adelante = new JButton(">");

    public Ventana() {
        super("Generador");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        añadirBotones();
        setVisible(true);
    }

    public void añadirBotones() {
        int x = 100;
        int y = 150;
        datos.setSize(getWidth(), getHeight());
        datos.setLayout(null);

        nombre.setBounds(x, y, 200, 50);
        potencia.setBounds(x, y + 70, 200, 50);

        n1.setBounds(x + 250, y, 100, 25);
        p1.setBounds(x + 250, y + 70, 100, 25);

        enchufar.setBounds(x + 225, y + 140, 100, 25);
        enchufar.addActionListener(this);

        atras.setBounds(x, y + 150, 50, 50);
        adelante.setBounds(x + 100, y + 150, 50, 50);
        atras.addActionListener(this);
        adelante.addActionListener(this);

        datos.add(n1);
        datos.add(p1);
        datos.add(nombre);
        datos.add(potencia);
        datos.add(enchufar);
        datos.add(atras);
        datos.add(adelante);

        add(datos);
    }

    public void borrarDatos() {
        nombre.setText("");
        potencia.setText("");
    }

    public static void main(String[] args) {
        Ventana v1 = new Ventana();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "Enchufar":
                if (!nombre.getText().equals("") && !potencia.getText().equals("")) {
                    Equipo new1 = new Equipo(nombre.getText(), Integer.parseInt(potencia.getText()));
                    inventario.add(new1);
                    contador = inventario.size();
                    borrarDatos();
                    JOptionPane.showMessageDialog(null, "Equipo guardado");
                } else {
                    JOptionPane.showMessageDialog(null, "Faltan datos");
                }
                break;
            case "<":
                contador--;
                if (contador >= 0 && contador < inventario.size()) {
                    nombre.setText(inventario.get(contador).getNombre());
                    potencia.setText(String.valueOf(inventario.get(contador).getPotencia()));
                }
                if (contador < 0) {
                    contador = 0;
                }

                break;
            case ">":
                contador++;
                if (contador >= 0 && contador < inventario.size()) {
                    nombre.setText(inventario.get(contador).getNombre());
                    potencia.setText(String.valueOf(inventario.get(contador).getPotencia()));
                }
                if (contador > inventario.size()-1) {
                    borrarDatos();
                    contador = inventario.size();
                }
                break;
            default:
                System.out.println("0");
                ;
        }

    }
}

package programation.personal.gui;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Console {

    private static ArrayList<Persona> list = new ArrayList();

    public static void x(String x, int y) {

        Persona newPerson = new Persona(x, y);
        list.add(newPerson);

    }

    public static void y() {
        String datos = "Lista.-";
        for (Persona objects : list) {
            datos += "\n" + objects.getNombre() + "\n";
        }
        JOptionPane.showMessageDialog(null, datos);
    }

    public static void main(String[] args) {
        int x;
        int y= 6;
        Scanner reader = new Scanner(System.in);
        Panel v1 = new Panel();

        v1.setVisible(true);
        //v2.setVisible(true);
        //x("Santiago", 16);
        //x("Pedro", 17);
        //y();

        System.out.println(String.valueOf(y));
    }

}

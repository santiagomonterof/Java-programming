package logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JLabel;

public class Archivo {

    public static void escribir(String ubicacion, String valor, boolean sobreescribir) {

        try {
            File archivo = new File(ubicacion);
            FileWriter escritor = new FileWriter(archivo, !sobreescribir);
            BufferedWriter buffer = new BufferedWriter(escritor);
            //BufferedWriter bw=new BufferedWriter(new FileWriter(path));

            buffer.write(valor);
            buffer.newLine();
            buffer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void leer(String ubicacion) {
        try {
            File archivo = new File(ubicacion);
            FileReader lector = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(lector);
            //BufferedWriter bw=new BufferedWriter(new FileWriter(path));
            String linea = buffer.readLine();
            while (linea != null) {
                if (linea.contains("|")) {
                    System.out.print(linea.split("\\|")[0] + "-->");
                    /*String[] datos=linea.split("\\|");
					JLabel test=new JLabel(datos[0]);
					test.setBounds(datos[1], datos[2], datos[3], height);*/
                }
                System.out.println(linea);
                linea = buffer.readLine();
            }
            buffer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

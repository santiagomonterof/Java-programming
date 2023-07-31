package programation.guardadocirculos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    
    public void escribir(String ubicacion, String valor) {
        
        try {
            File archivo = new File(ubicacion);
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            buffer.write(valor);
            buffer.close();
        } catch (IOException ex) {
            
        }
    }
    
    public String leer(String ubicacion) {
        String linea = "";
        try {
            File archivo = new File(ubicacion);
            FileReader lector = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(lector);
            linea = buffer.readLine();            
            buffer.close();
        } catch (IOException ex) {
            
        }
        return linea;
    }
 
    
}

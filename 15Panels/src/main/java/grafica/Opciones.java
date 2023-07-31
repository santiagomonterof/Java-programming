package grafica;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Opciones extends JPanel{
	
	private JButton btnArchivo=new JButton("Archivo");
	private JButton btnAyuda=new JButton("Ayuda");
	private JButton btnOpciones=new JButton("Opciones");
	
	public Opciones() {
		setBackground(Color.orange);
		add(btnArchivo);
		add(btnOpciones);
		add(btnAyuda);
	}

}

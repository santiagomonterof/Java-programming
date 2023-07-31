package grafica;


import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame{

	private Opciones panel_opciones=new Opciones();

	private Formulario formulario=new Formulario();
	
	public Ventana() {
		super("Panel - KeyListener");
		setSize(700, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel_opciones.setPreferredSize(new Dimension(100,100));
		panel_dibujo.setPreferredSize(new Dimension(100,100));
		//add(panel_opciones,BorderLayout.NORTH);
		//add(formulario,BorderLayout.CENTER);
		add(panel_dibujo,BorderLayout.CENTER);
		addKeyListener(panel_dibujo);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ventana();
	}
	
}

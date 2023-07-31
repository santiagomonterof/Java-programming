package grafica;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Formulario extends JPanel{

	// Elementos gráficos
	private JLabel lbNombre = new JLabel("Nombre");
	private JLabel lbTelefono = new JLabel("Telefono");
	private JLabel lbCorreo = new JLabel("Correo");

	private JTextField txtNombre = new JTextField("");
	private JTextField txtTelefono = new JTextField("");
	private JTextField txtCorreo = new JTextField("");

	private JButton btnVerLista = new JButton("Ver Lista");
	private JButton btnLimpiar = new JButton("Limpiar");
	private JButton btnGuardar = new JButton("Guardar");

	public Formulario() {
		
		/// setBounds(500, 500, 250, 500);
		setSize(400, 250);
		
		setLayout(null);
		prepararComponentes();
		
		// JOptionPane.showMessageDialog(this, "Soy un boton");
	}

	private void prepararComponentes() {
		// posicionar elementos graficos
		int x = 50, y = 20;
		lbNombre.setBounds(x, y, 80, 24);
		txtNombre.setBounds(x + 100, y, 150, 24);
		y += 40;
		lbTelefono.setBounds(x, y, 80, 24);
		txtTelefono.setBounds(x + 100, y, 150, 24);
		y += 40;
		lbCorreo.setBounds(x, y, 80, 24);
		txtCorreo.setBounds(x + 100, y, 150, 24);
		y += 60;
		btnVerLista.setBounds(x, y, 90, 24);
		btnLimpiar.setBounds(x + 90, y, 90, 24);
		btnGuardar.setBounds(x + 180, y, 90, 24);

		// agregar elementos a la ventana
		this.add(lbNombre);
		add(txtNombre);
		add(lbTelefono);
		add(lbCorreo);
		add(txtTelefono);
		add(txtCorreo);
		add(btnGuardar);
		add(btnLimpiar);
		add(btnVerLista);
	}
}

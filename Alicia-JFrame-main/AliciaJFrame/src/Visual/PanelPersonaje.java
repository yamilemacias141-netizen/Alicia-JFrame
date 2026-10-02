package Visual;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SpringLayout;

import Logica.Mundo;
import Logica.Personaje;

import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;

public class PanelPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;
	private Mundo mundo;


	/**
	 * Create the panel.
	 */
	public PanelPersonaje() 
	{
		setBounds(100, 100, 800, 400);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel cartelEPersonaje = new JLabel("Personaje");
		springLayout.putConstraint(SpringLayout.NORTH, cartelEPersonaje, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, cartelEPersonaje, 348, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, cartelEPersonaje, 56, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, cartelEPersonaje, -342, SpringLayout.EAST, this);
		cartelEPersonaje.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(cartelEPersonaje);
		
		JLabel textoIngresarNombre = new JLabel("Ingresar ID");
		springLayout.putConstraint(SpringLayout.NORTH, textoIngresarNombre, 63, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, textoIngresarNombre, 153, SpringLayout.WEST, this);
		textoIngresarNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(textoIngresarNombre);
		
	
		
		
		JLabel mostrarSecretos = new JLabel("Secretos:");
		springLayout.putConstraint(SpringLayout.NORTH, mostrarSecretos, 34, SpringLayout.SOUTH, textoIngresarNombre);
		springLayout.putConstraint(SpringLayout.WEST, mostrarSecretos, 146, SpringLayout.WEST, this);
		mostrarSecretos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(mostrarSecretos);
		
		JLabel mostrarUbicacion = new JLabel("Ubicacion:");
		springLayout.putConstraint(SpringLayout.NORTH, mostrarUbicacion, 32, SpringLayout.SOUTH, mostrarSecretos);
		springLayout.putConstraint(SpringLayout.WEST, mostrarUbicacion, 0, SpringLayout.WEST, mostrarSecretos);
		mostrarUbicacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(mostrarUbicacion);
		
		JLabel textoLocura = new JLabel("Locura:");
		textoLocura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		springLayout.putConstraint(SpringLayout.NORTH, textoLocura, 36, SpringLayout.SOUTH, mostrarUbicacion);
		springLayout.putConstraint(SpringLayout.WEST, textoLocura, 0, SpringLayout.WEST, mostrarSecretos);
		add(textoLocura);
		
		JProgressBar progressBar = new JProgressBar();
		springLayout.putConstraint(SpringLayout.NORTH, progressBar, -152, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, progressBar, 102, SpringLayout.EAST, textoLocura);
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar, 0, SpringLayout.SOUTH, textoLocura);
		springLayout.putConstraint(SpringLayout.EAST, progressBar, 299, SpringLayout.EAST, textoLocura);
		add(progressBar);
		
		JSpinner ingresarId = new JSpinner();
		springLayout.putConstraint(SpringLayout.NORTH, ingresarId, 6, SpringLayout.SOUTH, cartelEPersonaje);
		springLayout.putConstraint(SpringLayout.WEST, ingresarId, 83, SpringLayout.EAST, textoIngresarNombre);
		springLayout.putConstraint(SpringLayout.SOUTH, ingresarId, 39, SpringLayout.SOUTH, cartelEPersonaje);
		springLayout.putConstraint(SpringLayout.EAST, ingresarId, 149, SpringLayout.EAST, textoIngresarNombre);
		add(ingresarId);
		
		
		
		
		
		

	}
}

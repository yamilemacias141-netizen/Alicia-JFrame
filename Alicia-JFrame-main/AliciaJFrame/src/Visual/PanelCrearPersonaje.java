package Visual;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Mundo;
import Logica.Personaje;

import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class PanelCrearPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;
	

	
	
	/**
	 * Create the panel.
	 */
	public PanelCrearPersonaje() 
	{
		setBounds(100, 100, 800, 400);
		setLayout(null);
		
		JLabel CartelPersonaje = new JLabel("Crar Personaje");
		CartelPersonaje.setFont(new Font("Tahoma", Font.BOLD, 19));
		CartelPersonaje.setBounds(301, 34, 94, 23);
		add(CartelPersonaje);
		
		JLabel TextoUbicacion = new JLabel("Ubicacion:");
		TextoUbicacion.setFont(new Font("Tahoma", Font.BOLD, 15));
		TextoUbicacion.setBounds(130, 154, 78, 19);
		add(TextoUbicacion);
		
		JLabel TextoSecretos = new JLabel("Secretos:");
		TextoSecretos.setFont(new Font("Tahoma", Font.BOLD, 15));
		TextoSecretos.setBounds(133, 115, 71, 19);
		add(TextoSecretos);
		
		JLabel TextoLocura = new JLabel("Locura");
		TextoLocura.setFont(new Font("Tahoma", Font.BOLD, 15));
		TextoLocura.setBounds(133, 194, 51, 19);
		add(TextoLocura);
		
		JSpinner IngresarSecretos = new JSpinner();
		IngresarSecretos.setBounds(266, 113, 95, 20);
		add(IngresarSecretos);
		IngresarSecretos.setModel(new SpinnerNumberModel(Integer.valueOf(0), null, null, Integer.valueOf(1)));
		
		JLabel TextoNombre = new JLabel("Nombre:");
		TextoNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		TextoNombre.setBounds(132, 75, 64, 19);
		add(TextoNombre);
		
		JSpinner IngresarUbicacion = new JSpinner();
		IngresarUbicacion.setBounds(266, 155, 95, 20);
		add(IngresarUbicacion);
		
		JSpinner IngresarLocura = new JSpinner();
		IngresarLocura.setBounds(266, 195, 95, 19);
		add(IngresarLocura);
		
		JTextField IngresarNombre = new JTextField();
		IngresarNombre.setColumns(10);
		IngresarNombre.setBounds(266, 76, 86, 20);
		add(IngresarNombre);
		
		JLabel textoConfirmacion = new JLabel("SE CREO CON EXITO");
		textoConfirmacion.setFont(new Font("Tahoma", Font.BOLD, 25));
		textoConfirmacion.setBounds(241, 301, 272, 19);
		add(textoConfirmacion);
		textoConfirmacion.setVisible(false);
		
		JButton botonCrear = new JButton("CREAR");
		botonCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String nombre = (String) IngresarNombre.getText();
				int secreto = (int) IngresarSecretos.getValue();
				int ubicacion = (int) IngresarUbicacion.getValue();
				int locura = (int) IngresarLocura.getValue();
				
			
				Personaje p = new Personaje( nombre, secreto,ubicacion,locura);
				
				textoConfirmacion.setVisible(true);
			
			}
		});
		botonCrear.setFont(new Font("Tahoma", Font.PLAIN, 25));
		botonCrear.setBounds(290, 373, 130, 23);
		add(botonCrear);
		
	
		

	}
}

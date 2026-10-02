package Visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Mundo;

import javax.swing.SpringLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cl;
	private PanelCrearPersonaje panelCrearPersonaje;
	private PanelMundo panelMundo;
	private PanelPersonaje panelPersonaje;
	
	


	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
					
				    
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		cl = new CardLayout();
		getContentPane().setLayout(cl);
		
		
	
		
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, -3837, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 641, SpringLayout.WEST, contentPane);
		contentPane.add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JComboBox comboCrearPersonaje = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboCrearPersonaje, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, comboCrearPersonaje, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, comboCrearPersonaje, 106, SpringLayout.WEST, panel);
		comboCrearPersonaje.setModel(new DefaultComboBoxModel(new String[] {"CrearPersonaje"}));
		panel.add(comboCrearPersonaje);
		
		JComboBox comboPersonaje = new JComboBox();
		sl_panel.putConstraint(SpringLayout.WEST, comboPersonaje, 6, SpringLayout.EAST, comboCrearPersonaje);
		sl_panel.putConstraint(SpringLayout.SOUTH, comboCrearPersonaje, 0, SpringLayout.SOUTH, comboPersonaje);
		comboPersonaje.setModel(new DefaultComboBoxModel(new String[] {"Personaje"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboPersonaje, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, comboPersonaje, 42, SpringLayout.NORTH, panel);
		panel.add(comboPersonaje);
		
		JComboBox comboMundo = new JComboBox();
		sl_panel.putConstraint(SpringLayout.EAST, comboPersonaje, -6, SpringLayout.WEST, comboMundo);
		sl_panel.putConstraint(SpringLayout.SOUTH, comboMundo, -509, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, comboMundo, -479, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, comboMundo, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, comboMundo, 204, SpringLayout.WEST, panel);
		comboMundo.setModel(new DefaultComboBoxModel(new String[] {"Mundo", ""}));
		panel.add(comboMundo);
		
		

	}
}

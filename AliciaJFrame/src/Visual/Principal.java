package Visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Mundo;

import javax.swing.SpringLayout;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	private Mundo mundo = new Mundo();
	
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
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 42, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 641, SpringLayout.WEST, contentPane);
		contentPane.add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JComboBox comboPersonaje = new JComboBox();
		comboPersonaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				PanelPersonaje p = new PanelPersonaje(mundo);
				contentPane.add(p);
			}
		});
		comboPersonaje.setModel(new DefaultComboBoxModel(new String[] {"Personaje"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboPersonaje, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, comboPersonaje, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, comboPersonaje, 0, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, comboPersonaje, 100, SpringLayout.WEST, panel);
		panel.add(comboPersonaje);
		
		JComboBox comboMundo = new JComboBox();
		comboMundo.setModel(new DefaultComboBoxModel(new String[] {"Mundo"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboMundo, 0, SpringLayout.NORTH, comboPersonaje);
		sl_panel.putConstraint(SpringLayout.WEST, comboMundo, 6, SpringLayout.EAST, comboPersonaje);
		sl_panel.putConstraint(SpringLayout.SOUTH, comboMundo, 0, SpringLayout.SOUTH, comboPersonaje);
		sl_panel.putConstraint(SpringLayout.EAST, comboMundo, 106, SpringLayout.EAST, comboPersonaje);
		panel.add(comboMundo);
		
		

	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.io.IOException;
import java.lang.Integer;
import java.util.Map;
import java.util.Scanner;
import org.jpl7.*;
import javax.swing.*;
import java.awt.*;

public class Ventana {

	private JFrame frmTaller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frmTaller.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTaller = new JFrame();
		frmTaller.setTitle("Ingrese una opcion");
		frmTaller.setBounds(100, 100, 450, 300);
		frmTaller.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTaller.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmTaller.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		frmTaller.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel NADA = new JLabel("no se ha precionado nada");
		panel_1.add(NADA);
		
		JButton btnNewButton = new JButton("Cantidad de alimentos y comidas por dia");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NADA.setText("Opcion 1 OK");
				
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Recomendacion de comida diaria");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NADA.setText("Opcion 2 OK");
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cantidad de calorias por dia");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NADA.setText("Opcion 3 OK");
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Recomendacion a travez de consumo diario o mensual de calorias");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NADA.setText("Opcion 4  OK");
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Comidas y calorias consumidas por dia ");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_1_1 = new JButton("Salir");
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_3_1_1);
	
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}

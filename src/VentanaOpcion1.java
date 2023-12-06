import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jpl7.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class VentanaOpcion1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;


	public static void main(String[] args)throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					VentanaOpcion1 frame = new VentanaOpcion1();
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
	public VentanaOpcion1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 299);
		getContentPane().setLayout(null);
		
		JLabel lblEligaUnDia = new JLabel("Eliga un dia a revisar");
		lblEligaUnDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblEligaUnDia.setForeground(Color.BLACK);
		lblEligaUnDia.setBackground(Color.RED);
		lblEligaUnDia.setBounds(80, 11, 164, 39);
		getContentPane().add(lblEligaUnDia);
		
		textField = new JTextField();
		textField.setBounds(119, 44, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 10);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(90, 139, 145, 39);
		getContentPane().add(lblNewLabel);
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() 
		
		{
			public void actionPerformed(ActionEvent e) {
				
				
				
				  Query q1 = 
			                new Query( 
			                "consult", 
			                new Term[] {new Atom("C:\\Users\\Hans\\eclipse-workspace\\Taller2\\src\\taller2_nuevo.pl")} 
			                );
				  
				  
				  
				 Variable X = new Variable("X");
			     
			        
			        //Y entregara la opción adecuada segun la cantidad de calorías consumidas en un día
			        Variable Opcion = new Variable("Opcion");
				 Query q4 = 
				          new Query( 
				          
				              ("ccaloriasporDia"), 
				              new Term[] {new Atom("d1"),X,Opcion} 
				              
				              
				          );

				        java.util.Map<String,Term> solution;
				lblNewLabel.setText( "consult " + (q1.hasSolution() ? "Programa listo!" : "Algo fallo en el sistema!"));
				
			}
		});
		btnNewButton.setBounds(116, 75, 89, 23);
		getContentPane().add(btnNewButton);
		
	
		
	}
	public void iniciarComponentes() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}
}

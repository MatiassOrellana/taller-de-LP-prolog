import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaOpcion3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOpcion3 frame = new VentanaOpcion3();
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
	public VentanaOpcion3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 333, 222);
		getContentPane().setLayout(null);
		
		JLabel lblEligaUnDia = new JLabel("Eliga un dia a revisar");
		lblEligaUnDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblEligaUnDia.setForeground(Color.BLACK);
		lblEligaUnDia.setBackground(Color.RED);
		lblEligaUnDia.setBounds(66, 11, 164, 39);
		getContentPane().add(lblEligaUnDia);
		
		textField = new JTextField();
		textField.setBounds(106, 44, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(103, 88, 89, 23);
		getContentPane().add(btnNewButton);
		
	}
	public void iniciarComponentes() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}
}

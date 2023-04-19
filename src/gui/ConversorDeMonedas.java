package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversorDeMonedas extends JFrame {

	private JPanel contentPane;
	private JTextField txtConvertir;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorDeMonedas frame = new ConversorDeMonedas();
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
	public ConversorDeMonedas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor de Temperatura");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(103, 22, 556, 61);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione las medidas a las  que desee hacer la conversión:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(24, 108, 569, 30);
		contentPane.add(lblNewLabel_1);
		
		JComboBox cmbMoneda1 = new JComboBox();
		cmbMoneda1.setToolTipText("");
		cmbMoneda1.setForeground(new Color(102, 255, 153));
		cmbMoneda1.setFont(new Font("Tahoma", Font.BOLD, 18));
		cmbMoneda1.setBackground(SystemColor.scrollbar);
		cmbMoneda1.setModel(new DefaultComboBoxModel(new String[] {"--", "Colones (CRC)", "Dolares (USD)", "Euros (EUR)", "Peso Mexico (MXN)"}));
		cmbMoneda1.setSelectedIndex(1);
		cmbMoneda1.setBounds(24, 151, 269, 67);
		contentPane.add(cmbMoneda1);
		
		JComboBox cmbMoneda2 = new JComboBox();
		cmbMoneda2.setForeground(new Color(102, 255, 153));
		cmbMoneda2.setFont(new Font("Tahoma", Font.BOLD, 18));
		cmbMoneda2.setModel(new DefaultComboBoxModel(new String[] {"--", "Colones (CRC)", "Dolares (USD)", "Euros (EUR)", "Peso Mexico (MXN)"}));
		cmbMoneda2.setSelectedIndex(1);
		cmbMoneda2.setBackground(SystemColor.scrollbar);
		cmbMoneda2.setBounds(399, 151, 269, 67);
		contentPane.add(cmbMoneda2);
		
		txtConvertir = new JTextField();
		txtConvertir.setBackground(SystemColor.window);
		txtConvertir.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtConvertir.setBounds(24, 259, 269, 67);
		contentPane.add(txtConvertir);
		txtConvertir.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Escriba la cantidad a convertir: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(24, 226, 511, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setForeground(Color.RED);
		btnConvertir.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\gitProyects\\ConversorDeMonedas\\src\\recursos\\img\\CambioMoneda.png"));
		btnConvertir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnConvertir.setBounds(399, 259, 269, 67);
		contentPane.add(btnConvertir);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Resultado:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(24, 359, 106, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtResultado.setBackground(SystemColor.activeCaption);
		txtResultado.setForeground(new Color(0, 0, 0));
		txtResultado.setEditable(false);
		txtResultado.setBounds(160, 359, 337, 82);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnSalir = new JButton(" Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setForeground(Color.RED);
		btnSalir.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\gitProyects\\ConversorDeMonedas\\src\\recursos\\img\\salir.png"));
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSalir.setBounds(85, 479, 249, 82);
		contentPane.add(btnSalir);
		
		JButton btnMenu = new JButton(" Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();

                PantallaPrincipal princ = new PantallaPrincipal();
                princ.setVisible(true);
			}
		});
		btnMenu.setForeground(SystemColor.textHighlight);
		btnMenu.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\gitProyects\\ConversorDeMonedas\\src\\recursos\\img\\Menu.png"));
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMenu.setBounds(419, 479, 249, 82);
		contentPane.add(btnMenu);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtConvertir.setText("");
				txtResultado.setText("");
				cmbMoneda1.setSelectedIndex(0);
				cmbMoneda2.setSelectedIndex(0);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(550, 359, 169, 82);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\gitProyects\\ConversorDeMonedas\\src\\recursos\\img\\fondo1.jpg"));
		lblNewLabel_2.setBounds(0, 0, 777, 613);
		contentPane.add(lblNewLabel_2);
	}
}

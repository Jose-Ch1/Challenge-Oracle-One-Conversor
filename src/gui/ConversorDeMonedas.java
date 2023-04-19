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
		cmbMoneda1.setForeground(SystemColor.activeCaption);
		cmbMoneda1.setFont(new Font("Tahoma", Font.BOLD, 18));
		cmbMoneda1.setBackground(SystemColor.desktop);
		cmbMoneda1.setModel(new DefaultComboBoxModel(new String[] {"Grados Celsius (°C).", "Grados Fahrenheit (°F).", "Kelvin (K)."}));
		cmbMoneda1.setSelectedIndex(1);
		cmbMoneda1.setBounds(24, 151, 269, 67);
		contentPane.add(cmbMoneda1);
		
		JComboBox cmbMoneda2 = new JComboBox();
		cmbMoneda2.setForeground(SystemColor.activeCaption);
		cmbMoneda2.setFont(new Font("Tahoma", Font.BOLD, 18));
		cmbMoneda2.setModel(new DefaultComboBoxModel(new String[] {"Grados Celsius (°C).", "Grados Fahrenheit (°F).", "Kelvin (K)."}));
		cmbMoneda2.setSelectedIndex(1);
		cmbMoneda2.setBackground(SystemColor.textHighlight);
		cmbMoneda2.setBounds(399, 151, 269, 67);
		contentPane.add(cmbMoneda2);
		
		txtConvertir = new JTextField();
		txtConvertir.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtConvertir.setBounds(24, 259, 269, 67);
		contentPane.add(txtConvertir);
		txtConvertir.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Escriba la cantidad a convertir: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(24, 226, 511, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnConvertir = new JButton("Convertir");
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
		txtResultado.setForeground(SystemColor.desktop);
		txtResultado.setEditable(false);
		txtResultado.setBounds(160, 359, 337, 82);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnSalir = new JButton(" Salir");
		btnSalir.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\gitProyects\\ConversorDeMonedas\\src\\recursos\\img\\salir.png"));
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSalir.setBounds(85, 479, 249, 82);
		contentPane.add(btnSalir);
		
		JButton btnMenu = new JButton(" Menu");
		btnMenu.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\gitProyects\\ConversorDeMonedas\\src\\recursos\\img\\Menu.png"));
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMenu.setBounds(419, 479, 249, 82);
		contentPane.add(btnMenu);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\gitProyects\\ConversorDeMonedas\\src\\recursos\\img\\fondo1.jpg"));
		lblNewLabel_2.setBounds(0, 0, 777, 613);
		contentPane.add(lblNewLabel_2);
	}
}

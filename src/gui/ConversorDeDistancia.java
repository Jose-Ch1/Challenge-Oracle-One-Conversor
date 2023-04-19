package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import logica.LogicaConversor;

public class ConversorDeDistancia extends JFrame {

	private JPanel contentPane;
	private JTextField txtConvertir;
	private JTextField txtResultado;

	double valor;
	int distancia1;
	int distancia2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorDeDistancia frame = new ConversorDeDistancia();
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
	public ConversorDeDistancia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor de Distancia");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(163, 21, 556, 61);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione las medidas a las  que desea hacer la conversión:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(24, 108, 569, 30);
		contentPane.add(lblNewLabel_1);
		
		JComboBox cmbDist1 = new JComboBox();
		cmbDist1.setToolTipText("");
		cmbDist1.setForeground(new Color(102, 255, 153));
		cmbDist1.setFont(new Font("Tahoma", Font.BOLD, 18));
		cmbDist1.setBackground(SystemColor.scrollbar);
		cmbDist1.setModel(new DefaultComboBoxModel(new String[] {"--", "Centímetros ", "Metro", "kilómetros"}));
		cmbDist1.setSelectedIndex(1);
		cmbDist1.setBounds(24, 151, 269, 67);
		contentPane.add(cmbDist1);
		
		JComboBox cmbDist2 = new JComboBox();
		cmbDist2.setForeground(new Color(102, 255, 153));
		cmbDist2.setFont(new Font("Tahoma", Font.BOLD, 18));
		cmbDist2.setModel(new DefaultComboBoxModel(new String[] {"--", "Centímetros ", "Metro", "kilómetros"}));
		cmbDist2.setSelectedIndex(1);
		cmbDist2.setBackground(SystemColor.scrollbar);
		cmbDist2.setBounds(399, 151, 269, 67);
		contentPane.add(cmbDist2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Escriba la cantidad a convertir: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(24, 226, 511, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//creamos las variables para itilizarlas en la parte logica
				valor = Double.parseDouble(txtConvertir.getText());
				distancia1 = cmbDist1.getSelectedIndex();
				distancia2 = cmbDist2.getSelectedIndex();
				
				//lamamos la parte logica de la aplicacion para crear un puente y conectarlas entre si
				LogicaConversor puente2 = new LogicaConversor();
				
				// Enviamos los datos a las variables de la parte logica
				puente2.setValor(valor);
				puente2.setDatoConv1(distancia1);
				puente2.setDatoConv2(distancia2);
				
				//para ejecutar el metodo tenemos que llamarlo
				double resultadoFinal = puente2.convertirMedidas();
				
				txtResultado.setText("");
				txtResultado.setText(String.valueOf(resultadoFinal));
				
				
				
				
				
			}
		});
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
		txtResultado.setFont(new Font("Tahoma", Font.BOLD, 30));
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
				cmbDist1.setSelectedIndex(0);
				cmbDist2.setSelectedIndex(0);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(550, 359, 169, 82);
		contentPane.add(btnNewButton);
		
		txtConvertir = new JTextField();
		txtConvertir.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtConvertir.setColumns(10);
		txtConvertir.setBackground(Color.WHITE);
		txtConvertir.setBounds(24, 264, 269, 67);
		contentPane.add(txtConvertir);
		
		txtResultado = new JTextField();
		txtResultado.setForeground(Color.BLACK);
		txtResultado.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtResultado.setEditable(false);
		txtResultado.setColumns(10);
		txtResultado.setBackground(SystemColor.activeCaption);
		txtResultado.setBounds(152, 359, 337, 82);
		contentPane.add(txtResultado);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\gitProyects\\ConversorDeMonedas\\src\\recursos\\img\\fondo.jpg"));
		lblNewLabel_2.setBounds(0, 0, 777, 613);
		contentPane.add(lblNewLabel_2);
	}
}

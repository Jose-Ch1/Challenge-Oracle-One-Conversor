package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PantallaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal frame = new PantallaPrincipal();
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
	public PantallaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 545);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Programa Conversor");
		lblNewLabel.setBackground(SystemColor.textHighlightText);
		lblNewLabel.setForeground(SystemColor.desktop);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(200, 8, 399, 86);
		contentPane.add(lblNewLabel);
		
		JButton brnConvDivisas = new JButton("Conversor de Divisas");
		brnConvDivisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				ConversorDeMonedas CMonedas = new ConversorDeMonedas();
				CMonedas.setVisible(true);
				CMonedas.setLocationRelativeTo(null);
			}
		});
		brnConvDivisas.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\gitProyects\\ConversorDeMonedas\\src\\recursos\\img\\moneda.png"));
		brnConvDivisas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		brnConvDivisas.setBounds(29, 149, 271, 64);
		contentPane.add(brnConvDivisas);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione el conversor que desee utilizar:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(29, 102, 352, 24);
		contentPane.add(lblNewLabel_1);
		
		JButton brnConvTemperatura = new JButton("Conversor de Temperatura");
		brnConvTemperatura.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\gitProyects\\ConversorDeMonedas\\src\\recursos\\img\\temperatura.png"));
		brnConvTemperatura.setFont(new Font("Tahoma", Font.PLAIN, 16));
		brnConvTemperatura.setBounds(29, 241, 271, 64);
		contentPane.add(brnConvTemperatura);
		
		JButton brnConvDistancia = new JButton("Conversor de Distancia");
		brnConvDistancia.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\gitProyects\\ConversorDeMonedas\\src\\recursos\\img\\distancia.png"));
		brnConvDistancia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		brnConvDistancia.setBounds(29, 335, 271, 64);
		contentPane.add(brnConvDistancia);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\gitProyects\\ConversorDeMonedas\\src\\recursos\\img\\salir.png"));
		btnSalir.setForeground(Color.RED);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSalir.setBounds(266, 433, 186, 51);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\gitProyects\\ConversorDeMonedas\\src\\recursos\\img\\Conversor.png"));
		lblNewLabel_2.setBounds(409, 102, 352, 304);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\gitProyects\\ConversorDeMonedas\\src\\recursos\\img\\fondo.jpg"));
		lblNewLabel_3.setBounds(0, 0, 791, 508);
		contentPane.add(lblNewLabel_3);
	}
}

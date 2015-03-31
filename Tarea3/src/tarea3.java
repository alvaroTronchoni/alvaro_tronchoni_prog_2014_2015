import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class tarea3 extends JFrame {

	private JPanel contentPane;
	private JTextField caja;
	private JTextField caja3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tarea3 frame = new tarea3();
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
	public tarea3() {
		
		int valor=15;
		float decimal= 4.25f;
		boolean si=true;
		String valorString;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//campo para etiquetas
		JLabel etiqueta = new JLabel("");
		etiqueta.setBounds(10, 11, 86, 14);
		etiqueta.setText("variable");
		contentPane.add(etiqueta);
		
		//campo para escribir texto
		
		caja = new JTextField();
		caja.setBounds(10, 36, 86, 20);
		contentPane.add(caja);
		caja.setColumns(10);
		
		
		
		
		JLabel etiqueta3 = new JLabel("boolean");
		etiqueta3.setBounds(10, 123, 86, 14);
		contentPane.add(etiqueta3);
		
		caja3 = new JTextField();
		caja3.setColumns(10);
		caja3.setBounds(10, 148, 86, 20);
		contentPane.add(caja3);
		
		
		
		JButton boton = new JButton("copiar");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				caja3.setText(caja.getText());
			}
		});
		boton.setBounds(10, 89, 89, 23);
		contentPane.add(boton);
	}
}

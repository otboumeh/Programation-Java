package Ejercicio4;

import java.awt.EventQueue;
import javax.swing.ImageIcon;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejer04Carrusel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer04Carrusel frame = new Ejer04Carrusel();
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
	public Ejer04Carrusel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		ImageIcon[] imagenes = new ImageIcon[5];
		imagenes[0] = new ImageIcon(this.getClass().getResource("0.jpg"));
		imagenes[1] = new ImageIcon(this.getClass().getResource("1.jpg"));
		imagenes[2] = new ImageIcon(this.getClass().getResource("22.jpg"));
		imagenes[3] = new ImageIcon(this.getClass().getResource("3.jpg"));
		imagenes[4] = new ImageIcon(this.getClass().getResource("4.jpg"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setIcon(imagenes[i]);

		label.setBounds(0, -30, 1002, 662);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("FIN");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i = 4;
				label.setIcon(imagenes[i]);
			}
		});
		btnNewButton.setBounds(752, 615, 128, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(i < 4) {
					i++;
					label.setIcon(imagenes[i]);
				}
				
			}
		});
		btnNewButton_1.setBounds(532, 615, 128, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("<<");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (i > 0) {
					i--;
				label.setIcon(imagenes[i]);
			}}
		});
		btnNewButton_2.setBounds(295, 615, 128, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Inicio");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i = 0;
				label.setIcon(imagenes[i]);
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(59, 615, 147, 23);
		contentPane.add(btnNewButton_3);
		
	}
}

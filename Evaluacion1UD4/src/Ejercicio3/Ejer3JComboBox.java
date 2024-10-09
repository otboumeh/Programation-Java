package Ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejer3JComboBox extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer3JComboBox frame = new Ejer3JComboBox();
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
	public Ejer3JComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 750, 500);
		contentPane = new JPanel();
		contentPane.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {

			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(254, 80, 149, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(254, 135, 149, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(254, 190, 149, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(254, 251, 149, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(254, 310, 149, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "DNI", "NIE" }));
		comboBox.setEditable(true);
		comboBox.setMaximumRowCount(2);
		comboBox.setBounds(292, 221, 89, 22);
		contentPane.add(comboBox);

		btnNewButton = new JButton("OK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tipoIdSeleccionado = comboBox.getSelectedItem().toString(); // this is very important to do the
																					// check

				String dni = textField_4.getText();
				if (textField.getText().length() > 0 && textField_1.getText().length() > 0
						&& textField_2.getText().length() > 0 && textField_3.getText().length() > 0
						&& tipoIdSeleccionado.equals("DNI")) {
					if (dni.matches("\\d{8}[A-Z]")) {
						JOptionPane.showMessageDialog(null, "Datos introducidos correctamente.");
					} else {
						JOptionPane.showMessageDialog(null, "Error 1 ");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Error 2 ");
				}
			}
		});
		btnNewButton.setBounds(242, 387, 89, 23);
		contentPane.add(btnNewButton);

		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(298, 49, 83, 14);
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Apellido1");
		lblNewLabel_1.setBounds(298, 111, 83, 14);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Apellido 2");
		lblNewLabel_2.setBounds(298, 165, 83, 14);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_4 = new JLabel("Edad");
		lblNewLabel_4.setBounds(298, 285, 83, 14);
		contentPane.add(lblNewLabel_4);

		btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setBounds(366, 387, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}

package Ejercicio7;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Ejercicio7 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nombreField;
	private JTextField apellidoField;
	private JTextField dniField;
	private JTextField telefonoField;
	 private   int i = 0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio7 frame = new Ejercicio7();
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
	public Ejercicio7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 125, 382, 125);
		contentPane.add(scrollPane);
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellidos");
		modelo.addColumn("DNI");
		modelo.addColumn("Telélefono");
		JTable table = new JTable (modelo);
		scrollPane.add(table);
		scrollPane.setViewportView(table);
		table.getTableHeader().setFont(new Font ("arial", 1, 13));
	  

		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		int selectedRow = table.getSelectedRow();
//		int selectedColumn = table.getSelectedColumn();
//		 if (selectedRow != -1) {
//			 modelo.removeRow(selectedRow);	
//			 }
//		
		 JButton deleteButton = new JButton("Eliminar fila");
		    deleteButton.setBounds(150, 260, 150, 30);
		    contentPane.add(deleteButton);
		    
		    nombreField = new JTextField();
		    nombreField.setBounds(108, 11, 176, 20);
		    contentPane.add(nombreField);
		    nombreField.setColumns(10);
		    
		    apellidoField = new JTextField();
		    apellidoField.setBounds(108, 42, 176, 20);
		    contentPane.add(apellidoField);
		    apellidoField.setColumns(10);
		    
		    dniField = new JTextField();
		    dniField.setBounds(108, 73, 176, 20);
		    contentPane.add(dniField);
		    dniField.setColumns(10);
		    
		    telefonoField = new JTextField();
		    telefonoField.setBounds(108, 104, 176, 20);
		    contentPane.add(telefonoField);
		    telefonoField.setColumns(10);
		    
		    JLabel lblNewLabel = new JLabel("Nombre");
		    lblNewLabel.setBounds(34, 14, 46, 14);
		    contentPane.add(lblNewLabel);
		    
		    JButton addBtn = new JButton("Añadir");
		    addBtn.addMouseListener(new MouseAdapter() {
		    	public void mouseClicked(MouseEvent e) {
		    		addRow(modelo);	
		    	}
		    });
		    addBtn.setBounds(345, 104, 79, 20);
		    contentPane.add(addBtn);
		    
		    JLabel lblNewLabel_1 = new JLabel("Apellido");
		    lblNewLabel_1.setBounds(34, 45, 46, 14);
		    contentPane.add(lblNewLabel_1);
		    
		    JLabel lblNewLabel_2 = new JLabel("DNI");
		    lblNewLabel_2.setBounds(34, 76, 46, 14);
		    contentPane.add(lblNewLabel_2);
		    
		    JLabel lblNewLabel_3 = new JLabel("Teléfono");
		    lblNewLabel_3.setBounds(24, 107, 74, 14);
		    contentPane.add(lblNewLabel_3);
		    
		    	  
	
	}
	private void addRow(DefaultTableModel modelo) {
	    // Clear the table model
	    modelo.setRowCount(0);
	    if (i < 5)
	     {
	        String[] row = {"","","",""};
	        modelo.addRow(row);
	        i++;
	    }
	}
}

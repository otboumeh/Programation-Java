package Ejercicio6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejer06Calculadora extends JFrame {
	 private int firstNumber;
	 private int secondNumber;
	 private String operation;
	 private boolean flag;
	 private 	Integer result = 0;


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer06Calculadora frame = new Ejer06Calculadora();
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
	public Ejer06Calculadora() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(383, 23, 211, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(result != 0) {
					textField.setText("");
				}
				String currentText = textField.getText();
				textField.setText(currentText + "7");
			}
		});
		btn7.setBounds(65, 163, 89, 23);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(result != 0) {
					textField.setText("");
				}
				String currentText = textField.getText();
				textField.setText(currentText + "8");
			}
		});
		btn8.setBounds(210, 163, 89, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(result != 0) {
					textField.setText("");
				}
				String currentText = textField.getText();
				textField.setText(currentText + "9");
			}
		});
		btn9.setBounds(343, 163, 89, 23);
		contentPane.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(result != 0) {
					textField.setText("");
				}
				String currentText = textField.getText();
				textField.setText(currentText + "4");
			}
		});
		btn4.setBounds(65, 230, 89, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(result != 0) {
					textField.setText("");
				}
				String currentText = textField.getText();
				textField.setText(currentText + "5");
			}
		});
		btn5.setBounds(210, 230, 89, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(result != 0) {
					textField.setText("");
				}
				String currentText = textField.getText();
				textField.setText(currentText + "6");
			}
		});
		btn6.setBounds(343, 230, 89, 23);
		contentPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(result != 0) {
					textField.setText("");
				}
				String currentText = textField.getText();
				textField.setText(currentText + "1");
			}
			
		});
		btn1.setBounds(65, 291, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(result != 0) {
					textField.setText("");
				}
				String currentText = textField.getText();
				textField.setText(currentText + "2");
			}
		});
		btn2.setBounds(210, 291, 89, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(result != 0) {
					textField.setText("");
				}
				String currentText = textField.getText();
				textField.setText(currentText + "3");
			}
		});
		btn3.setBounds(343, 291, 89, 23);
		contentPane.add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(result != 0) {
					textField.setText("");
				}
				String currentText = textField.getText();
				textField.setText(currentText + "0");
			}
		});
		btn0.setBounds(65, 363, 89, 23);
		contentPane.add(btn0);
		
		JButton btn_igual = new JButton("=");
		btn_igual.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				secondNumber = Integer.parseInt(textField.getText());
				if(operation.equals("+")) {
					result = firstNumber + secondNumber;
				}
				else if(operation.equals("-")) {
					result = firstNumber - secondNumber;
				}
				else if(operation.equals("*")) {
					result = firstNumber * secondNumber;
				}
				else if(operation.equals("/")) {
					result = firstNumber / secondNumber;
				}
				else if(operation=="k") {
					firstNumber=0;
					 secondNumber=0;
						textField.setText("");

				}
				else {
					textField.setText("");
				}
				 textField.setText(Integer.toString(result));
				 firstNumber=0;
				 secondNumber=0;
				 flag= false;
				 operation="k";
				 result =0;
				
			}
		});
		btn_igual.setBounds(185, 363, 229, 23);
		contentPane.add(btn_igual);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(flag == false) {
				firstNumber = Integer.parseInt(textField.getText());
				operation = "+";
				textField.setText("");
				flag = true;
			}}
		});
		btn_plus.setBounds(488, 163, 89, 23);
		contentPane.add(btn_plus);
		
		JButton btn_menos = new JButton("-");
		btn_menos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(flag==false) {
				firstNumber = Integer.parseInt(textField.getText());
				operation = "-";
				textField.setText("");
				flag = true;
				
			}}
		});
		btn_menos.setBounds(488, 230, 89, 23);
		contentPane.add(btn_menos);
		
		JButton btn_x = new JButton("*");
		btn_x.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (flag== false) {
				firstNumber = Integer.parseInt(textField.getText());
				operation = "*";
				textField.setText("");
				flag = true;
				}
			}
		});
		btn_x.setBounds(488, 291, 89, 23);
		contentPane.add(btn_x);
		
		JButton btn_dividir = new JButton("/");
		btn_dividir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (flag == false) {
				firstNumber = Integer.parseInt(textField.getText());
				operation = "/";
				textField.setText("");
				flag= true;
				}}
		});
		btn_dividir.setBounds(488, 363, 89, 23);
		contentPane.add(btn_dividir);
	}
}

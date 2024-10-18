package ejercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.CardLayout;

public class ejercicio5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio5 frame = new ejercicio5();
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
	public ejercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(new Color(255, 0, 0));
		contentPane.add(redPanel, "redPanel");
		redPanel.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Pulsa !");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 CardLayout layout = (CardLayout) getContentPane().getLayout();
			        
			        // Show the green panel (you'll use the name assigned to the panel)
			        layout.show(getContentPane(), "greenPanel");
			}
		});
		btnNewButton_2.setBounds(159, 105, 89, 23);
		redPanel.add(btnNewButton_2);
		
		JPanel bleuPanel = new JPanel();
		bleuPanel.setBackground(new Color(0, 0, 255));
		contentPane.add(bleuPanel, "bleuPanel");
		bleuPanel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Pulsa !");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout layout = (CardLayout) getContentPane().getLayout();
				layout.show(getContentPane(), "redPanel");
			}
		});
		btnNewButton_1.setBounds(165, 108, 89, 23);
		bleuPanel.add(btnNewButton_1);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(new Color(0, 255, 0));
		contentPane.add(greenPanel, "greenPanel");
		greenPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("Pulsa ! ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout layout = (CardLayout) getContentPane().getLayout();
				layout.show(getContentPane(), "bleuPanel");
			}
		});
		btnNewButton.setBounds(157, 120, 89, 23);
		greenPanel.add(btnNewButton);
	}
}

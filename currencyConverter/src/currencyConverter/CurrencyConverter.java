package currencyConverter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CurrencyConverter {

	private JFrame frame;
	private JTextField txtAmount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyConverter window = new CurrencyConverter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CurrencyConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(0, 0, 536, 95);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CURRENCY CONVERTER");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(79, 15, 358, 70);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 108, 495, 269);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the amount: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(30, 24, 205, 50);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("From:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(30, 110, 205, 50);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("To:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(30, 199, 205, 50);
		panel_1.add(lblNewLabel_1_1_1);
		
		txtAmount = new JTextField();
		txtAmount.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtAmount.setBounds(253, 25, 220, 50);
		panel_1.add(txtAmount);
		txtAmount.setColumns(10);
		
		final JComboBox txtFrom = new JComboBox();
		txtFrom.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtFrom.setModel(new DefaultComboBoxModel(new String[] {"USD", "EUR"}));
		txtFrom.setBounds(253, 110, 220, 50);
		panel_1.add(txtFrom);
		
		final JComboBox txtTo = new JComboBox();
		txtTo.setModel(new DefaultComboBoxModel(new String[] {"INR", "SLR"}));
		txtTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtTo.setBounds(253, 199, 220, 50);
		panel_1.add(txtTo);
		
		JButton btnNewButton = new JButton("CONVERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double total;
				
				double amount = Double.parseDouble(txtAmount.getText());
				
				if(txtFrom.getSelectedItem().toString()=="USD" && txtTo.getSelectedItem().toString() == "INR") {
					total = amount * 82.55;
					JOptionPane.showMessageDialog(null,"Converted Amount is: " + String.valueOf(total));
				}
				else if(txtFrom.getSelectedItem().toString() == "USD" && txtTo.getSelectedItem().toString() == "SLR") {
					total = amount * 324.20;
					JOptionPane.showMessageDialog(null,"Converted Amount is: " + String.valueOf(total));
				}
				else if(txtFrom.getSelectedItem().toString() == "EUR" && txtTo.getSelectedItem().toString() == "INR") {
					total = amount * 89.11;
					JOptionPane.showMessageDialog(null,"Converted Amount is: " + String.valueOf(total));
				}
				else if(txtFrom.getSelectedItem().toString() == "EUR" && txtTo.getSelectedItem().toString() == "SLR") {
					total = amount * 349.99;
					JOptionPane.showMessageDialog(null,"Converted Amount is: " + String.valueOf(total));
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(209, 394, 104, 47);
		frame.getContentPane().add(btnNewButton);
	}
}

package newGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class calculator {

	private JFrame frame;
	private JTextField num1txt;
	private JTextField num2txt;
	private JTextField operationtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 431, 517);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLocationRelativeTo(null); // Center Frame
		frame.getContentPane().setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBounds(0, 0, 420, 483);
		frame.getContentPane().add(contentPane);
		
		num1txt = new JTextField();
		num1txt.setHorizontalAlignment(SwingConstants.CENTER);
		num1txt.setFont(new Font("Arial", Font.BOLD, 18));
		num1txt.setColumns(10);
		num1txt.setBounds(146, 54, 264, 47);
		contentPane.add(num1txt);
		
		JLabel lblNewLabel = new JLabel("1st Number:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 54, 170, 47);
		contentPane.add(lblNewLabel);
		
		num2txt = new JTextField();
		num2txt.setHorizontalAlignment(SwingConstants.CENTER);
		num2txt.setFont(new Font("Arial", Font.BOLD, 18));
		num2txt.setColumns(10);
		num2txt.setBounds(146, 112, 264, 47);
		contentPane.add(num2txt);
		
		JLabel lblNewLabel_1 = new JLabel("2nd Number:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 112, 170, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel resultlbl = new JLabel("");
		resultlbl.setHorizontalAlignment(SwingConstants.CENTER);
		resultlbl.setFont(new Font("Arial", Font.BOLD, 32));
		resultlbl.setBounds(146, 346, 264, 76);
		contentPane.add(resultlbl);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Datatype Conversion
				// String to Integer = Integer.parseInt(String);
				// Integer to String = Integer.toString(Integer);
				
				int num1 = Integer.parseInt(num1txt.getText());
				int num2 = Integer.parseInt(num2txt.getText());
				String operation = operationtxt.getText();
				
				int result = 0;
				
				switch(operation) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid Operation!");
				}
				
				
				String parseResult = Integer.toString(result);
				resultlbl.setText(parseResult);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBounds(146, 288, 264, 47);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Result:");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 32));
		lblNewLabel_2.setBounds(10, 361, 170, 47);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Operation [ + , - , * , / ]");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 170, 400, 47);
		contentPane.add(lblNewLabel_1_1);
		
		operationtxt = new JTextField();
		operationtxt.setHorizontalAlignment(SwingConstants.CENTER);
		operationtxt.setFont(new Font("Arial", Font.BOLD, 18));
		operationtxt.setColumns(10);
		operationtxt.setBounds(146, 228, 264, 47);
		contentPane.add(operationtxt);
		
		JLabel lblNewLabel_3 = new JLabel("CALCULATOR");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_3.setBounds(0, 0, 420, 43);
		contentPane.add(lblNewLabel_3);
		
	}
}

package newGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frame1 extends JFrame {

	private JPanel contentPane;
	private JTextField num1txt;
	private JTextField num2txt;
	private JLabel resultlbl;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 frame = new frame1();
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
	public frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 522);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		num1txt = new JTextField();
		num1txt.setFont(new Font("Arial", Font.BOLD, 18));
		num1txt.setBounds(146, 54, 264, 47);
		contentPane.add(num1txt);
		num1txt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("1st Number:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 54, 170, 47);
		contentPane.add(lblNewLabel);
		
		num2txt = new JTextField();
		num2txt.setFont(new Font("Arial", Font.BOLD, 18));
		num2txt.setColumns(10);
		num2txt.setBounds(146, 112, 264, 47);
		contentPane.add(num2txt);
		
		JLabel lblNewLabel_1 = new JLabel("2nd Number:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 112, 170, 47);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int num1 = Integer.parseInt(num1txt.getText());
				int num2 = Integer.parseInt(num2txt.getText());
				int result = num1 + num2;
				String parseResult = Integer.toString(result);
				
				resultlbl.setText(parseResult);
							
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBounds(146, 248, 264, 47);
		contentPane.add(btnNewButton);
		
		resultlbl = new JLabel("");
		resultlbl.setFont(new Font("Arial", Font.BOLD, 32));
		resultlbl.setHorizontalAlignment(SwingConstants.CENTER);
		resultlbl.setBounds(146, 319, 264, 76);
		contentPane.add(resultlbl);
		
		lblNewLabel_2 = new JLabel("Result:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 32));
		lblNewLabel_2.setBounds(10, 334, 170, 47);
		contentPane.add(lblNewLabel_2);
		setLocationRelativeTo(null); // center frame
	}
}

package newGUI;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

public class landingPage {

	private JFrame frame;
	
//	Images Sources
	static Image background = new ImageIcon(landingPage.class.getResource("../images/backgroundImg.png"))
			.getImage().getScaledInstance(500,500,Image.SCALE_SMOOTH);
	
	//Icon Sources
	static Image facebook = new ImageIcon(landingPage.class.getResource("../images/facebook.png"))
			.getImage().getScaledInstance(70,70,Image.SCALE_SMOOTH);
	static Image instagram = new ImageIcon(landingPage.class.getResource("../images/instagram.png"))
			.getImage().getScaledInstance(70,70,Image.SCALE_SMOOTH);
	static Image github = new ImageIcon(landingPage.class.getResource("../images/github.png"))
			.getImage().getScaledInstance(70,70,Image.SCALE_SMOOTH);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					landingPage window = new landingPage();
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
	public landingPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1300, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel navbar = new JPanel();
		navbar.setBackground(Color.WHITE);
		navbar.setBounds(0, 0, 1284, 56);
		frame.getContentPane().add(navbar);
		navbar.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("John Ford");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 209, 56);
		navbar.add(lblNewLabel);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblContact.setFont(new Font("Georgia", Font.BOLD, 22));
		lblContact.setBackground(Color.WHITE);
		lblContact.setBounds(1131, 0, 153, 56);
		navbar.add(lblContact);
		
		JLabel lblSkills = new JLabel("Skills");
		lblSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkills.setFont(new Font("Georgia", Font.BOLD, 22));
		lblSkills.setBackground(Color.WHITE);
		lblSkills.setBounds(979, 0, 153, 56);
		navbar.add(lblSkills);
		
		JLabel lblProject = new JLabel("Project");
		lblProject.setHorizontalAlignment(SwingConstants.CENTER);
		lblProject.setFont(new Font("Georgia", Font.BOLD, 22));
		lblProject.setBackground(Color.WHITE);
		lblProject.setBounds(827, 0, 153, 56);
		navbar.add(lblProject);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbout.setFont(new Font("Georgia", Font.BOLD, 22));
		lblAbout.setBackground(Color.WHITE);
		lblAbout.setBounds(676, 0, 153, 56);
		navbar.add(lblAbout);
		
		JLabel background_lbl = new JLabel("");
		background_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		background_lbl.setBounds(665, 124, 500, 500);
		background_lbl.setIcon(new ImageIcon(background)); // set image
		frame.getContentPane().add(background_lbl);
		
		JLabel lblNewLabel_1 = new JLabel("John Ford");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 60));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(61, 205, 526, 74);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblAHardworkingStudent = new JLabel("A Hardworking Student");
		lblAHardworkingStudent.setHorizontalAlignment(SwingConstants.LEFT);
		lblAHardworkingStudent.setFont(new Font("Arial", Font.BOLD, 22));
		lblAHardworkingStudent.setBackground(Color.WHITE);
		lblAHardworkingStudent.setBounds(61, 274, 526, 56);
		frame.getContentPane().add(lblAHardworkingStudent);
		
		JLabel lblIm = new JLabel("I am currently a student at University of Mindanao.");
		lblIm.setHorizontalAlignment(SwingConstants.LEFT);
		lblIm.setFont(new Font("Arial", Font.PLAIN, 18));
		lblIm.setBackground(Color.WHITE);
		lblIm.setBounds(61, 341, 526, 56);
		frame.getContentPane().add(lblIm);
		
		JLabel lblIAmWorking = new JLabel("I am working towards my career goal as Software Engineer.");
		lblIAmWorking.setHorizontalAlignment(SwingConstants.LEFT);
		lblIAmWorking.setFont(new Font("Arial", Font.PLAIN, 18));
		lblIAmWorking.setBackground(Color.WHITE);
		lblIAmWorking.setBounds(61, 370, 526, 56);
		frame.getContentPane().add(lblIAmWorking);
		
		JLabel socialMedia1 = new JLabel("");
		socialMedia1.setHorizontalAlignment(SwingConstants.CENTER);
		socialMedia1.setBounds(61, 437, 70, 70);
		socialMedia1.setIcon(new ImageIcon(facebook)); // set image
		frame.getContentPane().add(socialMedia1);
		
		JLabel socialMedia2 = new JLabel("");
		socialMedia2.setHorizontalAlignment(SwingConstants.CENTER);
		socialMedia2.setBounds(163, 437, 70, 70);
		socialMedia2.setIcon(new ImageIcon(instagram)); // set image
		frame.getContentPane().add(socialMedia2);
		
		JLabel socialMedia3 = new JLabel("");
		socialMedia3.setHorizontalAlignment(SwingConstants.CENTER);
		socialMedia3.setBounds(262, 437, 70, 70);
		socialMedia3.setIcon(new ImageIcon(github)); // set image
		frame.getContentPane().add(socialMedia3);
		frame.setLocationRelativeTo(null);
	}

}

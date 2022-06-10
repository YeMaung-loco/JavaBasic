package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

 class newGame {

	JFrame frame;
	JTextField txtNumber;
	JLabel lblHb;
	JLabel lblChance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the application.
	 */
	public newGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {


		frame = new JFrame();
		frame.setBounds(100, 100, 350, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Play Button");
				// play();

			}
		});
		btnPlay.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlay.setBounds(120, 73, 85, 25);
		frame.getContentPane().add(btnPlay);

		txtNumber = new JTextField();
		txtNumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					System.out.println("Play TextBox");
					// play();
				}
			}
		});
		txtNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtNumber.setBounds(60, 30, 216, 25);
		frame.getContentPane().add(txtNumber);
		txtNumber.setColumns(10);

		lblHb = new JLabel("2H 2B");
		lblHb.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHb.setBounds(130, 120, 70, 25);
		frame.getContentPane().add(lblHb);

		lblChance = new JLabel("You have left 10 chances.");
		lblChance.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblChance.setBounds(50, 150, 250, 25);
		frame.getContentPane().add(lblChance);
	}

}

package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class PredictNumberGUI extends JFrame implements ActionListener, KeyListener {

	JFrame frame;
	JTextField txtNumber;
	JLabel lblHb, lblChance;
	JButton btnPlay;
	static Vector<Integer> comVector;
	PlayGUI playGUI;
	

	public static void main(String[] args) {

		new PredictNumberGUI();

	}

	public PredictNumberGUI() {
		playGUI = new PlayGUI();
		comVector = new Vector<Integer>();
		comVector = playGUI.computer();
		initComponents();
		setProperties();
		addComponents();

	}

	public void initComponents() {
		frame = new JFrame();
		txtNumber = new JTextField();
		btnPlay = new JButton();
		lblHb = new JLabel();
		lblChance = new JLabel();

	}

	public void setProperties() {
		frame.setTitle("PredictNumbersGame");
		frame.setBounds(300, 300, 350, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);

		txtNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtNumber.setBounds(60, 30, 216, 25);
		txtNumber.setColumns(10);

		btnPlay.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlay.setText("Play");
		btnPlay.setBounds(120, 73, 85, 25);
		btnPlay.addActionListener(this);

		lblHb.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHb.setBounds(135, 120, 70, 25);

		lblChance.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblChance.setBounds(50, 150, 250, 25);

	}

	public void addComponents() {
		frame.getContentPane().add(txtNumber);
		frame.getContentPane().add(btnPlay);
		frame.getContentPane().add(lblHb);
		frame.add(lblChance);
	}

	public void play() {
		String msgString = playGUI.check(comVector, playGUI.play(txtNumber.getText()));
		lblHb.setText(msgString);
		if (msgString == "4H0B") {
			lblChance.setText("You Win!!!");
			lblChance.setForeground(Color.blue);
			lblChance.setBounds(120, 150, 250, 25);
			lblHb.setForeground(Color.blue);
		} else {
			int chance = 10 - playGUI.playTime;
			if (chance == 0) {
				msgString = "Game Over!!!";
				lblChance.setForeground(Color.red);
			}
			msgString = "You have left " + String.valueOf(chance) + " chances.";
			lblChance.setText(msgString);
			lblChance.setForeground(Color.red);
		}
		//System.out.println("Play!!!");
		// lblHb.setText(txtNumber.getText());
	}

	public void playerInput() {
		String numString = txtNumber.getText();
		boolean checkString = numString.matches("[1-9]+");

		if (numString.length() == 4 && !numString.contains(" ") && checkString) {
			play();
			//playGUI.play(numString);//

		} else {
			txtNumber.setText("");
			txtNumber.requestFocus(true);
			if (numString.length() > 4 || numString.length() < 4 || numString.contains(" ") || !checkString) {

				if (numString.contains("0"))
					JOptionPane.showMessageDialog(this, "\'0\' number not allowed!!!");

				else if (!checkString)
					JOptionPane.showMessageDialog(this, "Please input Number format");

				else if (numString.contains(" ")) {
					if (numString.length() == 5) {
						JOptionPane.showMessageDialog(this, "Dont use Space");

					} else
						JOptionPane.showMessageDialog(this, "Require 4 number without space!!!");
				}

				else {
					if (numString.length() < 4)
						JOptionPane.showMessageDialog(this, "Please input 4 numbers!!!");
					else
						JOptionPane.showMessageDialog(this, "Please input 4 numbers!!!");
				}
			}

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnPlay)) {
			playerInput();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
			play();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

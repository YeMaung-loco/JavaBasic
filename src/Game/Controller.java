package Game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

public class Controller implements ActionListener, KeyListener {
	private Model_Computer model_Computer;
	private View view;
	private Model_Player model_Player;
	private int playTime;
	Boolean notOver;
	String numString;

	public Controller(Model_Computer m, Model_Player p, View v) {
		this.setModel_Computer(m);
		this.model_Player = p;
		this.view = v;

		numString = "";

		initView();

	}

	public void initView() {
		playTime = 0;
		view.getTxtNumber().setText("");
		view.getLblHb().setText("");
		view.getLblChance().setText("You have 10 chances.");
		view.getLblChance().setForeground(Color.black);
		view.getLblChance().setBounds(70, 150, 250, 25);
	}

	public void initController() {
		view.getBtnPlay().addActionListener(this);
		view.getTxtNumber().addKeyListener(this);
	}

	public void play() {
		model_Player.setMplayer(view.getTxtNumber().getText());
		String msgString = model_Player.check(model_Computer.getMcomputer(), model_Player.getMplayer());

		view.getLblHb().setText(msgString);
		view.getLblHb().setForeground(Color.red);
		view.getLblChance().setBounds(50, 150, 250, 25);
		if (msgString == "4H0B") {
			view.getLblChance().setText("You Win!!!");
			view.getLblChance().setForeground(Color.blue);
			view.getLblChance().setBounds(120, 150, 250, 25);
			view.getLblHb().setForeground(Color.blue);
			view.getLblHb().setBounds(135, 120, 150, 25);
			newGame("You win!");
		} else {
			playTime++;
			int chance = 10 - playTime;

			msgString = "You have left " + String.valueOf(chance) + " chances.";
			view.getLblChance().setText(msgString);
			if (chance == 0) {
				msgString = "Game Over!";
				view.getLblHb().setText(msgString);
				view.getLblHb().setBounds(110, 120, 150, 25);
				view.getLblChance().setForeground(Color.red);

				
				//numString="";
				newGame("You lose!"); // newGame(Title);
			}
		}
	}

	public void newGame(String title) {
		if (JOptionPane.showConfirmDialog(null, "Start a new game?", title, JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

			initView();
			Game.StartGame();
		} else {
			System.exit(0);
		}
	}

	public void playerInput() { // userinput ko check
		//numString = "";
		System.out.println(numString);
		numString = view.getTxtNumber().getText();
		boolean checkString = numString.matches("[1-9]+");

		if (numString.length() == 4 && !numString.contains(" ") && checkString) {
			play(); // error ma shi yin play mal
			//numString = "";
		} else {
			if (numString.length() > 4 || numString.length() < 4 || numString.contains(" ") || !checkString) {

				if (numString.contains("0"))
					JOptionPane.showMessageDialog(view.getFrame(), "\'0\' number not allowed!");

				else if (numString.contains(" ")) {
					if (numString.length() == 5) {
						JOptionPane.showMessageDialog(view.getFrame(), "Dont use Space!");

					} else
						JOptionPane.showMessageDialog(view.getFrame(), "Require 4 number without space!");
				} else if (!checkString)
					JOptionPane.showMessageDialog(view.getFrame(), "Please input Number format!");

				else {
					if (numString.length() < 4) {
						System.out.println("Player-input 4-" + numString);
						JOptionPane.showMessageDialog(view.getFrame(), "Please input 4 numbers!");
					} else {
						System.out.println("Player-input 4-" + numString);
						JOptionPane.showMessageDialog(view.getFrame(), "Please input 4 numbers!");
					}
					System.out.println("Player-" + numString);
				}
			}

			view.getTxtNumber().setText("");
			view.getTxtNumber().requestFocus(true);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			playerInput();
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(view.getBtnPlay())) {
			playerInput();
		}

	}

	public Model_Computer getModel_Computer() {
		return model_Computer;
	}

	public void setModel_Computer(Model_Computer model_Computer) {
		this.model_Computer = model_Computer;
	}

}

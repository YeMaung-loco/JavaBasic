package Exam;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Play {
	Vector<Integer> computer_list;
	Vector<Integer> player_list;
	boolean notOver;
	int playTime;

	Play() {
		playTime = 0;
		notOver = true;
		computer_list = new Vector<Integer>();
		player_list = new Vector<Integer>();
	}

	public void computer() {
		int num;
		Random randomObj = new Random();
		while (computer_list.size() < 4) {
			num = randomObj.nextInt(9) + 1;
			if (!computer_list.contains(num)) {
				computer_list.addElement(num);

			}
		}
		display("Start a new game!!!");
		display("-----------\nComputer- " + computer_list);
	}

	public void play(String numString) {
		int num;
		while (player_list.size() < 4) {
			display("Enter Numbers- ");
			//String numString;
			if (numString.length() == 4 && !numString.contains(" ")) {
				for (int i = 0; i < 4; i++) {
					String n = Character.toString(numString.charAt(i));
					try {
						num = Integer.parseInt(n);
						if (player_list.contains(num)) {
							display("Duplicate!!!");
							player_list.removeAllElements();
							break;
						} else {
							player_list.addElement(num);
						}
					} catch (NumberFormatException e) {
						player_list.removeAllElements();
						display("Please input Number format!!!");
						break;
					}
				}
			} else {
				if (numString.length() > 4 || numString.length() < 4 || numString.contains(" ")) {

					if (numString.contains(" ")) {
						if (numString.length() == 5)
							display("Dont use space!!!");
						else
							display("Require 4number without space!!!");

					}

					else {
						if (numString.length() < 4)
							display("Please input 4 numbers!!!");
						else
							display("Please input 4 numbers!!!");
					}
				}

			}
		}
		display("Player- " + player_list);
		//return player_list;
	}

	public void check(Vector<Integer> computer, Vector<Integer> player) {
		int h = 0, b = 0;
		for (int i = 0; i < computer.size(); i++) {
			for (int j = 0; j < player.size(); j++) {
				if (computer.get(i) == player.get(j)) {
					if (i == j)
						h++;
					else
						b++;
				}

			}
		}
		if (h == 4) {
			display("You Win!!!!\nResult- " + h + "H" + b + "B");
			notOver = false;
		} else {
			display("Try again!!!\nResult- " + h + "H" + b + "B");
			player.removeAllElements();
		}
		playTime++;
	}

	public void display(String print) {
		System.out.println(print);
	}

}

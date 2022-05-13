package Exam;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Play {

	static Vector<Integer> computer_list;
	static Vector<Integer> player_list;
	static boolean notOver;
	static int playTime;

	Play() {
		playTime = 0;
		notOver = true;
		computer_list = new Vector<Integer>();
		player_list = new Vector<Integer>();
	}

	public static void computer() {
		int num;
		boolean notComplete = true;
		Random randomObj = new Random();
		while (notComplete) {
			if (computer_list.size() != 4) {
				num = randomObj.nextInt(9) + 1;
				if (!computer_list.contains(num)) {
					computer_list.addElement(num);
					if (computer_list.size() == 4)
						notComplete = false;
				}
			}
		}
		display("-----------\nComputer- " + computer_list);
	}

	public static void play() {
		int num;
		String cutString = null;
		boolean notComplete = true;
		Scanner scanner = new Scanner(System.in);
		while (notComplete) {
			display("Enter Numbers: ");
			String numString = scanner.nextLine();

			if (numString.length() >= 4) {
				cutString = numString.substring(0, 4);
				for (int i = 0; i < cutString.length(); i++) {
					num = Character.getNumericValue(cutString.charAt(i));
					if (player_list.contains(num)) {
						display("Duplicate!!!");
						player_list.removeAllElements();
						break;
					} else {
						player_list.addElement(num);
						if (player_list.size() == 4) {
							notComplete = false;
						}
					}
				}
			} else {
				display("Please input aleast 4 numbers!!!");
			}
		}
		display("Player- " + player_list);
	}

	public static void check(Vector<Integer> computer, Vector<Integer> player) {
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

	public static void display(String print) {
			System.out.println(print);	
	}

}

package Exam;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class PredictNumbersVector {
	static Scanner scanner = new Scanner(System.in);
	static int playTime = 0;

	public static void main(String[] args) throws IOException {
		boolean notOver = true;
		Vector<Integer> Computer = computer();

		while (notOver) {
			int chance = 10 - playTime;
			System.out.println("***********");
			System.out.println("You have " + chance + " chances!!!");
			if (playTime == 10) {
				Computer.removeAllElements();
				System.out.println("Game Over !!!");
				System.out.println("Start a new game?  y/n-");
				char game = (char) System.in.read();
				scanner.nextLine(); /// this line is necessary
				if (game == 'y') {
					System.out.println("Start a new game!!!");
					Computer = computer();
					playTime = 0;
				} else
					return;
			}

			Vector<Integer> Player = play();
			notOver = check(Computer, Player);

		}
	}

	public static Vector<Integer> computer() {
		Vector<Integer> list = new Vector<Integer>();

		int num;
		boolean notComplete = true;
		Random randomObj = new Random();
		while (notComplete) {
			if (list.size() != 4) {
				num = randomObj.nextInt(9) + 1;
				if (!list.contains(num)) {
					list.addElement(num);
					if (list.size() == 4)
						notComplete = false;
				}
			}
		}
		System.out.println("-----------");
		System.out.println("Computer- " + list);
		return list;

	}

	public static Vector<Integer> play() {
		Vector<Integer> list = new Vector<Integer>();
		int num;
		String cutString = null;
		boolean notComplete = true;

		while (notComplete) {
			System.out.print("Enter Numbers: ");
			String numString = scanner.nextLine();

			if (numString.length() >= 4) {
				cutString = numString.substring(0, 4);
				for (int i = 0; i < cutString.length(); i++) {
					num = Character.getNumericValue(cutString.charAt(i));
					if (list.contains(num)) {
						System.out.println("Duplicate!!!");
						list.removeAllElements();
						break;
					} else {
						list.addElement(num);
						if (list.size() == 4) {
							notComplete = false;
						}
					}
				}
			} else {
				System.out.println("Please input aleast 4 numbers!!!");
			}
		}
		System.out.println("Player- " + list);
		return list;
	}

	public static boolean check(Vector<Integer> computer, Vector<Integer> player) {
		int H = 0, B = 0;
		boolean notOver = true;
		for (int i = 0; i < computer.size(); i++) {
			for (int j = 0; j < player.size(); j++) {
				if (computer.get(i) == player.get(j)) {
					if (i == j)
						H++;
					else
						B++;
				}

			}
		}
		if (H == 4) {
			System.out.println("You Win!!!!");
			System.out.println("Result- " + H + "H" + B + "B");
			notOver = false;
		} else {
			System.out.println("Try again!!!");
			System.out.println("Result- " + H + "H" + B + "B");
			player.removeAllElements();
		}
		playTime++;
		return notOver;
	}

}

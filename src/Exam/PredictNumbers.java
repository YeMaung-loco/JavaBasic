package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class PredictNumbers {

	public static void main(String[] args) {
		boolean notOver = true;
		int[] Computer = computer();

		while (notOver) {

			int[] Player = play();
			notOver = check(Computer, Player);

		}

	}

	public static int[] computer() {
		boolean found = false;
		int[] Array = new int[4];
		int index = 0;
		int max = 9, min = 1, n;

		while (index < Array.length) {
			// System.out.println("Enter number: ");
			n = (int) (Math.random() * (max - min)) + min;
			for (int j = 0; j < Array.length; j++) {
				if (Array[j] == n) {
					found = true;
				}
			}
			if (!found) {
				Array[index] = n;
				index++;
			}

			else {
				// System.out.println(n + " already exit");
				found = false;
			}
		}
		System.out.println("computer -" + Arrays.toString(Array));

		return Array;

	}

	public static int[] play() {
		boolean found = false;
		int[] Array = new int[4];
		int index = 0;
		Scanner scan = new Scanner(System.in);
		while (index < Array.length) {
			System.out.println("Enter number: ");
			int n = scan.nextInt();
			for (int j = 0; j < Array.length; j++) {
				if (Array[j] == n) {
					found = true;
				}
			}
			if (!found && n >= 1 && n <= 9) {
				Array[index] = n;
				index++;
			}

			else {
				System.out.println(n + " Enter a valid number-");
				found = false;
			}
		}

		System.out.println("Player -" + Arrays.toString(Array));

		return Array;

	}

	public static boolean check(int[] computer, int[] player) {

		int H = 0, B = 0;
		boolean notOver = true;

		for (int i = 0; i < computer.length; i++) {
			for (int j = 0; j < player.length; j++) {
				if (computer[i] == player[j]) {
					if (i == j) {
						H++;
					} else {
						B++;
					}

				}

			}
		}
		if (H == 4) {
			System.out.println("You Win!!!!");
			notOver = false;
		}
		System.out.println(H + "H" + B + "B");

		return notOver;

	}

}

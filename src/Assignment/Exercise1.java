package Assignment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import gui.newGame;

public class Exercise1 {

	public static void main(String[] args) {
		double e[] = new double[7];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < e.length; i++) {
			System.out.println("Sales-");
			e[i] = scanner.nextDouble();
		}
		Arrays.sort(e);
		double max = e[6];

		System.out.println("Largest" + max);

	}

}

package Assignment;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Type some words-");
			String str = scanner.nextLine();
			System.out.println("\'" + str + "\'" + " is change to \n\'" + changeReverse(str) + "\'");
		}
	}

	public static String changeReverse(String str) {
		StringBuffer sbApnd = new StringBuffer();
		String[] sbString = str.split("\\s");

		for (String s : sbString) {
			StringBuffer sBuffer = new StringBuffer(s);
			sbApnd.append(sBuffer.reverse()).append(' ');
		}
		return sbApnd.toString().trim();

	}

}

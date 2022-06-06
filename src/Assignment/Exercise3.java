package Assignment;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Type some words-");
			String str = scanner.nextLine();
			String returnString = reverse(str);
			System.out.println("\'" + str + "\'" + " is change to \n\'" + returnString + "\'");
		}

	}

	private static String reverse(String str) {
		StringBuffer sBuffer = new StringBuffer(str);
		StringBuffer returnBuffer = new StringBuffer();
		String subString = null;
		int spaceCount = 0;
		for (int i = sBuffer.length() - 1; i >= 0; i--)
			if (str.charAt(i) == ' ')
				spaceCount++;
		while (spaceCount >= 1)
			for (int i = 0; i <= (sBuffer.length() - 1); i++) {

				if (sBuffer.charAt(i) == ' ') {

					subString = sBuffer.substring(0, i);

					sBuffer.delete(0, i + 1);
					spaceCount--;
				}

				if (subString != null) {
					for (int j = subString.length() - 1; j >= 0; j--)
						returnBuffer.append(subString.charAt(j));

					returnBuffer.append(' ');
					subString = null;
					break;
				}
			}

		for (int j = sBuffer.length() - 1; j >= 0; j--)
			returnBuffer.append(sBuffer.charAt(j));

		return returnBuffer.toString();

	}

}

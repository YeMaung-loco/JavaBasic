package Assignment;

import java.io.IOException;
import java.util.Scanner;

public class SquaresAndRoots {

	public static void main(String[] args) throws IOException {
		try (Scanner scanner = new Scanner(System.in)) {
			char y = 'n';

			while ('y' != y) {
				System.out.println("Enter number-");
				String nString = scanner.nextLine();
				boolean checkString = nString.matches("[1-9]+");
				if (checkString) {
					int p = Integer.parseInt(nString);
					int sqr = p * p;
					System.out.println("Square" + sqr);
					System.out.println("Square root" +  Math.sqrt(p)+"\n");
				} else {
					y = nString.charAt(0);
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package Assignment;

import java.util.Scanner;

public class Ass4 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			int i = 1;
			while (i != 0) {
				System.out.println("Enter number-");
				i = sc.nextInt();
				if (i != 0)
					System.out.println("Sqr-" + i * i);
				else
					return;
			}
		}
	}

}

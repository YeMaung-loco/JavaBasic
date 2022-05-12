package chapter_9;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Array_Duplicate {
	public static void main(String[] args) {
		Vector<Integer> list = new Vector<Integer>();
		try (Scanner scanner = new Scanner(System.in)) {
			int num;
			boolean notComplete = true;
			Random randomObj = new Random();
			while (notComplete) {
				if (list.size() != 4) {
					System.out.print("Random Number: ");
					num = randomObj.nextInt(5) + 1;
					System.out.println(num);
					if (list.contains(num)) {
						System.out.println("Duplicate");
					} else {
						list.addElement(num);
						if (list.size() == 4)
							notComplete = false;
					}
				}
			}
		}
		System.out.println(list);
	}
}

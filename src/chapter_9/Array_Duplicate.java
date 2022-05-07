package chapter_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_Duplicate {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int num;
		boolean notComplete = true;
		while (notComplete) {
			if (list.size() != 5) {
				System.out.print("Enter Number: ");
				num = scanner.nextInt();
				if (list.contains(num)) {
					System.out.println("Duplicate");
				} else {
					list.add(num);
					if( list.size() == 5) notComplete = false;
					
				}
			}
		}
		System.out.println(list);
	}
}

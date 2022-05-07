
package chapter_6;

import java.util.Scanner;

public class chapter_6_Duplicate {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = getArray();
		display(a);

	}

	public static void display(int[] a) {
		for (int i = 0; i < a.length; i++)

			System.out.println(a[i]);
	}

	public static int[] getArray() {
		boolean found = false;
		int[] Array = new int[5];
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
			if (!found) {
				Array[index] = n;
				index++;
			}

			else {
				System.out.println(n + " already exit");
				found = false;
			}
		}

		return Array;

	}

}

package chapter_8;

import java.util.Scanner;

public class ch_8Ass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square(10);
		int enLarge = sq.enLarge();
		System.out.println("Enlarge Result -" + enLarge);

		System.out.println("----input length-----");
		sq.setLength();
		System.out.println("Enlarge Result -" + sq.enLarge());

	}

}

class Square {
	int length;
	int enLarge;
	Scanner scan = new Scanner(System.in);

	public Square(int Length) {
		this.length = Length;

	}

	public int enLarge() {
		return enLarge = length * length;
	}

	public void setLength() {
		System.out.println("Enter Length - ");
		this.length = scan.nextInt();

	}

	public int getLength() {
		return this.length;
	}
}

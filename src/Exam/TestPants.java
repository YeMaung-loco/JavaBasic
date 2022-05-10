package Exam;

public class TestPants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pants[] pants = { new Slacks("S1", 31, "Black"), new Slacks("S2", 31, "Black"),
				new Jeans("J1", 32, "Black", false), new Jeans("J2", 34, "Blue", true) };

		String black = new String("Black");
		for (int i = 0; i < pants.length; i++) {
			System.out.println(pants[i]);
		}

		System.out.println(pants[0].sizeIs(31));
		System.out.println(pants[1].colorIs(black));
		System.out.println(pants[2].sizeIs(30));
		System.out.println(pants[3].colorIs(black));

	}

}

abstract class Pants {
	String code;
	int size;
	String color;

	public Pants() {

	}

	Pants(String code, int size, String color) {
		this.code = code;
		this.size = size;
		this.color = color;
	}

	public boolean sizeIs(int size) {

		return this.size == size; //// b) for a
	}

	public boolean colorIs(String color) {

		return this.color.equals(color); /// f) for b
	}

	public String toString() {
		return code + ", " + size + ", " + color;
	}

}

class Slacks extends Pants {
	Slacks(String code, int size, String color) {
		super(code, size, color);

	}
}

class Jeans extends Pants {
	boolean buttonFront;

	Jeans(String code, int size, String color, boolean buttonFront) {
		super(code, size, color);
		this.buttonFront = buttonFront;
	}

	public String toString() {

		return super.toString() + " " + (buttonFront ? "button" : "zipper");
	}
}

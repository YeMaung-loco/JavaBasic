package chapter_13;

import java.io.IOException;

public class ch_13Ass_1 {

	public static void main(String[] args) throws IOException {
		////// first part of assignment/////
		char a = (char) System.in.read();

		if (Character.isLetter(a)) {
			System.out.println(a);
			a = Character.toUpperCase(a);
			System.out.println(a);
		}
		System.out.println(Character.isLetter(a) ? "\'" + a + "\' is Letter" : "\'" + a + "\' is Digit");

		//////// next part of assignment//////

		StringBuffer str = new StringBuffer("This is a  program");
		System.out.println(str.insert(10, "Java"));

	}

}

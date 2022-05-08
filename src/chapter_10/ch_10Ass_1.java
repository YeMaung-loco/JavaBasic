package chapter_10;

import java.io.IOException;
import java.util.Scanner;

public class ch_10Ass_1 {

	public static void main(String[] args) throws IOException {
		String Name;
		char credit;
		GraduateStudent gStudent[] = new GraduateStudent[5];
		try (Scanner scan = new Scanner(System.in)) {
			for (int i = 0; i < gStudent.length; i++) {
				Name = null;
				credit = '\u0000';
				int k = i + 1;

				while (Name == null || Name == "") {
					System.out.println("Enter Student Name for Employee no." + k + " - ");
					Name = scan.nextLine();
				}
				while (credit == '\u0000' || credit == ' ' || credit == '\0' || credit == '\n'
						|| Character.isWhitespace(credit)) {
					System.out.println("Enter credit for Employee no." + k + " - ");
					credit = (char) System.in.read();

					if (Character.isWhitespace(credit))
						scan.nextLine();
				}

				gStudent[i] = new GraduateStudent(k, Name, credit);

				scan.nextLine();
			}
		}

		for (int j = 0; j < gStudent.length; j++) {
			gStudent[j].display();
		}
	}

}

class Student {
	int StudentNo;
	String name;

	public Student() {
		this.StudentNo = 0;
		this.name = null;

	}

	public Student(int no, String name) {
		this.StudentNo = no;
		this.name = name;

	}

}

class GraduateStudent extends Student {
	char credit;
	Scanner scan = new Scanner(System.in);

	public GraduateStudent() {

		super();
		this.credit = '\u0000';
	}

	public GraduateStudent(int no, String name, char credit) {
		super(no, name);
		this.credit = credit;
	}

	public void display() {

		System.out.println(
				"Student No - " + this.StudentNo + "\nName       - " + this.name + "\nCredit     - " + this.credit);
		System.out.println("----------------");
	}

}

package chapter_10;

import java.io.IOException;
import java.util.Scanner;

public class SpecialAss_1 {

	public static void main(String[] args) throws IOException {

		SpecialStudent gStudent[] = new SpecialStudent[5];
		SpecialStudent inputDataSpecialStudent = new SpecialStudent();

		inputDataSpecialStudent.getStudentData(gStudent);

		for (int j = 0; j < gStudent.length; j++) {
			gStudent[j].display();
		}
	}

}

class S_Student {
	int StudentNo;
	String name;

	public S_Student() {
		this.StudentNo = 0;
		this.name = null;

	}

	public S_Student(int no, String name) {
		this.StudentNo = no;
		this.name = name;

	}

}

class SpecialStudent extends S_Student {
	char credit;
	Scanner scan = new Scanner(System.in);

	public SpecialStudent() {

		super();
		this.credit = '\u0000';
	}

	public SpecialStudent(int no, String name, char credit) {
		super(no, name);
		this.credit = credit;
	}

	public void getStudentData(SpecialStudent gStudent[]) throws IOException {
		String Name;

		for (int i = 0; i < gStudent.length; i++) {
			Name = null;
			credit = '\u0000';
			int j = i + 1;

			while (Name == null || Name == "") {
				System.out.println("Enter Student Name for Employee no." + j + " - ");
				Name = scan.nextLine();
			}
			while (credit == '\u0000' || credit == ' ' || credit == '\0' || credit == '\n'
					|| Character.isWhitespace(credit)) {
				System.out.println("Enter credit for Employee no." + j + " - ");
				credit = (char) System.in.read();

				if (Character.isWhitespace(credit))
					scan.nextLine();
			}

			gStudent[i] = new SpecialStudent(j, Name, credit);

			scan.nextLine();

		}
	}

	public void display() {

		System.out.println(
				"Student No - " + this.StudentNo + "\nName       - " + this.name + "\nCredit     - " + this.credit);
		System.out.println("----------------");
	}

}

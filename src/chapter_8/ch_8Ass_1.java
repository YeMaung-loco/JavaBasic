package chapter_8;

import java.util.Scanner;

public class ch_8Ass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.display();
	}

}

class Student {
	Scanner scan = new Scanner(System.in);
	String name, address;
	int mark;

	public Student() {
		this.name = "Ye Maung";
		this.address = "BoTaHtaung";
		this.mark = 100;
	}

	public void display() {
		System.out.println("Name - " + this.name + "\nAddress - " + this.address + "\nMark - " + this.mark);
		;
	}
}

package chapter_9;

import java.util.Scanner;

public class vFlatTest {

	public static void main(String[] args) {

		Employeetest1 e[] = new Employeetest1[5];
		Employeetest1 inputE = new Employeetest1();

		for (int i = 0; i < e.length; i++) {

			e[i] = new Employeetest1(inputE.getNumDays(i + 1));
		}

		for (int j = 0; j < e.length; j++) {

			e[j].displayWeeklyPay(j + 1);
		}
	}
}

class Employeetest1 {
	final int rateOfPay = 250;
	int numberOfDays;
	Scanner scan = new Scanner(System.in);

	public Employeetest1() {
	}

	public Employeetest1(int d) {
		this.numberOfDays = d;
	}

	public int getNumDays(int i) {
		System.out.println("Enter Number of Days for employee no." + i);
		return scan.nextInt();
	}

	public int calculateWeeklyPay() {
		return this.numberOfDays * this.rateOfPay;
	}

	public void displayWeeklyPay(int j) {
		System.out.println("Weekly Salary for Employee no." + j + " " + calculateWeeklyPay());

	}

}

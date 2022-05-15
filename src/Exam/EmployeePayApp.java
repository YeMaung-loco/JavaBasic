
package Exam;

import java.util.Scanner;

public class EmployeePayApp {

	public static void main(String[] args) {
		Employeetest e[] = new Employeetest[5];
		
		for (int i = 0; i < e.length; i++) 
			e[i] = new Employeetest(Employeetest.getNumDays(i + 1));
		
		for (int j = 0; j < e.length; j++) 
			e[j].displayWeeklyPay(j + 1);		
	}
}

class Employeetest {
	final int rateOfPay = 250;
	int numberOfDays;
	static Scanner scan = new Scanner(System.in);

	public Employeetest() {

	}

	public Employeetest(int d) {
		this.numberOfDays = d;
	}

	public static int getNumDays(int j) {
		System.out.println("Enter Number of Days for employee no." + j);
		return scan.nextInt();
	}

	public int calculateWeeklyPay() {
		return this.numberOfDays * this.rateOfPay;
	}

	public void displayWeeklyPay(int j) {
		System.out.println("Weekly Salary for Employee no." + j + " - " + calculateWeeklyPay());
	}
}

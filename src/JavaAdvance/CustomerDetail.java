package JavaAdvance;

import java.util.Scanner;

public class CustomerDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Customer customer = new Customer();
		System.out.println("Enter Id-");
		customer.setCustId(sc.next());
		System.out.println("Enter First Name-");
		customer.setF_name(sc.next());
		System.out.println("Enter Last Name-");
		customer.setL_name(sc.next());
		System.out.println("Enter credit limit-");
		customer.setLimit(sc.nextInt());

		customer.display();
	}

}

class Customer {

	String custId, f_name, l_name;
	int limit;

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public void setLimit(int limit) {
		if (limit <= 10000)
			this.limit = limit;
	}

	void display() {
		System.out.println("Customer Id-" + this.custId + "\nCustomer Name-" + this.f_name + " " + this.l_name
				+ "\nCustomer Limit-" + this.limit);
	}

	Customer() {
		this.limit = 0;

	}
}

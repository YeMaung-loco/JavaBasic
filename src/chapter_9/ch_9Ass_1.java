package chapter_9;

public class ch_9Ass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accInfo accInfo = new accInfo();
		accInfo.display();

		accInfo accInfo1 = new accInfo("Ye Maung", "22334", (float) 2000.00);
		accInfo1.display();

		accInfo1.incBal((float) 500.00);
		accInfo.decBal((float) 200.00);

		System.out.println("------After Transcations------");
		accInfo1.display();
		accInfo.display();
	}

}

class accInfo {
	String acc_name, acc_number;
	float balance;

	public accInfo() {
		acc_name = "John";
		acc_number = "12345";
		balance = (float) 1000.00;

	}

	public accInfo(String name, String number, float balance) {
		this.acc_name = name;
		this.acc_number = number;
		this.balance = balance;
	}

	public void display() {
		System.out.println("Account Name - " + this.acc_name + "\nAccount Number - " + this.acc_number + "\nBalance - "
				+ this.balance);
	}

	public void incBal(float balance) {
		this.balance += balance;
		// System.out.println("Total Amount - " + this.balance);
	}

	public void decBal(float balance) {
		this.balance -= balance;
		// System.out.println("Total Amount - " + this.balance);
	}
}

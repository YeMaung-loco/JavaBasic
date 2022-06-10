package JavaAdvance;

import java.util.Scanner;

public class testLogin {
	static final String username = "admin", password = "admin";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name-");
		String usn = sc.nextLine();
		System.out.println("Enter Password-");
		String pass = sc.nextLine();
		try {
			checkLogIn(usn, pass);
		} catch (InvalidUserName inusn) {
			System.out.println(inusn.toString());
		} catch (InvalidPassword inpa) {
			System.out.println(inpa.getMessage());
		}

	}

	public static void checkLogIn(String un, String pa) throws InvalidUserName, InvalidPassword {
		if (!un.equals(username)) {
			throw new InvalidUserName();
		} else if (!pa.equals(password)) {
			throw new InvalidPassword();
		} else {
			System.out.println("Welcome " + un);
		}
	}

}

class InvalidUserName extends Exception {
	public InvalidUserName() {
		super("Invalid User Name");
	}

	public String toString() {
		return "Sorry! User Name is invalid.";
	}
}

class InvalidPassword extends Exception {
	public InvalidPassword() {
		super("Invalid Password");
	}

	public String toString() {
		return "Sorry! Password is invalid.";
	}
}

package Exam;

public class Utility {
String gameOver="Game Over !!! \nStart a new game?  y/n-";
String newGame="Start a new game!!!";

public static void display(String print) {
		
		if(print.length()>1)
		System.out.println(print);
		else 
			System.out.println("*********** \nYou have " + (10 - Play.playTime) + " chances!!!");
					
	}
}

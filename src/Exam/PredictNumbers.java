package Exam;

import java.io.IOException;
import java.util.Scanner;

public class PredictNumbers {

	public static void main(String[] args) throws IOException {

		new Play();
		Play.computer();
		Scanner sc = null;
		while (Play.notOver) {
			sc = new Scanner(System.in);
			Play.display("*********** \nYou have " + (10 - Play.playTime) + " chances!!!");
			if (Play.playTime == 10) {
				Play.computer_list.removeAllElements();
				Play.display("Game Over !!! \nStart a new game?  y/n-");
				char newGame = (char) System.in.read();
				sc.nextLine(); 
				if (newGame == 'y') {
					Play.playTime = 0;
					Play.computer();
					Play.display("*********** \nYou have " + (10 - Play.playTime) + " chances!!!");

				} else {
					sc.close();
					return;
				}

			}

			Play.play(sc);
			Play.check(Play.computer_list, Play.player_list);
		}
		sc.close();

	}

}

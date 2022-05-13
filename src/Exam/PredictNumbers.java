package Exam;

import java.io.IOException;
import java.util.Scanner;

public class PredictNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		new Play();
		Play.computer();

		while (Play.notOver) {
			Play.display("*********** \nYou have " + (10 - Play.playTime) + " chances!!!");
			if (Play.playTime == 10) {
				Play.computer_list.removeAllElements();
				Play.display("Game Over !!! \nStart a new game?  y/n-");
				char game = (char) System.in.read();
				Scanner scanner = new Scanner(System.in);
				scanner.nextLine(); /// this line is necessary
				if (game == 'y') {
					Play.playTime = 0;
					Play.computer();
					Play.display("Start a new game!!!");
					Play.display("*********** \nYou have " + (10 - Play.playTime) + " chances!!!");
				} else
					return;
			}

			Play.play();
			Play.check(Play.computer_list, Play.player_list);
		}

	}

	

}

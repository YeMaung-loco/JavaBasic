package Exam;

import java.io.IOException;

public class PredictNumbers {

	public static void main(String[] args) throws IOException {

		new Play();
		Play.computer();

		while (Play.notOver) {
			Play.display("*********** \nYou have " + (10 - Play.playTime) + " chances!!!");
			if (Play.playTime == 10) {
				Play.computer_list.removeAllElements();
				Play.display("Game Over !!! \nStart a new game?  y/n-");
				char newGame = (char) System.in.read();
				if (newGame == 'y') {
					Play.playTime = 0;
					Play.computer();
					Play.display("*********** \nYou have " + (10 - Play.playTime) + " chances!!!");
					
				} else
					return;
			}

			Play.play();
			Play.check(Play.computer_list, Play.player_list);
		}

	}

}

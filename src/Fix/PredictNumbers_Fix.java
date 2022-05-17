package Fix;

import java.io.IOException;
import java.util.Scanner;

public class PredictNumbers_Fix {

	public static void main(String[] args) throws IOException {

		Play_Fix play = new Play_Fix();
		play.computer();
		Scanner sc = null;
		while (play.notOver) {
			sc = new Scanner(System.in);
			play.display("*********** \nYou have " + (10 - play.playTime) + " chances!!!");
			if (play.playTime == 10) {
				play.computer_list.removeAllElements();
				play.display("Game Over !!! \nStart a new game?  y/n-");
				char newGame = (char) System.in.read();
				sc.nextLine();
				if (newGame == 'y') {
					play.playTime = 0;
					play.computer();
					play.display("*********** \nYou have " + (10 - play.playTime) + " chances!!!");

				} else {
					sc.close();
					return;
				}

			}

			play.play(sc);
			play.check(play.computer_list, play.player_list);
		}
		sc.close();

	}

}

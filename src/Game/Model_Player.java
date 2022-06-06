package Game;

import java.util.Vector;
import javax.swing.JOptionPane;

public class Model_Player {
	Vector<Integer> player_list;
	View view;

	public Model_Player(View v) {
		this.view = v;

	}

	public void setMplayer(String numString) {
		player_list = new Vector<Integer>();
		int num;
		for (int i = 0; i < 4; i++) {
			String n = Character.toString(numString.charAt(i));
			num = Integer.parseInt(n);
			if (player_list.contains(num)) {
				view.getTxtNumber().setText("");
				view.getTxtNumber().requestFocus(true);
				JOptionPane.showMessageDialog(view.getFrame(), "Duplicate!!!");
				player_list.removeAllElements();
				break;
			} else {
				player_list.addElement(num);
			}
		}
	}

	public Vector<Integer> getMplayer() {
		return this.player_list;
	}

	public String check(Vector<Integer> computer, Vector<Integer> player) {
		int h = 0, b = 0;
		String msg = null;
		for (int i = 0; i < computer.size(); i++) {
			for (int j = 0; j < player.size(); j++) {
				if (computer.get(i) == player.get(j)) {
					if (i == j)
						h++;
					else
						b++;
				}

			}
		}
		if (h == 4) {
			msg = "4H0B";

		} else {
			msg = h + "H" + b + "B";
			player.removeAllElements();
		}
		return msg;
	}
}

package Game;
import java.util.Random;
import java.util.Vector;

class Model_Computer {

	Vector<Integer> computer_list;

	public Model_Computer() {

	}

	public void computer() {
		int num;
		Random randomObj = new Random();
		Vector<Integer> list = new Vector<Integer>();
		while (list.size() < 4) {
			num = randomObj.nextInt(9) + 1;
			if (!list.contains(num)) {
				list.addElement(num);

			}
		}
		
		this.computer_list = list;
		System.out.println("The numbers is "+computer_list);
	}

	public Vector<Integer> getMcomputer() {

		return computer_list;

	}

}

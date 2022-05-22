package Game;

public class Game {
	static Model_Computer mComputer;
	static View view;

	public static void main(String[] args) {
		view = new View();
		StartGame();
	}

	public static void StartGame() {
		mComputer = new Model_Computer();
		Model_Player mPlayer = new Model_Player(view);
		mComputer.computer();
		Controller controller = new Controller(mComputer, mPlayer, view);
		controller.initController();
	}
}

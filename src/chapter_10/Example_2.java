package chapter_10;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube = new Cube();
		Cube cube1 = new Cube(10, 20, 30);

		cube.display(cube.Volume());
		cube1.display(cube1.Volume());

	}

}

class Cube extends Rectangle {
	private int length;

	public Cube() {
		super();
		this.length = 10;
	}

	public Cube(int w, int h, int l) {
		super(w, h);
		this.length = l;

	}

	public int Volume() {
		return  super.Area() * this.length;
	}

	public void display(int v) {
		System.out.println("Width -" + width + "\nHeight -" + height + "\nLength -" + length + "\nVolume -" + v);
	}
}

class Rectangle {
	int width;
	int height;

	public Rectangle() {
		this.width = 3;
		this.height = 9;
	}

	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}

	public int Area() {
		return this.width * this.height;
	}

}

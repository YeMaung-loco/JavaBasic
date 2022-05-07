package chapter_9;

public class ch_9Ass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time(2000);
		Time t2 = new Time(3600);
		Time t3= new Time();
		t2.display();
		t3.addTime(t1, t2);
		t3.display();

	}

}

class Time {
	int H, M, S, temp;;

	public Time() {
		H = 0;
		M = 0;
		S = 0;

	}

	public Time(int sec) {

		H = sec / 3600;
		temp = sec % 3600;
		M = temp / 60;
		S = temp % 60;
	}

	public void display() {
		System.out.println("HH:MM:SS- " + H + ":" + M + ":" + S);
	}

	public void addTime(Time t1, Time t2) {
		int sec = t1.H * 3600 + t1.M * 60 + t1.S + t2.H * 3600 + t2.M * 60 + t2.S;
		H = sec / 3600;
		temp = sec % 3600;
		M = temp / 60;
		S = temp % 60;
		System.out.println(sec);
	}
}

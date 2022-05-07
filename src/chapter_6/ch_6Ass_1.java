package chapter_6;

public class ch_6Ass_1 {

	public static void main(String[] args) {
		int[] salary = new int[5];
		int sum = 0;

		for (int i = 0; i < salary.length; i++) {
			salary[i] = (int) Math.round(Math.random() * 3000);
			sum += salary[i];
		}
		display(Average(sum, salary.length), salary);

	}

	public static int Average(int sum, int l) {
		return sum / l;
	}

	public static void display(int average, int[] salary) {
		for (int i = 0; i < salary.length; i++) {
			System.out.println("Salary of month " + (i + 1) + " = " + salary[i]);
		}
		System.out.println("Average of Salary = " + average);

	}
}

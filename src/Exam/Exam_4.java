package Exam;

public class Exam_4 {
	public static void main(String[] args) {
		int divTime = 2, lineDiv = 0;
		for (int i = 2; i <= 1000; i++) {
			while (divTime < i && i%divTime !=0) 
				divTime++;
			
			if (divTime == i) {
				++lineDiv;
				System.out.print(i + "\t");
				if (lineDiv % 10 == 0)
					System.out.println();
			}
			divTime = 2;
		}
		
	}
}

package Exam;

public class Exam_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Amount = 0,intrest;
		for (int i=1; i<=12; i++)
		{
			Amount+=50;
			intrest=(float) (Amount*0.01);
			Amount+=intrest;
			
			System.out.println("For Month "+i+" - "+Amount);
		}
		

	}

}



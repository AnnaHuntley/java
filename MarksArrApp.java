/*
MarksArrApp.java
A Samus
06.03.2023
*/
import java.util.*;


public class MarksArrApp {
		public static void main(String[] args){
			int amount;
			int[] studentsMark;
			int average;
			String result;

			MarkArr myMarks=new MarkArr();
			Scanner keyboard=new Scanner(System.in);
			System.out.println("How many subjects did you take");
			amount=keyboard.nextInt();
			myMarks.setAmount(amount);

			studentsMark=new int[amount];
			for(int i=0;i<studentsMark.length;i++){
				System.out.println("Please enter your mark from 1 to 100 for the subject");
				studentsMark[i]=keyboard.nextInt();
			}

		myMarks.setStudentsMark(studentsMark);

			myMarks.compute();

			result=myMarks.getResult();
			System.out.println(result);
}

	}
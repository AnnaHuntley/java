/*
RockPaperScissorsApp.java
A Samus
20.02.2023
*/
//import java.util.Random;
import javax.swing.JOptionPane;

public class RockPaperScissorsApp{
	public static void main(String[] args){
		//declare vars
		int userStep;
		int compStep;
		String result;
		int min = 1; // Minimum value of range
		int max = 3;// Max value of range




		//declare & create objects
		RockPaperScissors c;
		c=new RockPaperScissors();




		//input
		userStep=Integer.parseInt(JOptionPane.showInputDialog(null,"Press 1 if Rock, 2 if Paper, 3 if Scissors"));
		compStep=(int)Math.floor(Math.random() * (max - min + 1) + min);
		//System.out.println(compStep);

		//set
		c.setUserStep(userStep);
		c.setCompStep(compStep);

		//compute
		c.compute();
		//get
		result=c.getResult();
		//output
		JOptionPane.showMessageDialog(null," Computer "+compStep);
		JOptionPane.showMessageDialog(null," You "+result);
	}
}
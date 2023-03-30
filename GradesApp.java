import java.util.*;
public class GradesApp{
	public static void main(String[] args){
		//vars
		int numSubjects;//input
		double[] results;
		String[] grades;
	 	double average;


		//objects
		Scanner keyboard=new Scanner(System.in);
		Grades g=new Grades();

		//input
		System.out.println("How many subjects?");//ask the user how many subjects they want to enter
		numSubjects=keyboard.nextInt();//store the answer for the subjects

		results=new double[numSubjects];//creating an array of size no subjects. Final size of array.Specified size
		g.setResults(results);//send the results back to the grades instan class to be processed



		for(int i=0;i<results.length;i++){
			System.out.println("Enter result for subject "+(i+1));
			results[i]=keyboard.nextDouble();
		}


		//compute
		g.computeAverage();
		g.computeGrades();
		//get
		average=g.getAverage();
		grades=g.getGrades();
		//output
		System.out.println("Your average is "+average);
		for(int i=0;i<results.length;i++){
			System.out.println("Your result for module "+(i+1)+" was " +results[i]+"\n This means your grade was "+grades[i]);

		}
	}
}
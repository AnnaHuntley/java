import java.util.*;

public class ResultsSubjectsApp{

	    public static void main(String args[]){

	        /*
	         * TODO:
	         * 1. Get the user input to set the grade for each year
	         * 2. then we match the user input grades to a grades object by calling the setGradeArray methods
	         * 3. compute the yearly average and the absolute average for all year
	         * 4. print the answers to the screen
	         */

	         double inputGrades [][] = new double[4][5];
	          Scanner keyboard=new Scanner(System.in);

	         // STEP 1
	         // get the user input
	         for(int year=0; year<inputGrades.length; year++){
	            System.out.println("we will now ask you for the grades for year: " + (year+1));

	            for(int subjectNumber=0; subjectNumber<inputGrades[year].length; subjectNumber++){

	                // this sets each item in the input array equal to some double given by the user
	                System.out.println("Give us the grade for subject number:" + (subjectNumber+1));
	                inputGrades[year][subjectNumber]=keyboard.nextDouble();
	            }
	         }

	         // STEP 2

	         ResultsSubjects gr = new ResultsSubjects();
	         gr.setGradeArray(inputGrades);

	         // STEP 3
	         gr.computeYearlyAverage();
	         gr.computeTotalAverage();

	         // STEP 4
	         double [] yearlyAverage = gr.getYearlyAverage();
	         double totalAverage = gr.getTotalAverage();

	       System.out.println( "The total average is: " + totalAverage);

	         for(int yearNumber=0; yearNumber<yearlyAverage.length; yearNumber++){
	            System.out.println("The average for year: " + (yearNumber+1) + " is : " + yearlyAverage[yearNumber]);
	         }

	    }
	}


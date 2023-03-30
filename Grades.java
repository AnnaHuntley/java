/*
Description of the application. Ask the user user for how many subjects and what are the results for these subjects based on the user inputs. Based on the results, print out what grade they got and then finally an overall average.
*/
public class Grades{
	//Data Members
	private double[] results;//input for storing the results coming in from the user
	private String[] grades;//output - send back individual grade based on result from user
	private double average;//output -overall average of all the results

	//constructor
	public Grades(){
		average=0.0;
	}
//setters - inputs from the user from the app class
	public void setResults(double[] results){
		this.results=results;
	}
	//compute
	public void computeAverage(){//work out the average
		for(int i=0;i<results.length;i++){
			//grab each result in the loop and add together and store it in the average variable
			average=average+results[i];
		}//close of the loop
		average=average/results.length;//working the average outside of the loop
	}
	public void computeGrades(){

		//setting up the grades - single D Array. We don't know the size at this stage so that will be determined by the user in the application
		grades=new String[results.length];
		for(int i =0;i<grades.length;i++){
			if(results[i]>=70 && results[i]<=100){
				grades[i]="1.1";
			}
			else if(results[i]>=60 && results[i]<70){
				grades[i]="2.1";
			}
			else if(results[i]>=50 && results[i]<60){
				grades[i]="2.2";
			}
			else if(results[i]>=40 && results[i]<50){
				grades[i]="Pass";
			}
			else if(results[i]>=0 && results[i]<40){
				grades[i]="Fail";
			}
			else{
				grades[i]="Invalid result";
			}
		}
	}
	//get
	public double getAverage(){
		return average;
	}
	public String[] getGrades(){
		return grades;
	}

}
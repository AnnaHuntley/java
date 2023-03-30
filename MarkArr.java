/*
MarkArr.java
A Samus
06.03.2023
*/
public class MarkArr{
		int amount;
		private double[] results;//input for storing the results coming in from the user
		private String[] grades;//output- send back individual grade based on results
		private double average;//output - overall average of all the results

		public Grades(){
			average=0;
		}
		public void setResults(double[] results){
			this.results=results;
		}
		public void computeGrades(){
			for(int i=0;i<results.length;i++){
			//grab each result in the loop and add together and store in the average variable
			average=average+results[i];
		}
		average=average/results.length;
	}
		public void computeGrades(){
		//setting up the grades - single D Array. We dont know the size at this stage so that will be determind by the user in the application
			grades=new String[results.length];
			for(int i=0;i<grades.length;i++){
				if(results[i]>=70&&results[i]<=100){
					results[i]="1.1"
				}
			}

			public




/*
Write a program that allows a user to enter 5 results for each year of a 4 year course. The app should:
Give an average for each year
Give a total average
*/
public class ResultsSubjects{
	//data members
	double gradeArray[][];//hold the 4 years of 5 results per year
	double yearlyAverage[];//hold the average for every year based on those 5 results
	double totalAverage;
	double totalSum;

	//constractor
	public ResultsSubjects(){
		gradeArray=new double[4][5];//4 years 5 results
		yearlyAverage=new double[4];//work out average of 4years,year 1,2,3,4
	}

	//setter-sets each item in my gradearray equal to an array I receive from the app class
	public void setGradeArray(double[][]gradeArray){
		//loop starts at the 1st year so index 0,end loop at the end of the results in the array
		for(int years=0;years<gradeArray.length;years++){
			for(int subjectNumber=0;subjectNumber<gradeArray[years].length;subjectNumber++){
				this.gradeArray[years][subjectNumber]=gradeArray[years][subjectNumber];
			}
		}
	}


	//compute
	public void computeTotalAverage(){
		//loop that pows through the array for each year
		for(int years=0;years<gradeArray.length;years++){
			//loop that goes through the array for each subject in that year
			for(int subjectNumber=0;subjectNumber<gradeArray[years]/*same year for 5 subjects*/.length;subjectNumber++){
				totalSum=totalSum+gradeArray[years][subjectNumber];
			}
		}
		totalAverage=totalSum/(4*5);
	}
	//compute to work out the average PER year
	public void computeYearlyAverage(){
		for(int years=0;years<gradeArray.length;years++){
			//calculate the total for that year
			double thisYearSum=0;//reset the sum to 0 for each year
			//loop goes through the array for each subject in that year
			for(int subjectNumber=0;subjectNumber<gradeArray[years].length;subjectNumber++){
				thisYearSum=thisYearSum+gradeArray[years][subjectNumber];
			}
			yearlyAverage[years]=thisYearSum/5;

		}
	}
	//getters
	double [] getYearlyAverage(){
		return yearlyAverage;
	}
	double getTotalAverage(){
		return totalAverage;
	}
}
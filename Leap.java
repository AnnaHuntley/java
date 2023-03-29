/*
Leap.java
A Samus
20.02.2023
*/

public class Leap{

	//data members
	private int year;//input
	private String leapYear;

	//contructor
	public Leap(){
		year=1;
		leapYear="";
	}

	//setters i.e. inputs coming in from the app class
	public void setYear(int year){
		this.year=year;
	}

	//compute - process - calculations

	public void compute(){

		if(year%4==0){
				if((year%100==0)){
					if((year%400==0)){leapYear="leap";}
					else {leapYear="not leap";}
				}
				else {leapYear="leap";}
		}
		else {
			leapYear="not leap";
		}



	}//closes the compute method


	//getters - send the data to the app class
	public String getLeapYear(){
		return leapYear;
	}


}//closes the class signature
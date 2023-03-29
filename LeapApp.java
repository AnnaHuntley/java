/*
LeapApp.java
A Samus
20.02.2023
*/

import java.util.*;
public class LeapApp{
	public static void main(String args[]){

		//variables
		String leapYear;
		int year;

		//objects
		Scanner keyboard=new Scanner(System.in);
		Leap myLeap=new Leap();

		//inputs
		System.out.println("Please enter the year");
		year=keyboard.nextInt();
		myLeap.setYear(year);


		//process
		myLeap.compute();


		//output
		leapYear=myLeap.getLeapYear();
		System.out.println("This year is a "+leapYear);
	}
}
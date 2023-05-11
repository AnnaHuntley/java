/*
ValidPassApp.java
Samus Anna
11.05.2023
*/

import java.util.Scanner;

public class ValidPassApp{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		// create an object/instance of the instantiable class
		ValidPass va=new ValidPass();
		//variable to store amount of aliases
		int nums;
		System.out.println("How many aliases you would like to validate?");
		nums=keyboard.nextInt();
		keyboard.nextLine();

		for(int i=0;i<nums;i++){
			System.out.println("Please enter the "+(i+1)+" alias");
			//store user input
			String userAlias=keyboard.nextLine();

			va.setAlias(userAlias);
			va.validate();
			va.getResult();
			System.out.println(va.getResult());
		}

	}

}
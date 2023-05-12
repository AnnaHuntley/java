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
	System.out.println("How many passwords you would like to generate?");
	int numP=keyboard.nextInt();
	int[] mod = new int[numP];
	//fill array mod with user inputs
	for (int i=0;i<numP;i++){
	System.out.println("Please enter "+(i+1)+" numbers between 11 and 19 inclusive.");
		mod[i]=keyboard.nextInt();
	}
	//String passwords[]=new String[numP];

	va.createPassword(numP, mod);
	System.out.println("Generated passwords:");
	        for (int i = 0; i < numP; i++) {
	             System.out.println(va.getPasswords()[i]);
        }
	}

}
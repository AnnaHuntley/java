/*
BloodApp.java
A Samus
20.02.2023
*/
import java.util.*;

public class BloodApp{
	public static void main(String args[]){
		String group, giveTo, receiveFrom;
		int age;

		Scanner keyboard=new Scanner(System.in);
		Blood myBlood=new Blood();

		System.out.println("Please enter your age");
		age=keyboard.nextInt();
		myBlood.setAge(age);

		System.out.println("Please enter your blood group");
		group=keyboard.next();
		myBlood.setGroup(group);

		myBlood.compute();

		giveTo=myBlood.getGive();
		receiveFrom=myBlood.getReceive();

		System.out.println("You can give your blood to "+giveTo);
		System.out.println("You can receive blood from "+receiveFrom);

	}




}
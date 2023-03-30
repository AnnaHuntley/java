import java.util.Scanner;

public class DefaultPasswordApp {

public static void main(String args[]){
Scanner input = new Scanner(System.in);

System.out.println("Enter your full name (forename surname)");
String t = input.nextLine();

int number;
		do{
			System.out.println("enter a number between 3 and 5");
			number = input.nextInt();
		}
		while(number < 3 || number >5);

		// create an object/instance of the instantiable class DefaultPassword
		DefaultPassword p = new DefaultPassword();

		// use the setter method to store the value of t in the instance variable text
		p.setText(t);
		// use the setter method to store the value of number in the instance variable n
		p.setN(number);

		// processing: generate the password
		p.generatePassword();

		// use the getter method to retrieve the password
		String password = p.getPassword();
		System.out.println(password);
}
}

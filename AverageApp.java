//app to ask the user for 5 numbers and get the average of the num
/*
A
07.03.2023
*/
import java.util.*;
public class AverageApp{
	public static void main(String args[]){
		int arr[];//declare the array
		arr=new int[5];//assigns the array
		int sum=0;
		int avg=0;

		Scanner keyboard=new Scanner(System.in);

		//input
		for(int i=0;i<5;i++){
		System.out.println("Enter a numer");
		arr[i]=keyboard.nextInt();

		}

		//process
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];//process part that adds all the numbers together inside of the array inside of the loop

		}
		avg=sum/arr.length;

		//output
		System.out.println("The average is "+avg);
	}
}
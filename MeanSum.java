/*
MeanSum.java
A. Samus
06.03.2023

*/

public class MeanSum{
	public static void main(String[] args){
		int[] somenumbers={5,10,23,56,85,6,11};
		int sum=0;
		int mean=0;

		for (int i=0;i<somenumbers.length;i++){
			sum=sum+somenumbers[i];

		}
			System.out.println("Sum of elements : " + sum);

			mean=sum/somenumbers.length;

			System.out.println("The mean of array "+mean);

	}


}
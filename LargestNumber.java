/*
LargestNumber.java
A. Samus
06.03.2023

*/


public class LargestNumber{
	public static void main(String[] args){
		int[] somenumbers={5,10,23,56,85,6,11};
		int largest=somenumbers[0];
		for (int i=0;i<somenumbers.length;i++){
			if(somenumbers[i]>largest){
				largest=somenumbers[i];
			}

		}
			System.out.println("The largest number is "+largest);

	}


}
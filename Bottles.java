/*
Bottles.java
A Samus
27.02.2023
*/

public class Bottles {
		public static void main(String[] args){
	for (int i=99; i>=1; i--){
		if(i>1){
		System.out.println(i+" bottles of beer on the wall, " +i+ " bottles of beer");
		System.out.println("Take one down and pass it around, " +(i-1)+ " bottles of beer on the wall");
	}
	else {
		System.out.println(i+" bottles of beer on the wall, " +i+ " bottles of beer");
		System.out.println("No more bottles of beer on the wall, no more bottles of beer\nGo to the store and buy some more, 99 bottles of beer on the wall");
		}
	}


}

}


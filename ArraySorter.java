/*Create an instantiable class that sorts a given array into a subset array of either even or odd numbers. The class should have 1 method that accepts 2 parameters:

-An array of numbers
-An integer representing whether the subset array to be returned will contain odd or even numbers (0= even, 1=odd)
The same method should then sort the given array into a smaller array containing either all odd or all even numbers. This array should then be returned. */


public class ArraySorter{
	private int[] sortedArray;
	private int positionInSortedArray;
	private int odds;
	private int evens;

	//constructor
	public ArraySorter(){
		odds=0;
		evens=0;
		positionInSortedArray=0;
	}
	//set/compute/get
	public int[] sortArray(int[] array, boolean evenOdd){
		for(int i=0;i<array.length;i++){
			if(array[i]%2==0){
				evens++;
			}
			else{
				odds++;
			}
		}
		//treating true as even, false as odd
		if(evenOdd){
			sortedArray=new int[evens];
		}
		else{
			sortedArray=new int[odds];
		}
		//sort array
		for(int i=0;i<array.length;i++){
			if(((array[i]%2==0) && (evenOdd == true)) || ((array[i]%2!=0) && (evenOdd==false))){
				sortedArray[positionInSortedArray] = array[i];
				positionInSortedArray++;
			}
		}
		return sortedArray;
	}
}
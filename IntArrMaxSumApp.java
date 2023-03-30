
public class IntArrMaxSumApp {
	public static void main (String[]args){
		int[] arr={5,10,23,56,85,6,11};
		int sum;
		int max;

		IntArrMaxSum iams = new IntArrMaxSum();


		iams.arrSetCalc(arr);

		sum=iams.getSum();
		max=iams.getMax();

		System.out.println(sum);

		System.out.println(max);
	}


}
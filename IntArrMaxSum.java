public class IntArrMaxSum {
	private int[] arr;
	private int max;
	private int sum;

	public IntArrMaxSum(){
		max=0;
		sum=0;
	}

	public  void arrSetCalc(int[] arr){
		this.arr=arr;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}

	}
	public int getSum (){
		return sum;
	}
	public int getMax (){
		return max;
	}

}












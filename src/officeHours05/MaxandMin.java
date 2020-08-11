package officeHours05;

public class MaxandMin {

	
	public static void main(String[] args) {
//	write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array
//		Input : {3,2,5,4,1,6}
//		Output : min: 1 max : 6

		int arr[]={3,2,5,4,1,6};
	    MaxandMin(arr);
	//1) Create method	
	}
	public static void MaxandMin(int arr[]) {
		// 2) Find min and max value
		//3) Print the result
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
		if(arr[i]>max)	{
			max=arr[i];
		}if(arr[i]<min) {
			min=arr[i];
			
		}
	}
		System.out.println("Min value in the array : " +min+ "\nMax value in the array " +max);	
		
	}

}

package officehoursday_03;

public class FindingSum {

	static int sum=0;
	public static void main(String[] args) {
//		Write a method that accepts an array as parameter and returns sum off all elements in the array
//		Then print the result, in the main method 
//		Eg : input : {1,2,3,4,5,6,7,8};
//		     output: 36
       
	
	
	int arr[]= {1,2,3,4,5,6,7,8};
    


}
	
	public static int sumOfElements(int arr[]) {
		int sum = 0;
		for (int each:arr) {
			sum+=each;
		}
		
		return sum;

	}
}
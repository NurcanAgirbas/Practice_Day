package officeHours05;

public class Average {

	public static void main(String[] args) {
//		write a java program that calculates the average value of array elements
//		input[]= {1,2,3,4,5,6,7}
//		Output : 4
		
		int arr[]={1,2,3,4,5,6,7};
		
		//1) find the sum of element
		double sum=0;
		for(int each:arr) {
			sum+=each;
				}
		double average=sum/arr.length;
		System.out.println("Average of elements in given array " +average);
	}

}
 
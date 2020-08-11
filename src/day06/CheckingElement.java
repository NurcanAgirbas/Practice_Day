package day06;

public class CheckingElement {

	public static void main(String[] args) {
//		create a method to test if an array contains a
//		specific value returns true otherwise returns false
//		Then print the result in main method
//		input[]= {1,2,3,4,5,6,7} num:6
//		Output : “Array contains 6”
		int[] input = { 1, 2, 3, 4, 5, 6, 7 };
		int num = 6;
		if (checkElement(input, num)) {
			System.out.println("The input arrays contains " + num);
			else
				System.out.println("The input arrays doesn't contains " + num);
			}
		}

	

	public static boolean checkElement(int input[], int num) {
		boolean result = false;
		for (int each : input) {

			if (each == num) {
				result = true;
			}
		}
		return result;

	}

}

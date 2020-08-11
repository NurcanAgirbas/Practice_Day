package officehoursday_03;

import java.util.Scanner;

public class FindingSumOfInteger {

	public static void main(String[] args) {
//		write a method which accepts a String as parameter and prints the sum of the digits, present in the given string
//		Eg: input : ade1r4d3   output : 8
//		Hint : Use Character.isDigit()
//		               Integer.valueOf()
		String input="ade1rd43";
		sumOfDigit(input);
		
	}
	
	//1)Create method
	public static void sumOfDigit(String input) {
		
		//2) find sum of digits
		int sum=0;
		for(int i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))) {
				sum+=Integer.valueOf("" +input.charAt(i));
			}
		}
		
		System.out.println("sum of digits : " + sum);
	}
	

}

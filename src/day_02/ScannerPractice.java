package day_02;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		// Creating Scanner Object
		// using the scanner object we can get different type of data from user
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str1=scan.nextLine();
		System.out.println("enter an integer");
         int i=scan.nextInt();
         //double object
         System.out.println("Enter a double");
         double d= scan.nextDouble();
         
         // char input
         System.out.println("Enter a char");
         char ch=scan.next().charAt(0);
         
         // String input // When we use next() we need to keep using next
         System.out.println("Enter a string");
         String str=scan.next();

	}

}

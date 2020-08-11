package homeworkforloop;

import java.util.Scanner;

public class ReviewQ4 {

	public static void main(String[] args) {
		/*
		 *  Ask user ta enter his/her first and last name. If the first name is longer
		 *  output will be “First name is longer.” If the length of last name is equal 
		 *  To the length of last name output will be “First name and last name 
		 *  have same length.” Otherwise, output will be “Last name is longer
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=scan.nextLine();
		System.out.println("What is your last name?");
		String lastName=scan.nextLine();
		
		int a=name.length();
		int b=lastName.length();
		
		if(a>b) {
			System.out.println("First name is longer");
		}else if(a==b) {
			System.out.println("First name and last name have same length");
		}else {
			System.out.println("Last name is longer");
		}scan.close();
	}

}

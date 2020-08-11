package day_3;

import java.util.Scanner;

public class StringManipulations5 {

	public static void main(String[] args) {
		/* Ask user to enter first and last name. 
		Then print the first initial Upper Case and rest lower case
		And print the last initial Upper Case and rest lower case e.g JoHN cash => John Cash*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName=scan.nextLine();
		System.out.println("Enter last name");
		String lastName=scan.nextLine();
		
		
		String str1=firstName.substring(0,1).toUpperCase() + firstName.substring(1,firstName.length()).toLowerCase();
		String str2=lastName.substring(0, 1).toUpperCase()+lastName.substring(1, lastName.length()).toLowerCase();
		firstName.toUpperCase().charAt(0);
		lastName.toUpperCase().charAt(0);
		
		System.out.println(str1 + " " + str2);
		}
	}


package day_04;

import java.util.Scanner;

public class RepeteadChars {

	public static void main(String[] args) {
		// ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name
		//	 char ch1= 'a' ;
		// String name =“John came late" => number of a = 2
		
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter a string");
		String name=scan.nextLine();
		System.out.println("Enter a char");
		char ch=scan.next().charAt(0);
		int counter=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==ch) {
				counter++;
			}
			
		}
		System.out.println("number of " + ch + " = "+counter);

	}

}

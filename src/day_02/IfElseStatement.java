package day_02;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		/*
		 Print “Please enter your job title”
create a String variable named “jobTitle” and get the data from the user
Use the below test data to print the correct jobTitle.
Example : if jobTitle is qa then print “Your job title is Qualty Analyst”
	test data:
	qa then print Quality Analyst
	dev then print Developer
	ba then print Business Analyst
	pm then print Project Manager
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your title");
		String jobTitle=input.next();
		String qa="Quality Analyst";
		String dev="Developer";
		String ba="Business Analyst";
		String pm="Project manager";
		
		if(jobTitle.toLowerCase().equals("dev")); {
			System.out.println("Your job title is " +qa);
		} if(jobTitle.toLowerCase().equals("dev")); {
			System.out.println("Your job title is " +ba);
	}if(jobTitle.toLowerCase().equals("pm")); {
		System.out.println("Your job title is " +pm);

}if(jobTitle.toLowerCase().equals("dev")); {
	System.out.println("Your job title is " +qa);
}}}
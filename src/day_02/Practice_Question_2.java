package day_02;

import java.util.Scanner;

public class Practice_Question_2 {

	public static void main(String[] args) {
		/*
		 * Create a class : “IfElseStatement”
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
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a title");
		String jobTitle=scan.nextLine();
		if(jobTitle.equals("qa")) {
		System.out.println("Qality Analyst");
		}else if(jobTitle.equalsIgnoreCase("dev")) {
			System.out.println("Developer");
		}if(jobTitle.equalsIgnoreCase("ba")) {
			System.out.println("Business Analyst");
		}else if(jobTitle.equalsIgnoreCase("pm")){
			System.out.println("Project Manager");
		}
		 
	
	}

}

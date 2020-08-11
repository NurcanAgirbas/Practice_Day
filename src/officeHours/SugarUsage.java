package officeHours;

import java.util.Scanner;

public class SugarUsage {

	public static void main(String[] args) {
//		Write a Java program that asks to user 2 questions
//		Question 1 = how many tea do you drink in a day?
//		Question 2 = how many sugar do you use for a glass of tea?
//		Calculate how many sugar does user use as kilogram in a year and in 40 years then print it on the console
//		If user doesn’t use sugar print “Good Job, less sugar more health”
//	    (Hint 1 sugar = 2.7 gr)=
		
		Scanner scan=new Scanner(System.in);
		System.out.println("how many tea do you drink in a day?");
		double tea=scan.nextDouble();
		System.out.println("how many sugar do you use for a glass of tea?");
		double sugar=scan.nextDouble();
		
		//Calculate usage
		
		double usageYearly=tea * sugar * 2.7 * 365 / 100;
		double usageFourthy=usageYearly *40;
		
		// Print result check condition
		
		if(sugar==0) {
			System.out.println("Good Job, less sugar more health");
		}else {
		System.out.println("^Your yearly usage is = " + usageYearly + "kg");
		System.out.println("Your usage for 40 years is =" +usageFourthy + "kg");
	}
	
	
	
	
	}
	

}

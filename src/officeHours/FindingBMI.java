package officeHours;

import java.util.Scanner;

public class FindingBMI {

	public static void main(String[] args) {
		/*Write a Java program to compute body mass index (BMI)
		print the situation. Is user weak, fat or obese ?
		(Hint BMI = weight(kg)/ (height*height)(m)
		BMI<20 weak 
		20<BMI<25 healthy
		25<BMI<30 fat
		Over 30 obese*/
		
	Scanner scan=new Scanner(System.in);
		
	System.out.println("Please enter your weight as kg");
	double weight=scan.nextDouble();
	System.out.println("Please enter your height as cm");
	double height=scan.nextDouble();
	height=height/100;
	
	double bmi=weight/(height*height);
	
	if(bmi<20) {
		System.out.println("You are weak");
	}else if(bmi<25) {
		System.out.println("You are healty");
	}else if(bmi<=30) {
		System.out.println("You are fat");
	}else 
		System.out.println("You are obese");
			
	}

}

package day_02;

import java.util.Scanner;

public class IfElseStatement2 {

	public static void main(String[] args) {
		/*
		 Create a class : “IfElseStatement2”Print “Please enter your operation and 2 number”
         Get one operation symbol from userPrint “Please enter 2 numbers”
         Get 2 double numbers form usersExample
         if Addition, 7, 4 then print here is the sum of your operation 7 + 4 = 11Test data:
         Addition Subtraction
         Division Multiplication
         white_check_markeyesraised_hands */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your operation");
		String operation=scan.next();
		
		System.out.println("Please enter number1");
		double num1=scan.nextDouble();
		System.out.println("Please enter number2");
		double num2=scan.nextDouble();
		 
		boolean x=scan.hasNextBoolean()
				
		if(operation.equalsIgnoreCase("Adittion")) {
			System.out.println("The adittion of "+num1+" and"+num2+" equals "+ num1+num2);
		}else if(operation.equalsIgnoreCase("substruction")) {
			System.out.println("The difference between " +num1+ " and"+num2+" equals " + (num1-num2));
		}else if(operation.equalsIgnoreCase("dividion")) {
			System.out.println("The quotiant of your operation " +num1+ " and" +num2+ " equals " +(num1/num2));
		}else if(operation.equalsIgnoreCase("multplication")) {
			System.out.println("The product of your operation " +num1+ " and" +num2+ "equals " + (num1*num2));
			
		}else {
			System.out.println("The "+operation+" is not valid.Try it again");
		}
              scan.close();
	}

}

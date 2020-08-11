package day_3;

import java.util.Scanner;

public class TernaryPriceCheck {

	public static void main(String[] args) {
		/*
		Write a code using ternary:
		Create int variable : price
		Create string variable : decision
		If the price = $10 Print “cheap”
		If price is 10-$20 print “ok”	Otherwise “expensive”.
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a price");
	    int price=scan.nextInt();
			
	String decision;
	
	/*if(price==10) {
	decision="cheap";	
	}else if(price>=10 && price<=20 ) {
		decision="ok";
	}else {
		decision="expensive";
	}
	
	System.out.println("Decision with if "+ decision);*/
	
	decision =(price>=1 && price<=10)? "cheap":(price>=10 && price<=20)?"ok":"expensive";
	System.out.println(decision);
		
	
		
		
	}	
		

	}



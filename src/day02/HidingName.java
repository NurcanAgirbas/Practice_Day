package day02;

import java.util.Scanner;

public class HidingName {

	public static void main(String[] args) {
//		Initials for name and surname should be uppercase)Ask user Name, Surname and credit card numbers than convert it to special form
//		(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”
//		Input   : John White 1234234534561478
//		Output : Name : J*** W****
//		             CCN  : **** **** **** 1478
////		
		//get data from user
		
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter name");
       String name=scan.nextLine();
       System.out.println("Enter lastname");
       String lastName=scan.nextLine();
       System.out.println("Enter cradit num");
      String ccn=scan.next();
       // Check CCN if it has 16 digit or not
      if(ccn.length()!=16) {
    	  System.out.println("Your credit card number is invalid");
      }else {
    	  // convert data to expected form
    	  // print data on the console
    	name=name.substring(0, 1).toUpperCase() + name.substring(1).replaceAll("\\w","*");
    	lastName=lastName.substring(0,1).toUpperCase() +lastName.substring(1).replaceAll("\\w","*");
    	ccn="****"
      }
      
	}

}

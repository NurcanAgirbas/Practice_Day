package day_01;

import java.util.Scanner;

public class Practice_01 {
public static void main(String[] args) {
	/*
	 * Ask user to enter password, if the password is okay for the following conditions output will be
	 *  “Your password is created successfully.” If the password is not okay for any of the following conditions
	 *  Output will be “Enter a new password according to the give conditions”  
	 * 1.First letter must be uppercase
	 *  2.Last letter must be lowercase 
	 *  3.Password must contain 6 characters
	 * 
	 */
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a password ");
	String password=scan.nextLine();
	
	char firstLet=password.charAt(0);
	char lastLet=password.charAt(5);
	
	if(firstLet>='A' && firstLet<='Z' && lastLet>='a' && lastLet<='z' && password.length()==6) {
	System.out.println("Your password is created successfuly");
  }	else {
	  System.out.println("Enter a new password according to the give conditions");
  }scan.close();
}}
		
			
	
			
		
	
	
			
		
	

package day_3;

import java.util.Scanner;

public class StringManipulations1 {

	public static void main(String[] args) {
		//ask user to enter an e-mail address 
		//then if it contains "hotmail" replace it with "gmail" 
		//e.g: johnbrown@hotmail.com ==> johnbrown@gmail.com
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter an email address");
	String email=scan.nextLine();
	
	if(email.contains("hotmail")) {
		
		System.out.println(email.replace("hotmail", "gmail"));
	}else {
		System.out.println("You didnot enter a hotmail address");
	}scan.close();
	}

		

	}



package day_3;

import java.util.Scanner;

public class StringManipulations4{

	public static void main(String[] args) {
	
		/*Ask user to enter a word.  If the word has odd number of characters and has 3 or more character, 
		Then print the character in the middle of the word. If there is only one character, print
		“Please enter more than one character 
		,otherwise print the first and last char of the word.
		E.g Javac => “v” J=> print “Please enter more than one character” Java  => “Ja” */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=scan.nextLine();
		
		if(word.length()%2==1 && word.length()>=3) {
			System.out.println(word.charAt(word.length()/2));
		}else if(word.length()==1) {
			System.out.println("Please enter more than one character");
		}else {
			System.out.println("" +word.charAt(0) + word.charAt(word.length()-1));
		}
		
		}
		

	}



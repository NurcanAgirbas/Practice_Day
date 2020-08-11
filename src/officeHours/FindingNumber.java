package officeHours;

import java.util.Random;
import java.util.Scanner;

public class FindingNumber {

	public static void main(String[] args) {
//		Generate a Random integer between 0-100.
//		ask user to find integer.
//		For every guess print to console “My number is smaller than your number ”(or greater )
//		and finally if user find the number print how many guess did user enter.
 
		//1- Generate a random int
		
		Random rnd = new Random();
		
		int number=rnd.nextInt();
		System.out.println(number);
		int count=0;
		int guess=1;
		
		//2-Get data from user 
		do {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter an integer less than 100");
	guess=scan.nextInt();
	
	if(guess==number) {
		System.out.println("You found My Number" + count + "guess");
			
		}else {
		   if(guess<number) {
			   System.out.println("My number is greater than yours");
		   }else {
			   System.out.println("My number is smaller than yours");
			   count++;
		   }
	
		}while (guess!=number);
		//3-compare 2 numbers 
		//4-If numbers are equal to each other print result	 }
	}
}

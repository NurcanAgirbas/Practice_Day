package homeworkforloop;

import java.util.Scanner;

public class Review_Questions {

	public static void main(String[] args) {
		/*
		 * Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console. 
		 * If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same  and print it on the console
		 */
            
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter an integer");
		int num=scan.nextInt();
		if(num>0 && num<10) {
			System.out.println("square "+(num*num));
		}else if(num>10) {
			System.out.println("multiply by 2 "+(num*2));
		}else {
			System.out.println(num);
		}scan.close();
	}

}

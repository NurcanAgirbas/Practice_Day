package day_05;

import java.util.Arrays;

public class WarmUp {

	public static void main(String[] args) {
		/*Clearte a package: day_05 Create a class: WarmUp
		Declare 3 chars: ch1=‘S’, ch2=‘A’, ch3= ‘M’
		Declare a String: name;
		Store these chars in that string and print: ‘SAM’ using the name variable
		Declare 3 Strings: name1=sam, name2=john, name3=tom Declare a String Array: array;
		Store this strings in that array
		And print: sam john tom
		And then print [sam,john,tom]
		Create the same array using different ways.*/
		
		char ch1='S';
		char ch2='A';
		char ch3='M';
		
		String name="";
		name+="" +ch1+ch2+ch3;
		System.out.println(name);
		
		
		String name1="sam";
		String name2="john";
		String name3="tom";
		
		String arr[]= {name1,name2,name3};
		
		for(String each:arr) {
		System.out.print(each + " ");	
		
		
		}
		System.out.println();
		
		System.out.println(arr[0]+" "+ arr[1]+ " "+arr[2] );
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		

	}

}

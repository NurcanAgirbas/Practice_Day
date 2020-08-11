package day06;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {

	public static void main(String[] args) {
//		write a program to find the common elements between two String Arrays
//		(without case sensitivity)
//		Input1 : {John,Brad,Ange,Sofia,Emily}
//		Input2 : {sofia,brad,grace,emily,hazel}  
//		Output : [sofia,brad,emily]
		
		String input1[]= {"John","Brad","Ange","Sofia","Emily"};
		String Input2[] = {"sofia","brad","grace","emily","hazel"};  
	 
	 List<String>lt=new ArrayList<>();
	 for(int i=0;i<input1.length;i++) {
		 for(int j=0;j<Input2.length;j++) {
			 if(input1[i].equalsIgnoreCase(Input2[j])) {
			System.out.println(input1[i]);	 
			 }
		 }
	 }
		}

	}



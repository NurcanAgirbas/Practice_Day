package day06;

import java.util.ArrayList;
import java.util.List;

public class MaxNElement {

	public static void main(String[] args) {
//		write a java program to find out the first “n” max values from an array
//		(do not use sort method)
//		Input : {1,2,3,4,5,6,7,8}  input n:2
//		Output : 7 and 8
		
		int count =1;
		while(count <=n) {
		int max = inputList.get(0);
		for(int i=0; i<inputList.size(); i++) {
			if(inputList.get(i)>max) {
				max=inputList.get(i);
			}
		}
		
	  output.add(max);
	  inputList.remove(inputList.indexOf(max));
	  count++;

		}
	}

}









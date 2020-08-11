package day_05;

import java.util.Arrays;

public class PrintArrays1 {

	public static void main(String[] args) {
//	/*	! Create a static void method: acceptArray
//		It should take one String array as parameter
//		! and print them as an array
//		! e.g String[] array = { "sam", "john", "tom" };
//		! acceptArray(array);
//		! Then output: [sam,john,tom]
//		! Create another static method :acceptArray2
//		It should take one String array as parameter
//		! and print each element in the array
//		! e.g String[] array = { "sam", "john", "tom" };
//		! acceptArray2(array); */
//      then output:sam john tom
	        String array[]= {"sam","john","tom"};       
    	   acceptArray(array);
    	   acceptArray2(array);

	}
     
       public static void acceptArray(String array[]) {
     	  System.out.println(Arrays.toString(array)); 
       
}
       
       public static void acceptArray2(String[] array) {
    	   for(String each:array) {
    		   System.out.println(each+" ");
    	   }
       }
}
       
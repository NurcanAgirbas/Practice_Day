package day_05;

public class ReverseSentence {

//	public static void main(String[] args) {
//		!Create a method: reverseString
//		!It should accept a string sentences
//		! And return the reverse of that string sentences.
//		! E.g:
//		!String str ="I love Java"; !Output:"Java love I”
     
	public static void main(String[]args) {
		
		 // return = result, return type = result type
	    // A moethod can be VOID or have a RETURN TYPE(String, int, byte, char)
	    // If a method has a return type, Then that method MUST have return keyword at
	 // the end!
		
	  String str="I love java";
	  String reversedString=reverseString(str);
	  System.out.println(reversedString);
    
}
      public static String reverseString(String sentence) {
    	  String reversed="";
    	  
    	  String[] splitted=sentence.split(" "); // [i, love, java]
    	  for(int i= splitted.length-1; i>=0; i--) {
    		  reversed+=splitted[i]+" ";
    	  }
    	  
    	  
    	  
    	  return reversed;
      }

	
}




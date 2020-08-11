package officehoursday_03;

public class CheckingStrings {

	static boolean result;
	public static void main(String[] args) {
//		write a return method that check if a string is build out of the same letters as another string
//				(Without case sensitivity)
//				Eg: input : “abc” and check String: “cab” returnsè true
//				   Input : “İstanbul 1453”
//				   Check String : “abcdefghijklmnopqrstuwyz1234567890!@#$%^&*()_+-/”
//				  returns èfalse

   String input="İstanbul 1453";
   String checkString="abcdefghijklmnopqrstuwyz1234567890!@#$%^&*()_+-/";
   
   checkString(input,checkString);
   System.out.println("result is: " + input);
		
}
	public static boolean checkString(String input,String checkString) {
		for(int i=0;i<input.length();i++) {
			if(checkString.contains(input.substring(i, i+1))) {
		}
		
	}return result;
	}
}
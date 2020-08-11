package day_04;

public class FindingPalindrome {

	public static void main(String[] args) {
		// Create a string variable
		/*  If the string is palindrome then print “Palindrome”
		 If the string is not palindrome then print “Not Palindrome” 1234321
		abcba
		"Able was I ere I saw Elba”
		 A string is palindrome if reversed is equal to the string */
		
		String original="Able was I ere I saw Elba";
		String reversed="";
		for(int i=original.length()-1;i>=0;i--) {
			reversed+=original.charAt(i);
		}
		System.out.println(reversed);
		System.out.println(original);
		if(original.equalsIgnoreCase(reversed)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
	}
	}
}

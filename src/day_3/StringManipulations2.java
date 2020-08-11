package day_3;

public class StringManipulations2 {

	public static void main(String[] args) {
		//Create 2 strings: name1 and name2
		//if the name1 has even numbers of characters, 
		//then insert the second word in the middle of the first name 
		//if the first word has odd numbers
		//Then print the “Name2 cannot be inserted in the name1”
		//
//				e.g: 
//				name1= mehmet
//				name2= ahmet 

		
		String name1="Mehmet";
		String name2="Ahmet";
		


		if(name1.length()%2==0) {
			
			String firstHalf=name1.substring(0, name1.length()/2);
			System.out.println(firstHalf);
			
			String secondHalf=name1.substring(name1.length()/2);
			System.out.println(secondHalf);
			
			System.out.println(firstHalf+name2+secondHalf);
			
		}
	}
	

}

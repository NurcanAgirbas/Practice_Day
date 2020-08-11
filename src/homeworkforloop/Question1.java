package homeworkforloop;

public class Question1 {

	public static void main(String[] args) {
	//1)Write a program to print counting numbers from 10 to 57 on the console by using for-loop.

		
		for(int i=10;i<=57;i++) {
			System.out.println(i);
		}
		
		
	// 2)	Write a program to print even counting numbers from 100 to 43 on the console by using for-loop.
		 
		System.out.println();
		
		for(int i=100;i>=43;i--) {
			System.out.println(i);
		}
		
		// 3)Write a program to print odd counting numbers from 200 to 33 on the console by using for-loop
		
		System.out.println();
		for(int i=200;i>=33;i--) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}  

}

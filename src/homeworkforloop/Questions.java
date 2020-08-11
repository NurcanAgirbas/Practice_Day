package homeworkforloop;

public class Questions {

	public static void main(String[] args) {
	//1)Write a program to print counting numbers from 10 to 57 on the console by using for-loop.
		
	for(int i=10;i<=57;i++) {
	System.out.print(i + " ");		}
				
	// 2)	Write a program to print even counting numbers from 100 to 43 on the console by using for-loop.
	
	System.out.println();
	
	for(int i=100;i>=43;i--) {
	System.out.print(i + " ");}
				
	// 3)Write a program to print odd counting numbers from 200 to 33 on the console by using for-loop
				
	System.out.println();
	
	for(int i=200;i>=33;i--) {
	if(i%2!=0) {
	System.out.print(i + " ");
					}
	//4)Write a program to add counting numbers from 23 to 57 by using for-loop
    //Print the sum on the console
	
	System.out.println();
	
	int sum=0;	 	
	for(int a=23;a<=57;a++) {
	sum=sum+a;
	System.out.print(sum);
	}	
	System.out.println();
	
	//5) Write a program to multiply counting numbers from 7 to 15 by using for-loop.  Print the multiplication on the console
	int product=1;
	for(int b=7;b<=15;b++) {
	product=product*b;
	System.out.print(product);
	System.out.println();
	}
	//6)Write a program to print counting numbers which are less than 200 and divisible by 5  On the console by using for-loop
	for(int c=1;c<200;c++) {
	if(c%5==0) {
	System.out.print(c + " ");
		}
	}
	}

	
	
	}
}

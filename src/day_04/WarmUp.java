package day_04;

public class WarmUp {

	public static void main(String[] args) {
		//Print even numbers between 1-20 inclusive
		
		for(int i=1;i<=20; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
        System.out.println();
        for(int j=1;j<=10;j++) {
        	System.out.print(2*j+ " ");
        }
	  System.out.println();
  //   Print odd numbers between 1-20 
	
	for(int k=1;k<=20;k++) {
	if(k%2!=0) {
		if(k<19) {
		System.out.print(k + ", ");
		}else  if(k>=19){
			
		System.out.println(k);
	}
	}

System.out.println();
//Print all number that is divisible by 5 backword drom 20-1 inc.
   
for(int m=20;m>=1;m--) {
	
	if(m%5==0) {
	if(m>5) {
		System.out.print(m + " ");
	}else if(m<=5) {
		System.out.print(m);
	}
	}
	
} System.out.println();
    // find the sum of all even numbers from 1-20 inc
	
  int sum=0;
  for(int a=1;a<=20;a++) {
	  if(a%2==0) {
		sum+=a;  
	  }
  }
System.out.println(sum);

int num=1;
int sum1=0;
while(num<=20) {
	num++;
	if(num%2==0) {
		sum1+=num;
	}
}
 System.out.println();
// Print all numbers from 1-20 except 11-15
   
 for(int i=1;i<=20;i++) {
	 if(i==11 && i==15) {
		 continue;
	 }else {
		 System.out.print(i + " ");
	 }
 }
  




	}
	}
}
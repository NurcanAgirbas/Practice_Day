package day_3;

import java.util.Scanner;

public class NestedIfStatements {

	public static void main(String[] args) {
//	    Get the year, months, and day as integer
//		then find the older person using Nested if statements
//      IF  year/ month/day are same Then print “Interesting. Same year, month, day”
//		Examples:
//		int birthYearOfYusuf=2002, birthMonthOfYusuf=11, birthDayOfYusuf=12, 
//		int birthYearOfMehmet=2002,birthMonthOfMehmet=11, birthDayOfMehmet=12;
//		Yusuf is Older
		
	Scanner scan=new Scanner(System.in);
	System.out.println("yusufyearbirth");
	int yusufyearbirth=scan.nextInt();
	System.out.println("mehmetyearbirth ");
	int	mehmetyearbirth=scan.nextInt();
	
	
	System.out.println("yusufmonthbirth");
	int	yusufmonthbirth=scan.nextInt();
	System.out.println("mehmetmonthbirth");
	int mehmetmonthbirth=scan.nextInt();
		

		
	System.out.println("yusufdaybirth");
	int	yusufdaybirth=scan.nextInt();
	System.out.println("mehmetdayhbirth");
	int	mehmetdaybirth=scan.nextInt();
		
	if(yusufyearbirth>mehmetyearbirth)	{
	 System.out.println("mehmet is older");
	}else if(yusufyearbirth<mehmetyearbirth) 
      System.out.println("yusuf is older");
	
	
	
	else if(yusufyearbirth==mehmetyearbirth) {
		if(yusufmonthbirth>mehmetmonthbirth) {
			System.out.println("Mehmet is older");
		}else if(yusufmonthbirth<mehmetmonthbirth) {
			System.out.println("Yusuf is older");
		}if(yusufmonthbirth==mehmetmonthbirth) {
			if(yusufdaybirth>mehmetdaybirth) {
				System.out.println("Mehmest is older");
			}else if(yusufdaybirth<mehmetdaybirth) {
				System.out.println("Yusuf is older");
			}if(yusufdaybirth==mehmetdaybirth) {
				System.out.println("Interesting, same year month and day");
			}scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*if(yusufmonthbirth>mehmetmonthbirth) {
		 System.out.println("mehmet is older");	
	}else if(yusufmonthbirth<mehmetmonthbirth) {
		System.out.println("yusuf is older");
	}
	if(yusufdaybirth>mehmetdaybirth) {
		System.out.println("mehmet is older");
	}else if(yusufdaybirth<mehmetdaybirth)
	    System.out.println("yusuf is older");*/
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}

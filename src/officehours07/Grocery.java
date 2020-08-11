package officehours07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grocery {

	static List<String>groceriesList=new ArrayList<>();
	static List<Double>pricesList=new ArrayList<>();
	public static void main(String[] args) {
//		{"Tomatoes","Potatoes","Pepper","Onion","Carrot",                   
//		       "Apple","Banana","Strawberry","Melon","Grape"}
//	
//		{2.1,3.2,1.5,2.3,3.1,1.2,1.9,6.1,4.3,2.7}
   
		String groceriesArray[]= {"Tomatoes","Potatoes","Pepper","Onion","Carrot",   "Apple","Banana","Strawberry","Melon","Grape"};
		for(String each:groceriesArray) {
			groceriesList.add(each);
			
		}
		
		double priceArray[]= {2.1,3.2,1.5,2.3,3.1,1.2,1.9,6.1,4.3,2.7};
		for(double each:priceArray) {
			pricesList.add(each);
			
		}
		Scanner scan=new Scanner(System.in);
		System.out.println("which grocery do you want ? Please select by number at the beginning");
		int groceryNum=scan.nextInt();
		System.out.println("How many kilograms do you want");
	}
public static void printGroceryList() {
	System.out.println("Num Grocery Price");
	System.out.println("==========");
	
	for(int i=0;i<groceriesList.size();i++) {
		System.out.println(groceryNum + " " + groceriesList.get(i)+ " " +weight+ " " +pricesList.get(i)*weight);
	}
	
}
}














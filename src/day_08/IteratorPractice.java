package day_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {

	public static void main(String[] args) {
		/*
         * Create:
         * List<String> capitals = new ArrayList<>();
         * add : athens, berlin, paris, london, dc then print
         * 
         * Create an Tterator object :
         * Iterator<String> listIterator = capitals.iterator();
         * and remove the capitol names that has a or i in it
         */
		
		//Creating arraylist
		List<String> capitals = new ArrayList<>();
	    capitals.add("athens");
	    capitals.add("berlin");
	    capitals.add("paris");
	    capitals.add("london");
	    capitals.add("dc");
	    System.out.println(capitals);//[athens, berlin, paris, london, dc]
	    
	    
	    //Below for loop will give us runtime exception
		/*   for(String s:capitals) {
	    	if(s.contains("a") || s.contains("i")) {
	    		capitals.remove(s);*/

	  	Iterator<String>listIterator=capitals.iterator();
		while(listIterator.hasNext()) {
			String str=listIterator.next();
			if(str.contains("a") || str.contains("i")) {
				listIterator.remove();
				
			}
		}
		
		System.out.println(capitals);

	}}



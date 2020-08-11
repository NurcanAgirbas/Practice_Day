package day_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homewrk {

	public static void main(String[] args) {
		/*
	     * create a list of arraylist
	     * add the courses:
	     * java, selenium, testng, junit, cucumber,api,sql,database,sdlc
	     * print the elements from index 2 to index 7 using sublist: list.sublist(2,7);
	     * using iterators, remote if the string value has e and t
	     * 
	     */
		List<String>arraylist=new ArrayList<>();
		arraylist.add("java");
		arraylist.add("selenium");
		arraylist.add("testing");
		arraylist.add("junit");
		arraylist.add("cucumber");
		arraylist.add("api");
		arraylist.add("sql");
		arraylist.add("database");
		arraylist.add("sdlc");
		System.out.println(arraylist);
		System.out.println(arraylist.subList(2, 7));
		
		Iterator<String>iterator=arraylist.iterator();
		while(iterator.hasNext()) {
		String s=iterator.next();
		if(s.contains("e") || s.contains("t")) {
			iterator.remove();
			
		}}
     System.out.println(arraylist);
	}

}

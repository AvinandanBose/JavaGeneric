package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Iterable;

public class UpperBoundWildCardMeth2 {
	
	public static <T extends List<? extends String>> T test (T t) {
		
		 Iterator<? extends String> it = t.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }

	        Iterable<? extends String> it2 = t;
	        for (String s : it2) {
	            System.out.println(s);
	        }
		
		return t;
	}
	
	 public static void main(String[]args) {
		 List<String> intList = new ArrayList<>();
		 intList.add("My Name");
		 intList.add("is :");
		 intList.add("Avinandan");
		 
		 System.out.println(test(intList));
	 }

}

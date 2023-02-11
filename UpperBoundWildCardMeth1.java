package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;




public class UpperBoundWildCardMeth1{
	
	public static <T extends List<? extends Number>> T test (T t)
	{
		
		
		System.out.println("List elements: " + t);
		
		for (Number n : t) {
            System.out.println(n);
        }
		
		Iterator<? extends Number> it = t.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        } 
        
        Iterable<? extends Number> it2 = t;
        for (Number n : it2) {
            System.out.println(n);
        }
        
        return t;
	   
	}
	
	public static void main(String[]args) {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(10);
		intList.add(11);
		intList.add(12);
		System.out.println(test(intList));
		
	}
	
	
	
	
}
 
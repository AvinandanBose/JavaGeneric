package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UpperBoundWildCardMeth3 {
	public static <T extends Set<? extends Number>> T test (T t) {
		
		System.out.println("List elements: " + t);
		
		for (Number n : t) {
            System.out.println(n);
        }
		
		Iterator<? extends Number> it = t.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Iterable<? extends Number> it2 = t;
        for (Number s : it2) {
            System.out.println(s);
        }
		
		return t;
	}
	
	public static void main(String[]args) {
		
		Set<Integer> s = new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		test(s );
	}
	
}

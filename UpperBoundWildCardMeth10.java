package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UpperBoundWildCardMeth10 {
	
	
	public static void test(Set<? extends Number> num) {

		System.out.println("Set elements: " + num);

		for (Number n : num) {
			System.out.println(n);
		}

		Iterator<? extends Number> it = num.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Iterable<? extends Number> it2 = num;
		for (Number n : it2) {
			System.out.println(n);
		}

	}
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(10);
		set.add(11);
		set.add(12);
		test(set);
	}

}

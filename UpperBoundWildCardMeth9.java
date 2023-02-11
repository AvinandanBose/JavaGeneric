package com.company;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;

public class UpperBoundWildCardMeth9 {

	
	public static List<? extends Number> test(List<? extends Number> num) {

		System.out.println("List elements: " + num);

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

		return num;

	}

	public static void main(String[] args) {
		List<Number> intList = new ArrayList<>();
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

package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Iterable;

public class UpperBoundWildCardMeth8 {

	public static void test(List<? extends Number> num) {

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

	}

	public static void main(String[] args) {
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
		test(intList);
	}
}

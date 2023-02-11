package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.lang.Iterable;

public class UpperBoundWildCardMeth4 {

	public static <T extends Map<? extends String, ? extends Number>> T test(T t) {

		System.out.println("List elements: " + t);

		for (String n : t.keySet()) {
			System.out.println("keys = " + n);
		}

		for (Number n : t.values()) {
			System.out.println("Values = " + n);
		}

		Iterator<? extends String> it = t.keySet().iterator();
		while (it.hasNext()) {
			System.out.println("Keys =" + it.next());
		}

		Iterator<? extends Number> it1 = t.values().iterator();
		while (it1.hasNext()) {
			System.out.println("Values =" + it1.next());
		}

		Iterable<? extends String> it2 = t.keySet();
		for (String num : it2) {
			System.out.println("Values =" + num);
		}

		Iterable<? extends Number> it3 = t.values();
		for (Number num : it3) {
			System.out.println("Values =" + num);
		}

		return t;

	}

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		test(map);
	}
}

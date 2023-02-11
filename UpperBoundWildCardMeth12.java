package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UpperBoundWildCardMeth12 {
	public static void test(Map<? extends String,? extends Number> map) {

		System.out.println("Set elements: " + map);

		for (String key : map.keySet()) {
			System.out.println("Keys ="+ key);
		}
		
		for (Number num : map.values()) {
			System.out.println(num);
		}

		Iterator<? extends String> it = map.keySet().iterator();
		while (it.hasNext()) {
			System.out.println("Keys=" + it.next());
		}

		Iterable<? extends Number> it2 = map.values();
		for (Number n : it2) {
			System.out.println("Values =" +n);
		}
		
		for( Map.Entry<? extends String,? extends Number> entry : map.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

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

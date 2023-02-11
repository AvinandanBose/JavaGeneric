package com.company;

import java.util.Map;


public class WildCardUpperBoundVarMap {
	public static void main(String[]args) {
		Map<String,Integer> map = Map.of("A",1 , "B", 2 , "C", 3 );
		System.out.println(map);
		Boolean c = map.containsKey("A");
		System.out.println(c);
		map.forEach((K,V)-> System.out.println("Values =" + V));

	}
}

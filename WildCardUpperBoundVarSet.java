package com.company;

import java.util.Set;

public class WildCardUpperBoundVarSet {
	public static void main(String[]args) {
		Set<? extends Number> set = Set.of(1,2,3,4,5);
		System.out.println(set);
		Boolean c = set.contains(1);
		System.out.println(c);
		set.forEach(System.out::println);
		set.forEach(s-> System.out.println(s));
	}
}

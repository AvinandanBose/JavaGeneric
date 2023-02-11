package com.company;


import java.util.Arrays;
import java.util.List;


public class WildCardUpperBoundVarList {

	public static void main(String[]args) {
		List<? extends Number> list = Arrays.asList(1,2,3,4,5);
		System.out.println(list);
		Boolean b = list.contains(1);
		System.out.println(b);
		list.forEach(System.out::println);
		list.forEach(s-> System.out.println(s));
		
		
		
	}
}

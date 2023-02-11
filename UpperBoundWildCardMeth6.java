package com.company;


import java.util.HashSet;
import java.util.Set;

public class UpperBoundWildCardMeth6<T extends Set<? extends Number>> {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		UpperBoundWildCardMeth6<HashSet<Integer>> obj = new UpperBoundWildCardMeth6<>();
		obj.add(12, 13);
	}

}

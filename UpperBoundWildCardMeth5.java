package com.company;

import java.util.ArrayList;
import java.util.List;


public class UpperBoundWildCardMeth5<T extends List<? extends Number>> {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		UpperBoundWildCardMeth5<ArrayList<Integer>> obj = new UpperBoundWildCardMeth5<>();
		obj.add(12, 13);
	}

}

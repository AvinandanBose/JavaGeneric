package com.company;

import java.util.HashMap;
import java.util.Map;


public class UpperBoundWildCardMeth7<T extends Map<? extends String, ? extends Number>> {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
public static void main(String[] args) {
		
		UpperBoundWildCardMeth7<HashMap<String,Number>> obj = new UpperBoundWildCardMeth7<>();
		obj.add(12, 13);
	}

}

package com.selenium.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExp {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		

	}

}

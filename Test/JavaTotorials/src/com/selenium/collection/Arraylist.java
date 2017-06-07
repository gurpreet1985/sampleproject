package com.selenium.collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Gurpreet");
		myList.add("Madhu");
		myList.add("Puri");
		myList.add("Kaur");
		myList.add("singh");
		System.out.println("size of array"+myList.size());
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
			
			
		}
		
	}

}

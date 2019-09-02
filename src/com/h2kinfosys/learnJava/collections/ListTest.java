package com.h2kinfosys.learnJava.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		/*
		 * List is indexed collection 
		 * Index 	Element
		 * 0		A
		 * 1		B
		 * 2		C
		 * 3		Z
		 * 4		NewElement
		 */
		// ArrayList - Random Access - Fastest
		// LinkedList - Linked --> Order of insertion
		
		ArrayList<String> arrayList =  new ArrayList<String>();
		arrayList.add("A");
		arrayList.add(1, "B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add(2, "X");
		// getting element with index
		System.out.println(arrayList.get(3));
		// remove wih index
		System.out.println(arrayList.remove(3));
		
		System.out.println("ArrayList :: " + arrayList);

		for( String eachString : arrayList) {
			System.out.println("Element :: " + eachString);
		}
		
		System.out.println(arrayList.size());
		
		List<String> subList = arrayList.subList(1, 4); // Smaller list from Bigger list - very unique List
		System.out.println("SubList :: " + subList);
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("X");
		linkedList.add("Y");
		linkedList.add("Z");
		linkedList.add("W");
		linkedList.add("Z");
		linkedList.add("X");
		System.out.println("LinkedList  " + linkedList);

	}

}

package com.h2kinfosys.learnJava.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		/*
		 * Hash - Fastest
		 * TreeSet - Tree sort 
		 */
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		
		HashSet<String> hashSetTwo = new HashSet<String>();
		hashSetTwo.add("X");
		hashSetTwo.add("Y");
		hashSetTwo.add("Z");
		hashSetTwo.add("C");
		hashSetTwo.add("D");
		
		System.out.println(hashSet.add("E"));
		System.out.println(hashSet.add("A")); // Set always have unique elements 
		System.out.println(hashSet);
		
		if (hashSet.contains("B")) {
			System.out.println("Contains B");
		}
		
		hashSet.retainAll(hashSetTwo);
		System.out.println("hashSet.retainAll(hashSetTwo) " +  hashSet);
		
		hashSet.addAll(hashSetTwo);
		System.out.println("hashSet.addAll(hashSetTwo) " +  hashSet);
		
		hashSet.removeAll(hashSetTwo);
		System.out.println("hashSet.removeAll(hashSetTwo) " +  hashSet);
		
		hashSet.remove("B");
		System.out.println("hashSet.remove(\"B\") " +  hashSet);
		
		for(String eachString : hashSet) {
			System.out.println("Each Item in Set :: " + eachString);
		}
		
		hashSet.clear();
		System.out.println("Clear Function :: " + hashSet);
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>(); // Sorting 
		treeSet.add(12);
		treeSet.add(60);
		treeSet.add(3);
		treeSet.add(45);
		System.out.println("treeSet " + treeSet);
		
	}

}

package com.h2kinfosys.learnJava.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// Map - Key Value
		/*	Key		Value
		 * Unique	Anything
		 * 	A			AAA
		 * 	B			BBB
		 * 	C			CCC
		 * 
		 * put - Key and Value
		 * map.put("D", "DDD")
		 * Key_Value <-- MapEntry 
		 * 
		 * HashMap --> Fastest 
		 * LinkedHashMap --> Order of Insertion
		 */
		LinkedHashMap<Integer, String> zipCodes = new LinkedHashMap<Integer, String>();
		zipCodes.put(30080, "Smyrna");// remember order of insertion
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "AAAAAA");
		hashMap.put(2, "BBBBBB");
		hashMap.put(3, "CCCCCC");
		hashMap.put(4, "DDDD");
		System.out.println("HashMap :: " + hashMap);
		
		hashMap.put(2, "XXX"); // value will be replaced for unique key
		System.out.println("HashMap :: " + hashMap);
		
		hashMap.put(5, "AAA");
		System.out.println("HashMap :: " + hashMap);

		System.out.println("hashMap.get(5) :: " + hashMap.get(5));
		
		hashMap.remove(5);
		System.out.println("hashMap.remove(5) :: " + hashMap);
		
		if(hashMap.containsKey(3)) {
			System.out.println("Map has key :: 3");
		}
		
		if(hashMap.containsValue("DDDD")) {
			System.out.println("Map has Value :: DDDD");
		}
		// Most common way 
		Set<Integer> keySet = hashMap.keySet();
		for(int eachKey : keySet) {
			System.out.println("Key :: " + eachKey + " Value " + hashMap.get(eachKey));
		}
		
		/* Not very common appraoch 
		Collection<String> collection = hashMap.values();
		for(String eachString : collection) {
			System.out.println(eachString);
		} */
		
		System.out.println("hashMap.size()  " + hashMap.size());
		
		// Only few times you gonna use it - 
		Set<Entry<Integer, String>> entrySet =  hashMap.entrySet();
		for(Entry<Integer, String> eachEntry : entrySet) {
			System.out.println(eachEntry);
		}
		hashMap.clear();
		
	}

}

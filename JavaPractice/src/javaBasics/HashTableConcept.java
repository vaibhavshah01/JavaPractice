package javaBasics;

import java.util.Hashtable;

public class HashTableConcept {
	
	// Hashtabel is a dynamic array
	// Hashtable class available in the java.util 
	// we use method h.put(),h.size(),

	public static void main(String[] args) {
		

		Hashtable h = new Hashtable();
		
		h.put('a', "Hello");
		h.put('B', "world");
		
		System.out.println(h.size());// 2
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.size());// 4
		
		System.out.println(h.get(1)); // 100
		
		System.out.println(h.get('a'));// hello
		
		h.put(3, "tom");
	
	// to restrict the data type
	Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
	h1.put(5, 500);
	}
	
	

}

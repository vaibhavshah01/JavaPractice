package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept {
	
	// ArrayList is very dynamic we can add and remove any data types like int, double,char, from the list
	// ArrayList class available in java.util 
	// ArrayList stored in index
	//ArrayList class has methods available: ar.size(); ( to see the size of the array list)
	// ArrayList method ar.get(); ( to get the value from index )
	// we can restrict ArrayList with specific data type as well : ArrayList<Integer> ar1 = new ArrayList<Integer>();

	public static void main(String[] args) {
	
		ArrayList ar = new ArrayList();
		
		ar.add(100); // index 0
		ar.add(200);// index 1
		ar.add(300);// index 2 
		
		System.out.println(ar.size()); // 3
		
		ar.add(400); // index 3
		ar.add(500); // index 4
		
		System.out.println(ar.size());//5
		
		ar.add("Tom");// index 5
		ar.add(12.33);// index 6
		ar.add('V'); // index 7
		
		System.out.println(ar.size());//8
		
		// to remove from the list we use this meth
		ar.remove(7);
		System.out.println(ar.size());//7
		
		// to get the size of arraylist we use ar.size(); method
		System.out.println(ar.size()); //7 
		
		// to get the index value from ArrayList we use ar.get(index no.); 
		System.out.println(ar.get(3)); // 400 
		
		// to print all the values of ArrayList: for loop
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		// we can restrict ArrayList with specific data type as well : ArrayList<Integer> ar1 = new ArrayList<Integer>();

		ArrayList<Integer> ar1 = new ArrayList<Integer>(); // only int value allow
		ar1.add(100);
		
		ArrayList<String> ar2 = new ArrayList<String>(); // only String allow
		ar2.add("Ram");
		

		
		

	}

}

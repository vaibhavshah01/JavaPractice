package javaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		//print 1 to 10
		//1 2 3 4 5 6 7 8 9 10
		// while loop
		int i= 1; // initialization 
		while(i<=10) { // conditional 
			System.out.println(i);
			i=i+1; // incremental/decrement
		}
		System.out.println("************");
		// print 1 to 10
		// for loop 
		// j++ means j=j+1
		for(int j= 1; j<=10; j++) {
			System.out.println(j);
		}
		System.out.println("************");
		 // print 10 to 1
		//10 9 8 7 6 5 4 3 2 1
		for( int k=10; k>=1;k--) {
			System.out.println(k);
		}

	}

}

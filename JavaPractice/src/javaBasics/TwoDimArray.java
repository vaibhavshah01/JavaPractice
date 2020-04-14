package javaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
	
		// 2D array
		String x[][] = new String[3][3];
		
		System.out.println(x.length); // total number of rows 3
		System.out.println(x[0].length);// total number of column 3
		// 1st row
		x[0][0]= "A";
		x[0][1]= "B";
		x[0][2]= "C";
		
		//2nd row
		x[1][0]= "A1";
		x[1][1]= "B1";
		x[1][2]= "C1";
		
		//3rd row
		x[2][0]= "A2";
		x[2][1]= "B2";
		x[2][2]= "C2";
		
		System.out.println(x[0][2]); // C
		
		// print all the values of 2D array :use 2 for loops 
		// row = 0, col o to 4
		
		for(int row=0; row<x.length;row++) {
			for (int col=0; col<x.length;col++){
				System.out.println(x[row][col]);
			}
		}
	}

}

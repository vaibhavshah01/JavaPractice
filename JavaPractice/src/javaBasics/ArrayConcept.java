package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// array : to store similar data type value in a array variable
		
		// disadvantages of Array 
		//1. size is fixed -- static array --to overcome this problem -- we use dynamic array or collections --ArrayList
		//2. stores only similar data types-- to overcome this problem -- we use Object array
		
		//1. int array 
		// lowest bound/index = 0
		// upper bound/index = n-1( n is size of array)
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[1]); // 20
		
		//System.out.println(i[4]); //exception: ArrayOutOfBoundException
		
		System.out.println(i.length);// 4 // size length of array
		
		// print all the values of array : use for loop 
		
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]); // 10 20 30 40 
		}
		//2. double array 
		double d[] = new double[2];
		d[0]= 12.52;
		d[1]= 35.45;
		
		//3. char array
		char c[] = new char[2];
		c[0] = 'a';
		c[1] = '$';
		
		//4. boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		// String Array 
		String s[] = new String[2];
		s[0]= "Hello";
		s[1]= "World";
		
		System.out.println(s.length); // 2
		
		// Object Array ( Object is class)--- is used to store different data types value
		Object ob[] = new Object[6];
		ob[0]= "Tom";
		ob[1]= 33;
		ob[2]= 12.25;
		ob[3]= "1/1/1990";
		ob[4]= 'M';
		ob[5]= "London";
		
		System.out.println(ob[5]); // london 

	}

}

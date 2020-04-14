package javaBasics;

public class StringConcatenations {

	public static void main(String[] args) {
		
		int a =10;
		int b= 20; 
		
		String x = "hello";
		String y = "world";
		 
		System.out.println(a+b); // 30
		
		System.out.println(x+y); // helloworld
		
		System.out.println(a+b+x+y);// 30helloworld
		
		System.out.println(x+y+a+b);//helloworld1020
		
		System.out.println(x+y+(a+b));// helloworld30
		
		System.out.println(a);//10
		
		System.out.println("Value of a is :" + a);// value of a is : 10
		
		System.out.println("value of a and b is : " + (a+b)); // value of a and b is 30
		
		
		
		
		
		
		

	}

}

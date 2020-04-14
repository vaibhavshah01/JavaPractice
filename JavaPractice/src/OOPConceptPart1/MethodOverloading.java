package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum(); // sum method -- zero param
		obj.sum(12.55);
		obj.sum(10);
		obj.sum(5, 5);
		
	}
	public static void main (int i) {// main method overload with different data type
		
	}
	public static void main (int k, int j) {// main method overload with different number of arguments
		
	}
	// main method can be overload as well with different arguments and data types 
	
	// you can not able to create a method inside a method
	
	// duplicate method -- i.e. same method name with same number of arguments are not allowed 
	
	// method overloading -- when method name is same with different data types and different number of arguments within the same class
	
	public void sum() {// 0 input
		System.out.println("SUM method -- Zero param");
	}
	public void sum(int i) {// 1 input
		//System.out.println("SUM method -- one param");
		System.out.println(i);
	}
	public void sum(double d) {// 1 input with different data type
		//System.out.println("SUM method -- one param");
		System.out.println(d);
	}
	public void sum(int l,int m) {// 2 input param
		//System.out.println("SUM method -- two param");
		System.out.println(l*m);
	}
}

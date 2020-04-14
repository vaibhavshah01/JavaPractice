package OOPConceptPart1;

public class Car {
	
	// class variable
	String model;
	int year;

	public static void main(String[] args) {
		
		// new Car(); -- this is a object of a Car class
		// new keyword is used to create an object
		// a = Object reference variable
		
		Car a = new Car();
		
		a.model= "Honda";
		a.year = 2002;
		
		System.out.println(a.model+" "+a.year); // Honda 2002
		
		
		
		

	}

}

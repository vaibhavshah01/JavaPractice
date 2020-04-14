package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	String name = "Tom"; // non static global variable
	static int age = 25; // static global variable
	
	public static void main(String[] args) {
		// how to call static methods and vars?
		
		//1.direct calling
		sum();
		
		//2.calling by className
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);// 25
		System.out.println(StaticAndNonStaticConcept.age); // 25
		
		// how to call non static method and variables
		// we need to create an object of the class
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can i access static methods by using object reference ? yes
		obj.sum(); // warning will be given
	}
	
	public void sendMail() {// non static method
		System.out.println(" send mail method");
		}
	public static void sum() { // static method
		System.out.println("sum method");
	}

}

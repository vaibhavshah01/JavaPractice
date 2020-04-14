package OOPConceptPart1;

public class LocalVsGlobalVariables {
	
	// global variable -- class variable
	String name = "Tom";
	int age = 25;
	
	public static void main(String[] args) {
		
	 int i = 10;// local variable for main method
	 System.out.println(i); // 10
	 
	 
	 LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
	 System.out.println(obj.name); // Tom
	 System.out.println(obj.sum()); //35

	}
	public int sum() {
		int i= 15; // local variable for sum method
		int j= 20;
		int k = i+j;
		
		return k;
	}
}

package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test(); // test method
		
		int l = obj.pqr();// pqr method
		System.out.println(l); // 30
		
		String s1=obj.qa();// qa method
		System.out.println(s1);//selenium

		int div = obj.divison(30, 10);// division method
		System.out.println(div); // 3
		
	}
	// non static methods
	
	// void = does not return any value
	
	// return type = void
		public void test() {// no input, no output
		System.out.println("test method");
		}

	// return type = int 
		public int pqr() {//no input, some output
			System.out.println("pqr method");
			int a = 10;
			int b = 20;
			int c = a+b;
			
			return c;
		}
	
	// return type = String
		public String qa() {// no input , some output
			System.out.println("qa method");
			String s = "selenium";
			
			return s;
		}

	// return type = int
	// x,y input parameters/ arguments
		public int divison(int x,int y) {
			System.out.println("divison method");
			int d=x/y;
			
			return d;
		}
		 
		
}

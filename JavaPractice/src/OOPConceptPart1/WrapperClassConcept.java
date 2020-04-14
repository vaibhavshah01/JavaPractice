package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x= "100";
		System.out.println(x+20);// 10020
		
		// data conversion : String to int 
		int i=Integer.parseInt(x);
		System.out.println(i+20); // 120
		
		//wrapper classes : Integer, Double , Boolean , Character
		// we use method like : Integer.parseInt();
		// from int to String :  String.valueOf() method
		
		//String to double conversion
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d); //12.33
		
		// String to boolean
		String k ="true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);// true
	
		// int to String
		int j = 200;
		System.out.println(j+20);// 220
		
		String s=String.valueOf(j);
		System.out.println(s+20);// 20020
		
		// Number of format exception
		String u = "100A";
		int q=Integer.parseInt(u);
		System.out.println(q);// NumberFormatException --- for input String: "100A"
	}

}

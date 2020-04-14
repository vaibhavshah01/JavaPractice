package OOPConceptPart2;

public interface USBank {
	
	// properties of interface 
	// only method declaration
	// no method body - only method prototype
	// In Interface we can declare the variable by default - static final 
	// so variable value can not be changed
	// no static method in Interface
	// no main method in Interface
	// we can not create the object of Interface
	// Interface abstract in nature
	
	int min_bal= 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	

}

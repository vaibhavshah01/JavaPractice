package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank { // we are achieving multiple inheritance
	
	// if a class is implementing any interface, then its mandatory to define/override all the methods of Interface.
	// Overriding from USBank method
	public void credit() {
		System.out.println("hsbc--credit");
	}
	public void debit() {
		System.out.println("hsbc--debit");
	}
	public void transferMoney() {
		System.out.println("hsbc--transferMoney");
	}
	//Separate method of HSBC Bank class
	
	public void educationLoan() {
		System.out.println("hsbc--edu loan");
	}
	public void carLoan() {
		System.out.println("hsbc--car loan");
	}
	//Overriding from Brazil Bank Method
	public void mutualFund() {
		System.out.println("hsbc--mutual fund");
	}



}

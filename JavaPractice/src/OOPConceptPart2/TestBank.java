package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal); // 100
		
		HSBCBank hs = new HSBCBank();
		hs.credit(); // hsbc--credit
		hs.debit();//hsbc--debit
		hs.transferMoney();//hsbc--transferMoney
		hs.carLoan();//hsbc--car loan
		hs.educationLoan();// hsbc-- edu loan
		
		// dynamic polymorphism 
		// child class object can be referred by parent Interface reference variable
		USBank b = new HSBCBank();
		b.credit();// hsbc--credit
		b.debit();// hsbc--debit
		b.transferMoney();//hsbc-- transferMoney
		

	}

}

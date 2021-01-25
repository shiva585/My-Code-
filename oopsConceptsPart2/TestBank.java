package oopsConceptsPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.loan();
		hs.transerMoney();
		
			
		//dynamic polymorphism
		//child class object can be referred by interface reference variables
		USBank bk=new HSBCBank();
		bk.credit();
		bk.debit();
		bk.transerMoney();
		



}

	}
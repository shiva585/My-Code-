package oopsConceptsPart2;

public class HSBCBank implements USBank, BrazilBank //we are achieving multiple inheritance
{
	//Is- a relationship
	//class is implementing any interface, then its mandatory to define/override all the methods
	//overriding from USbank
	public void  credit() {
		System.out.println("hsbc--credit");
	}


	public void debit() {
		System.out.println("hsbc -- debit");
		
	}

	
	public void transerMoney() {
		System.out.println("hsbc -- trnsfermoney");
		
	}

	//separate methods
	public void loan() {
		System.out.println("hsbc--loan");
	}



	//brazil bank method
	public void mutualfund() {
		System.out.println("hsbc--mutual fund");
		
	}
}

package java_Basics;

public class FinallyConcept {

	public static void main(String[] args) {
		
		test1();
		div();


	}

	public static void test1() {
		try {
			System.out.println("inside test method");
			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("inside catch block");
		}
		
		//finally block always executed
		finally //Block
		{
			System.out.println("inside finally block");
			
		}
	}
	
	public static void div() {
		int i=10;
		try {
			System.out.println("inside try block");
			int k=i/0;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("execute this code even after any exception");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

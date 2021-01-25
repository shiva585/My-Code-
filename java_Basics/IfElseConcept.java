package java_Basics;

public class IfElseConcept {

	public static void main(String[] args) {

		//comparisons
		// < > <= >= == !=
		int a=10;  
		int b=3;
		
		if (a>b) 
		{
			System.out.println("true");
			
		} else 
		{
			System.out.println("false");

		}
		int c=12;
		int d=12;
		
		if (c==d) 
		{
			System.out.println("true");
			
		} else 
		{
			System.out.println("false");

		}
		// write a logic for highest num
		int a1=10;
		int a2=44;
		int a3=233;
		
		//nested if - else
		if (a1>a2 & a1>a3) // false & false = false; true & false= false
		{
			System.out.println("a1 is greatest");
			
		} else if(a2>a3)
		{
			System.out.println("b1 is greatest");

		} else {
			System.out.println("a3 is greatest");
		}


	}

}

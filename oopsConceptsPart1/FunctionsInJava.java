package oopsConceptsPart1;

public class FunctionsInJava {
 
	public static void main(String[] args) 
	{
		FunctionsInJava obj=new FunctionsInJava();
		int l= obj.abc();
		System.out.println(l);
		String s1=obj.az();
		System.out.println(s1);
		obj.test();
		int i=obj.divison(40, 10);
		System.out.println(i);
		
		
		
	}
	// non static methods
		// void -- does not return any value
	    //return type = void // no input ,no output
		public void test() 
		{
			System.out.println("test method");
		}
		
		//return type =int  //no input, some output
		public int abc() {
			System.out.println("abc method");
			int a=10;
			int b=20;
			int c=a+b;
			
			return c;
			
			
		}
		public String az() // no input ,some output
		{
		System.out.println("az method");	
		String s="selenium";
		return s;
		}
		
		//x,y -- input parameters/arguments
		public int divison(int x,int y)
		{
			System.out.println("divison method");
			int d=x/y;
			
			return d;
		}
		
		

}

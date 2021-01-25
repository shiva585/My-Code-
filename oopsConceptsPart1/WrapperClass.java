package oopsConceptsPart1;

public class WrapperClass {

	public static void main(String[] args) 
	{
		
		String x="100";
		
		System.out.println(x+20);
		
		//data conversion :string to int
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		//integer , double, character, boolean
		//string to double conversion:
		String y="12.23";
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		//string to boolean
		String k="true";
	   boolean b= Boolean.parseBoolean(k);
	    System.out.println(b);
		
		//int to string conversion
	    int a=200;
	    System.out.println(a+20);
	    String s=String.valueOf(a);
	    System.out.println(s+20);
	    
	    //double to string
	    double g=12.34;
	    System.out.println(g+100);
	    String s1=String.valueOf(g);
	    System.out.println(s1+100);
	    
	    String s2="100ab"; // exception found b'coz it's not appear value
	    
	    Integer.parseInt(s2);
	    //NumberFormatException ***************
	   
	  
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
	}

}

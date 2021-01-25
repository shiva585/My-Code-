package oopsConceptsPart1;

public class StaticAndNonStatic {

	//global var : the scope of the global vars will be across the all the functions with all some conditions
	String name="shiva";   //non static global var
	static int age=23;    // static global var
	public static void main(String[] args) 
	{
		//how to call static methods and var
		//1.direct calling
		sum();
		//2.calling by classname
		StaticAndNonStatic.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		//how to call non-static methods and var
		StaticAndNonStatic obj=new StaticAndNonStatic();
		obj.sendMail();
		System.out.println(obj.name);
		
		String st=obj.name;
		System.out.println(st);
		
		//can i access static methods by using object reference? --yes
		obj.sum();  //warning will be given

	}
	
	public void sendMail() {   //non static method
		System.out.println("send mail method");
	}
	public static void sum() {   //static method
		System.out.println("sum method");
	}

}

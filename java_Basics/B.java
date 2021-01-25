package java_Basics;

public class B extends A
{
	public B() {
		super();    //its should be the first statement
		System.out.println("child class constructor");
	}
	public B(int i) {
		super(i);    //its should be the first statement
//		System.out.println("child class constructor");
	}
	public B(int i,int j) {
		super(i,j);    //its should be the first statement
//		System.out.println("child class constructor");
	}

	
	public static void main(String[] args)
    {
		B obj=new B();
		B obj1=new B(10);
		B obj2=new B(10,20);
		
		
		
		
		
		
		
		}
	



}

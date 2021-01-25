package java_Basics;

public class ConstructorConcepts 
{
	public ConstructorConcepts() {                  
		
		System.out.println("default constructor ");
	}
	public ConstructorConcepts(int i) {
		System.out.println("single para constructor");
		System.out.println("the value of i"+i);
	}
	public ConstructorConcepts(int i,int j) {
		System.out.println("two para constructor");
		System.out.println("the value of i"+i);
		System.out.println("the value of i"+j);
	}

	//can we overload a constructor  -- yes 
	
	public static void main(String[] args) 
	{
		ConstructorConcepts obj=new ConstructorConcepts();
		ConstructorConcepts obj1=new ConstructorConcepts(10);
		ConstructorConcepts obj2=new ConstructorConcepts(25,12);
	}
	
}

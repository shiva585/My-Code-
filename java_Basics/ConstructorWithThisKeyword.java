package java_Basics;

public class ConstructorWithThisKeyword {

	//class vars 
	//whenever you want to initialize  global/class variable with the current value of constructor in that case we have to use this() keyword 
	String name;
	int age;

		public ConstructorWithThisKeyword(String name,int age) 
		{
			this.name=name;
			this.age=age;
			System.out.println(name);
 			System.out.println(age);
			
			
			
		}

		
		
		public static void main(String[] args) {
ConstructorWithThisKeyword obj=new ConstructorWithThisKeyword("shiva", 23);

			
			
	}

}

package oopsConceptsPart1;

public class MethodOverLoading {

	public static void main(String[] args) {

		MethodOverLoading obj=new MethodOverLoading();
		obj.sum();
		obj.sum(1);
		obj.sum(2, 4);
		obj.sum(12.23);


	}
	
	//main method can be overload
	//duplicates methods --i.e. some method name with same no of arguments are not allowed
	//you cannot create a method inside a method
	//Same name with different parameters within the same class
	public void sum() {  //0 input param
		System.out.println("sum method -- zero parameter");
	}
	public void sum(double d) {  //0 input param
		System.out.println("sum method ");
		System.out.println(d);
	}
	public void sum(int i) {  //1 input param
		System.out.println("sum method");
		System.out.println(i);
	}
	public void sum(int i,int k) {  //2 input param
		System.out.println("sum method");
		System.out.println(i+k);
		
   }

	
	
	
	
	
	
	
	
	
}
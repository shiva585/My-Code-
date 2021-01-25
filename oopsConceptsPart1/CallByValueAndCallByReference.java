package oopsConceptsPart1;

public class CallByValueAndCallByReference {

	int p;
	int q;
	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj=new CallByValueAndCallByReference();
		int x=10;
		int y=23;
		
		obj.testsum(x, y); //call by value/pass by value
		
		obj.p=12;     
		obj.q=34;
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
	//call by value
	public int testsum(int a,int b) {
		int c=a+b; 
		return c;
	}
	
	public void swap(CallByValueAndCallByReference t)
	{
		 int temp;
		 temp=t.p; //temp = 12
		 t.p=t.q;  // t.p =34
		 t.q=temp; // t.q =12
		 
	           
		                         
	            
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

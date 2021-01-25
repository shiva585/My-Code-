package java_Basics;

public class LoopsConcepts {

	public static void main(String[] args) {
		
		//1.while loop -
		int i=1;  //initialization
		while (i<=10) //conditional part
		{
			System.out.println(i);
			i=i+1;//incre or decre //without increment or decre it gives infinite i values these are the drawback
		}
		System.out.println("*****************************");
		
		//2.for loop
		//j++ equals to j=j+1
		for (int j = 1; j <=10; j++) //init ,conditional ,incremental
		{
			System.out.println(j);
			
		}
		System.out.println("*****************************");
		//k-- means k=k-1
		for (int k = 10; k>=1; k--) 
		{
			System.out.println(k);
			
		}
		

	}

}

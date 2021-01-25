package java_Basics;

public class Array {

	public static void main(String[] args) {

		//Array is store similar data types values in a array variable
		// these are one dimensioanl arrays
		// dis - array : 
		//1. size is fixed -- static array -- to  overcome of this problem -- we use collections-Arraylist, hashtable ,--use dynamic arrays
		//2. stores only similar data types -- to overcome of this problem -- we use object array
		
		//1.int array
				//lowest bound/index =0
				//upper bound/index = n-1 (n is size of array)
		int i[]=new int [4];
		i[0]=10;
		i[1]=23;
		i[2]=34;
		i[3]=55;

		System.out.println(i[2]); 
//		System.out.println(i[4]); //ArrayIndexOutOfBoundsException *****

		System.out.println(i.length); // size/length of array
		
		//print all arrays :use for loop
		for (int j = 0; j < i.length; j++)
		{
			System.out.println(i[j]);
			
		}
		System.out.println("****************************");
		
		//2.double array ;
		double d[]= new double[5];
		d[0]=12.11;
		d[1]=4.34;
		d[2]=34.21;
		d[3]=55.43;
		d[4]=11.00;
		
		System.out.println(d[2]); //like this
		System.out.println("****************************");
	//3.Object array : object is class--is used to store diff data types values
	Object obj[]=new Object[5];
	obj[0]="shiva";
	obj[1]=23;
	obj[2]=12.233;
	obj[3]="1/4/1998";
	obj[4]='M';

	System.out.println(obj[0]);
	System.out.println(obj.length);
	for (int k = 0; k < obj.length; k++) 
	{
		System.out.println(obj[k]);
		
	}

}

}


















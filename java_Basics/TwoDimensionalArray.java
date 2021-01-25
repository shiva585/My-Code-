package java_Basics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//[] --it's one Dimensional Array,,, [][]--TwoDimensional Array
		String x[][] = new String[3][5];
		System.out.println(x.length); //3 it gives total no of rows= 3
		System.out.println(x[0].length); //5 total no of cols=5
		
		//1row
		x[0][0]="B";
		x[0][1]="I";
		x[0][2]="N";
		x[0][3]="G";
		x[0][4]="O";
		
		//2row
		x[1][0]="8";
		x[1][1]="20";
		x[1][2]="39";
		x[1][3]="48";
		x[1][4]="67";
		
		//3row
		x[2][0]="2";
		x[2][1]="1";
		x[2][2]="4";
		x[2][3]="5";
		x[2][4]="6";
		
		System.out.println(x[1][3]);
		System.out.println(x[0][0]);
		
		//print all values of 2d array
		//row=0,col =0 to 3
		//row =1,col =0 to 3
		//row =2,col =0 to 3
		for(int row=0;row<x.length;row++) 
		{
			for (int col = 0; col < x[0].length; col++) 
			{
				System.out.println(x[row][col]);
				
			}
		}
		
		
	}

}












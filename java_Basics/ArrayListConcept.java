package java_Basics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {


		ArrayList ar=new ArrayList();
		ar.add("shiva");  //0
		ar.add("kumar");  //1
		ar.add("maragoni");//2
		ar.add("ktpl");//3
		ar.add(25);//4
		ar.add(12.301);//5
		System.out.println(ar.size());
		
		ar.remove(4);
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		
		//to print all arraylist :for loop
		
		for (int i = 0; i < ar.size(); i++) 
		{
			System.out.println(ar.get(i));
			
		}

		
	}

	ArrayList<Integer> a1=new ArrayList<>();
	ArrayList<String> a2=new ArrayList<>();
	
}

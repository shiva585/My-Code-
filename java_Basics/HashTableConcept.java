package java_Basics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h=new Hashtable();
		
		h.put("A", "Hello");
		h.put("B", "Testing");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		
		System.out.println(h.get(1));
		System.out.println(h.get("A")); 
		
		Hashtable<Integer, Integer> h1=new Hashtable<Integer,Integer>();

		h1.put(1, 1000);
		
		Hashtable<Integer, String> h2=new Hashtable<Integer,String>();
		
		h2.put(1, "shiva");
		
	}

}

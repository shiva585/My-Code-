package java_Basics;

public class FinalizeConcept {

	public static void main(String[] args) {

		FinalizeConcept f1=new FinalizeConcept();
		FinalizeConcept f2=new FinalizeConcept();

		f1=null;
		f2=null;
		
		System.gc();
		

	}
	public void finalize() { //its a method
		System.out.println("finalize method");
	}

}

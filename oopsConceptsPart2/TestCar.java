package oopsConceptsPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism-- compile-time polymorphism
		BMW_car b=new BMW_car();
		b.stop();
		b.antitheft();
		b.start();
		b.refuel();
		b.engine();
		
		System.out.println("***************");
		
		Car c=new Car();
		c.start();
		c.stop();
		
		System.out.println("***************");
		
		//Top casting
		Car c1=new BMW_car(); //child class object can be referred by parent class reference variable--dynamic polymorphism-->run time polymorphism
		c1.start();    //we cannot create antitheft method bcoz it not common method its run only static polymorphism
		
		//Down Casting
		BMW_car b1=(BMW_car) new Car(); //ClassCastException 
		
		
		
		
		
		
		
		
	}

}

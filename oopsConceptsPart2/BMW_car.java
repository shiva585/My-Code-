package oopsConceptsPart2;

public class BMW_car extends  Car //has-a relationship
{
	//when same method is present class as well as in child class with the same name and same no of arguments
	//is called method overriding
	public void start() {
		System.out.println("BMW--start");
	}
	public void refuel() {
		System.out.println("BMW--refuel");
	}

	public void antitheft() {
		System.out.println("BMW--antitheft");
	}
}

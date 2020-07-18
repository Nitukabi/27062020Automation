package functions;

public class Car {

	String colour;
	int capacity;

	public void features() {
		System.out.println("Car features are . Color= " + colour + " and capacity= " + capacity);
	}
	public Car(String colour,int capacity)
	{
		//global instance variable  //local variable
		this.colour     =                 colour;
		this.capacity  =               capacity;
	}
	public Car()
	{
	}
	
}

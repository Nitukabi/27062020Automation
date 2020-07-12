package functions;

public class CarUser {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.colour = "Red";
		c1.capacity = 6;
		c1.features();

		Car c2 = new Car();
		c2.colour = "white";
		c2.capacity = 5;
		c2.features();

		Car c3 = new Car();
		c3.colour = "Black";
		c3.capacity = 7;
		c3.features();
		
		Car c4=new Car("Violet",5);
		c4.features();
	}
}

package functions;

public class Callvariables {

	public static void main(String[] args) {
		
		Variables obj = new Variables();
		
		//change the values
		obj.name= "ajinkya";

		
		// create a new object
		Variables ref = new Variables();
		
		//call the variables again
		System.out.println(ref.name);
		System.out.println(obj.name);
		
		
		
		
		
		

	}

}

package ifElseStatements;

public class IfElseClass3NestedIfStatements {

	public static void main(String[] args) {
		

		int a=10;
		int b=21;
		int c=30;

		if(a >= b) {
	            if(a >= c)
	                System.out.println("a is the largest number.");
	            else
	                System.out.println(" c is the largest number.");
	        } else {
	            if(b >= c)
	                System.out.println(" b is the largest number.");
	            else
	                System.out.println (" c is the largest number.");
	        }
		}
	}



package variablesAndDataTypes;

public class Assignment1 {

	public static void main(String[] args) {
	
		int a=10;
		int b=20;
		
		System.out.println("before swap");
		System.out.println(a);
		System.out.println(b);

		int temp=a;
		a= b;
		b= temp;
		System.out.println("after swap");
		System.out.println(a);
		System.out.println(b);

	}

}

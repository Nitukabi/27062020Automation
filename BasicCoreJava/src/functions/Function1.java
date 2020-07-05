package functions;

public class Function1 {
	public static String name= "anand";

	public static void main(String[] args) {
        //calling a function
		sum();
		
		System.out.println(name);
	}
    //access modifier  //nature of method   //return type      //method name    //parameters
	public             static               void               sum               (    ) {
		int a = 10;
		int b = 20;
		System.out.println(a + b);

		int c = 30;
		System.out.println(b + c);
		int d = 40;
		int e = 50;
		System.out.println(d + e);
	}
}

package functions;

public class Function2 {

	public static void main(String[] args) {
		 sum(10,20);
		 sum(20,30);
		 sum(30,40);
		 sum(10,20,30);
		 message("anand");
		 eligibility("nitu",32);
		 eligibility("priya",17);
		 

	}
	public static void sum (int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void sum(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void message(String name) {
		System.out.println("welcome "+ name);
		
	}
	public static void eligibility(String name, int age)
	{
		if (age>18)
		{System.out.println("you are eligible " + name);}
		else 
			System.out.println("you are not eligible "+ name);
		
		}
	 
	}
		


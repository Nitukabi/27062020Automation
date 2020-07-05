package functions;

public class ReturnType {

	public static void main(String[] args) {
		int add = sum(10,20);
		boolean c= eligible(10);
		boolean c1= eligible(20);
		
		System.out.println(add);
		System.out.println(c);
		if (c)
			{System.out.println("you are eligible ");}
			else 
				{System.out.println("you are not eligible ");}
		if (c1)
		{System.out.println("you are eligible ");}
		else 
			{System.out.println("you are not eligible ");}
	

	}
	public static int sum(int a,int b)
	{
		return a+b;
	}
	
   public static boolean eligible(int age)
   {
	   if (age>=18)
	   { return true;}
	   else 
	   { return false ;}
	   
   }
}

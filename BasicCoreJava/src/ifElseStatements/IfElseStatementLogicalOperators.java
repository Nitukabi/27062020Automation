package ifElseStatements;

public class IfElseStatementLogicalOperators {

	public static void main(String[] args) {
		
		int age= 27;
		boolean voterID= true;
		// AND operator
		if (age>=18 && voterID)
		{
			System.out.println("you are eligible");
		}
		else
		{
			System.out.println("you are not eligible");
		}
		
		// Or operator
		boolean panCard= true;
		boolean adharCard= true;
		
     if (panCard || adharCard)
     {	System.out.println("you are eligible");}
     else
     {	System.out.println("you are not eligible");}
	}

}

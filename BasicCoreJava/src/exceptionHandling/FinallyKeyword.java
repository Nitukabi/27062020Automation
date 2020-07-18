package exceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {
	
		try {
			System.out.println("open the database connection");
			//System.out.println(10/0);
			System.out.println("Akhlesh");
			// System.out.println("Close the connection");
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
			// System.out.println("Close the connection");
		}finally
		{
			System.out.println("Close the connection");
		}

	}

}

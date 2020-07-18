package exceptionHandling;

public class TryCatchBlock {
	public static Functions fun;

	public static void main(String[] args) {

		// Step 1: Verify about link is present
		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("Exception error " + e.getMessage());
		}

		// Step 2: verify Projects link is present
		try {
			String[] str = new String[2];
			str[2] = "nitu";
		} catch (Exception e) {
			System.out.println("Exception error " + e.getMessage());
		}

		// Step 3: Verify Projects link is present
		try {
			fun.fun1();
		} catch (Exception e) {
			System.out.println("Exception error " + e.getMessage());
		}

	}

}

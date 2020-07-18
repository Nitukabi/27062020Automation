package exceptionHandling;

public class TryCatchBlock2 {

	public static Functions fun;

	public static void main(String[] args) {

		// Step 1: Click download link
		try {
			int a = 10;
			int b = 2;
			System.out.println(a / b);

			// Step 2: click on latest Stable version

			String[] str = new String[2];
			str[2] = "nitu";

			// Step 3: Verify something

			fun.fun1();

		} catch (ArithmeticException e) {
			System.out.println(" Arithmetic Exception occurred " + e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception occurred " + e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println("NullPointer Exception occurred " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Unknown Exception occurred " + e.getMessage());
		}
	}
}
package array;

public class Assignment6 {

	public static void main(String[] args) {

		// FRUITS NAME and price display
		String[] name = { "apple", "banana", "berry", "grapes", "kiwi", "mango" };
		double[] price = { 100.99, 40.20, 79, 65.90, 78.9, 190.50 };

		for (int i = 0; i <= 5; i++) {

			System.out.println(name[i] + "	" + price[i]);

		}

		// 10*5 array display
		int arr[][] = { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
				{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 } };
		// printing the array
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}

package array;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		String[][] data = new String[7][10];

		
		  data[0][0] = "1"; data[0][1] = "2";
		 
		 data[1][0] = "user2"; data[1][1] = "password2";
		
		data[2][0] = "user3"; data[2][1] = "password3";
		 
		  data[3][0] = "user4"; data[3][1] = "password4";
		 
		

		for (int r = 0; r < data.length; r++) {
			for (int c = 0; c < data[r].length; c++) {
				System.out.print(data[r][c] + "   ");
			}
			System.out.println();
		}

	}

}

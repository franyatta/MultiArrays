// initializes arrays with random numbers
public class InitializeArrayRandom {

	public static void main(String[] args) {
		int[][] matrix = new int[10][10];

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 100);
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
		sum(matrix);
		sumColumns(matrix);
		largestRow(matrix);
		randomShuffle(matrix);
	}
	public static void sum(int matrix[][]) { // sums all the entries
		int total = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				total += matrix[row][column];
			}
		}
		System.out.println("The sum is: " + total);
	}
	public static void sumColumns(int matrix[][]) { // summing elements by
													// column
		for (int column = 0; column < matrix[0].length; column++) {
			int total = 0;
			for (int row = 0; row < matrix.length; row++) {
				total += matrix[row][column];
			}
			System.out.println("Sum for column " + column + " is " + total);
		}
	}
	public static void largestRow(int matrix[][]) { // shows the row with the
													// largest sum
		int maxRow = 0;
		int indexOfMaxRow = 0;
		// get the sum of the first row in maxRow
		for (int column = 0; column < matrix[0].length; column++) {
			maxRow += matrix[0][column];
		}
		for (int row = 1; row < matrix.length; row++) {
			int totalOfThisRow = 0;
			for (int column = 0; column < matrix[row].length; column++) {
				totalOfThisRow += matrix[row][column];
				if (totalOfThisRow > maxRow) {
					maxRow = totalOfThisRow;
					indexOfMaxRow = row;
				}
			}
		}
		System.out.println(
				"Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
	}
	public static void randomShuffle(int matrix[][]) {
		
		System.out.println("\nRandomly shuffled matrix: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int i1 = (int) (Math.random() * matrix.length);
				int j1 = (int) (Math.random() * matrix[i].length);

				// swap matrix[i][j] with matrix[i1][j1]
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i1][j1];
				matrix[i1][j1] = temp;
				
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
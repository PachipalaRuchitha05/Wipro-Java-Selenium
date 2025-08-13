package interface_Ex;

public class MatrixAddition {
	
	public void matrix() {
		
		int rows = 2;
		int columns = 3;
		
		int[][] firstMatrixs = {{4, 1, 6}, {1, 3, 9}};
		int[][] secondMatrix = {{3, 5, 2}, {2, 3, 4}};
		int[][] add = new int[rows][columns];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				add[i][j] = firstMatrixs[i][j] + secondMatrix[i][j];
			}
		}
		
		for (int[] row : add) {
			for (int column : row) {
				System.out.print(column + "   ");  
			}
			System.out.println();  
		}
	}
	
	public static void main(String[] args) {
		MatrixAddition matrixAddition = new MatrixAddition();
		matrixAddition.matrix();
	}
}

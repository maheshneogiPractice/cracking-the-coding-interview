package array_and_strings;

import java.util.*;

public class Ex_7_Rotate_Matrix {

	static int[][] rotateMatrix(int[][] matrix) {
		int n = matrix.length;

		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - first;

			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i];

				// left -> top
				matrix[first][i] = matrix[last - offset][first];

				// bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];

				// top -> right
				matrix[i][last] = top;
			}
		}

		return matrix;
	}

	public static void main(String[] args) {
		System.out.println("enter number of rows \n");
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		System.out.println("enter number of cols \n");
		int col = scanner.nextInt();
		if (row == col && row>0) {
			int[][] matrix = new int[row][col];
			System.out.println("enter matrix elements \n");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					matrix[i][j] = scanner.nextInt();
				}
			}
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(matrix[i][j]);
					System.out.print(" ");

				}
				System.out.print("\n");
			}
			System.out.println("Rotated matrix is ");
			matrix = rotateMatrix(matrix);

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(matrix[i][j]);
					System.out.print(" ");

				}
				System.out.print("\n");
			}
		} else
			System.out.println("num of rows n cols should be same");

	}

}

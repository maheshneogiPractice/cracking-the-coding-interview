package array_and_strings;

import java.util.Scanner;

public class Ex_8_Zero_Matrix {

	static int[][] setZeroMatrix(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];
		
		for(int i=0; i<matrix.length;i++)
			for(int j=0; j<matrix[0].length; j++)
			{
				if(matrix[i][j]==0)
				{
					row[i] = true;
					col[j] = true;
				}
			}
		
		for(int i=0; i<row.length;i++)
		{
			if(row[i])
				matrix = nullifyRow(matrix, i);
		}
		for(int i=0; i<col.length; i++)
		{
			if(col[i])
				matrix = nullifyCol(matrix, i);
		}
		
		
		
		return matrix;
	}
	
	static int[][] nullifyRow(int[][] matrix, int row)
	{
		for(int i=0;i<matrix[0].length;i++)
			matrix[row][i]=0;
		return matrix;
	}
	
	static int[][] nullifyCol(int[][] matrix, int col)
	{
		for(int i=0;i<matrix.length;i++)
			matrix[i][col]=0;
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
			matrix = setZeroMatrix(matrix);

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

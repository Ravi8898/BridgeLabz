/* *****************************************************************************
 *  Purpose: To Find whether given matrix is a MAGIC MATRIX!!!! or NOT.
 *
 *  @author  Sunny Maurya and Ravi maurya
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.*;

public class MagicMatrix {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value of n for n*n matrix");
		int n = scanner.nextInt();

		int[][] matrix1 = new int[n][n];
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				System.out.println("Enter the element of " + i + " row " + j + "coloumn: ");
				matrix1[i][j] = scanner.nextInt();
			}
		}

		int leftDiagonal = 0, rightDiagonal = 0, row = 0, col = 0;
		int[] sumRow = new int[n];
		int[] sumCol = new int[n];

		for (int i = 0; i < n; i++) {
			row = 0;
			col = 0;
			for (int j = 0; j < n; j++) {

				row = row + matrix1[i][j];

				sumRow[i] = row;
				col = col + matrix1[j][i];

				sumCol[i] = col;
			}
			leftDiagonal = leftDiagonal + matrix1[i][i];

			rightDiagonal = rightDiagonal + matrix1[i][(n - 1) - i];
		}
		int count = 0;
		for (int i = 0; i < (n - 1); i++)

			if ((sumRow[i] == sumCol[i]) && (sumRow[i] == sumRow[i + 1]) && (sumCol[i] == sumCol[i + 1])
					&& (leftDiagonal == rightDiagonal) && (sumRow[i] == leftDiagonal) && (sumCol[i] == leftDiagonal)
					&& (sumRow[i] == rightDiagonal) && (sumCol[i] == rightDiagonal))

				count++;

		if (count == (n - 1))

			System.out.println("Given Matrix is MAGIC MATRIX");

		else
			System.out.println("Given Matrix is NOT a Magic Matrix");

		scanner.close();
	}

}

package Arrays.Matrix;

import java.util.Arrays;

// https://leetcode.com/problems/spiral-matrix-ii/

/*
    59. Spiral Matrix II
    Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

    Input: n = 3
    Output: [[1,2,3],[8,9,4],[7,6,5]]
*/

public class MatrixII {
    public static void main(String[] args) {
        int n = 3;

        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }

    public static int[][] generateMatrix(int n) {
        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = n - 1;

        int[][] matrix = new int[n][n];
        int count = 1;

        while(startRow <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j <= endCol; j++) {
                matrix[startRow][j] = count;
                count++;
            }

            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                matrix[i][endCol] = count;
                count++;
            }

            // Bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow)
                    break;

                matrix[endRow][j] = count;
                count++;
            }

            // Left
            for (int i = endRow - 1; i >= startCol + 1; i--) {
                if (startCol == endCol)
                    break;

                matrix[i][startCol] = count;
                count++;
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return matrix;
    }
}

package Arrays.Matrix;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/

/*
    54. Spiral Matrix
    Given an m x n matrix, return all elements of the matrix in spiral order.

    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [1,2,3,6,9,8,7,4,5]
*/

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                };

        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        List<Integer> l = new ArrayList<>();

        while(startRow <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j <= endCol; j++)
                l.add(matrix[startRow][j]);

            // Right
            for (int i = startRow + 1; i <= endRow; i++)
                l.add(matrix[i][endCol]);

            // Bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow)
                    break;

                l.add(matrix[endRow][j]);
            }

            // Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol)
                    break;

                l.add(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return l;
    }
}

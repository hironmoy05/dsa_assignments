package Array2D;

import java.util.Arrays;

public class SearchInMatrix {
    public static void main(String[] args) {
        // Matrix is sorted in row wise and column wise manner
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(searchInMatrix2(matrix, 29)));
    }

    // Matrix is sorted in row wise and column wise manner
    static int[] searchInMatrix2(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            // case 1
            if (matrix[r][c] == target)
                return new int[]{r, c};

            // case 2
            if (matrix[r][c] < target)
                r++;
            else
                c--;
        }

        return new int[]{-1, -1};
    }
}

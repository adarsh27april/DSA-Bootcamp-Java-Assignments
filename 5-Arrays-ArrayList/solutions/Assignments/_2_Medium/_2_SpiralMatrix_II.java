package Assignments._2_Medium;

import java.util.Arrays;

public class _2_SpiralMatrix_II {
    public static void main(String[] args) {
        Solution2 ob = new Solution2();
        ob.generateMatrix(3);
    }
}

class Solution2 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < (n - i); j++) {
                matrix[i][j] = k++;
            }

            for (int j = (i + 1); j < (n - i); j++) {
                matrix[j][n - i - 1] = k++;
            }

            for (int j = (n - i - 2); j >= i; j--) {
                matrix[n - i - 1][j] = k++;
            }

            for (int j = (n - i - 2); j >= i + 1; j--) {
                matrix[j][i] = k++;
            }
        }

        for (int[] is : matrix) {
            System.out.println(Arrays.toString(is));
        }
        return matrix;
    }
}

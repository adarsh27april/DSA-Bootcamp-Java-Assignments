package Assignments._1_Easy;

import java.util.Arrays;

public class TransposeMatrix_17 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        Solution17 ob = new Solution17();
        ob.transpose(matrix);
    }
}

class Solution17 {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] tr_mat = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                tr_mat[i][j] = matrix[j][i];
            }
        }
        for (int[] is : tr_mat) {
            System.out.println(Arrays.toString(is));
        }
        return tr_mat;
    }
}

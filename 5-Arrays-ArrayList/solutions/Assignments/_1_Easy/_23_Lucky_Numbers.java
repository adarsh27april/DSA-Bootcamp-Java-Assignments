package Assignments._1_Easy;

import java.util.ArrayList;
import java.util.List;

public class _23_Lucky_Numbers {
    public static void main(String[] args) {
        Solution23 ob = new Solution23();
        int[][] matrix = {
                { 3, 7, 8 },
                { 9, 11, 13 },
                { 15, 16, 17 } };
        ob.luckyNumbers(matrix);
    }
}

class Solution23 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int row = 0, col = 0, m = matrix.length, n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            row = i;
            col = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[row][col] > matrix[i][j]) {
                    row = i;
                    col = j;
                }
            }
            System.out.println(matrix[row][col] + "-1");

            int row_temp = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[row_temp][col] < matrix[j][col]) {
                    row_temp = j;
                }
            }
            if (row == row_temp) {
                list.add(matrix[row][col]);
                System.out.println(matrix[row][col] + "---");
            }
        }
        System.out.println(list);
        return list;
    }
}

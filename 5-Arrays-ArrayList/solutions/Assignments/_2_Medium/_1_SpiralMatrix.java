package Assignments._2_Medium;

import java.util.ArrayList;
import java.util.List;

public class _1_SpiralMatrix {
    public static void main(String[] args) {
        Solution1 ob = new Solution1();
        int[][] matrix = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 } };
        // { 16, 17, 18, 19, 20 } };
        // { 21, 22, 23, 24, 25 } };
        ob.spiralOrder(matrix);
    }
}

class Solution1 {
    public List<Integer> spiralOrder(int[][] matrix) {
        // public void spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) {

            if (list.size() == m * n)
                break;

            for (int j = i; j < n - i; j++) {
                list.add(matrix[i][j]);
            }

            if (list.size() == m * n)
                break;

            for (int j = i + 1; j < m - i; j++) {
                list.add(matrix[j][n - i - 1]);
            }

            if (list.size() == m * n)
                break;

            for (int j = n - i - 2; j >= i; j--) {
                list.add(matrix[m - i - 1][j]);
            }

            if (list.size() == m * n)
                break;

            for (int j = m - i - 2; j >= i + 1; j--) {
                list.add(matrix[j][i]);
            }

            if (list.size() == m * n)
                break;
        }
        // for (int i = 0; i < m; i++) {
        // for (int j = i; j < m - i; j++) {
        // list.add(matrix[i][j]);
        // }

        // for (int j = i + 1; j < m - i; j++) {
        // list.add(matrix[j][m - i - 1]);
        // }

        // for (int j = m - i - 2; j >= i; j--) {
        // list.add(matrix[m - i - 1][j]);
        // }

        // for (int j = m - i - 2; j >= i + 1; j--) {
        // list.add(matrix[j][i]);
        // }
        // }
        System.out.println(list);
        return list;
    }
}

package Assignments._1_Easy;

import java.util.Arrays;

public class CellsWithOddValuesMatrix_14 {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = { { 0, 1 }, { 1, 1 } };
        Solution14 ob = new Solution14();
        // ob.oddCells(m, n, indices);
        ob.oddCells_alter(m, n, indices);
    }
}

class Solution14 {
    public int oddCells(int m, int n, int[][] indices) {
        int mat[][] = new int[m][n];

        for (int ind = 0; ind < indices.length; ind++) {
            int r = indices[ind][0];
            for (int j = 0; j < n; j++) {
                ++mat[r][j];
            }
            int c = indices[ind][1];
            for (int i = 0; i < m; i++) {
                ++mat[i][c];
            }
        }
        for (int[] is : mat) {
            System.out.println(Arrays.toString(is));
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] % 2 != 0) {
                    ++count;
                }
            }
        }
        return count;
    }

    public int oddCells_alter(int m, int n, int[][] indices) {
        /**
         * !!Awesome!!
         */
        int rows[] = new int[m];
        int cols[] = new int[n];

        for (int i = 0; i < indices.length; i++) {
            rows[indices[i][0]]++;
            cols[indices[i][1]]++;
        }

        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((rows[i] + cols[j]) % 2 != 0)
                    ans++;
            }
        }

        System.out.println("rows: " + Arrays.toString(rows));
        System.out.println("cols: " + Arrays.toString(cols));
        System.out.println("ans: " + ans);

        return ans;
    }
}

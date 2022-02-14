package Assignments._1_Easy;

public class MatrixDiagonalSum_15 {
    public static void main(String[] args) {
        Solution15 on = new Solution15();
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        on.diagonalSum(mat);
    }
}

class Solution15 {
    public int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
        }
        for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
            sum += mat[i][j];
        }
        if (n % 2 == 1) {// n-> odd
            sum -= mat[n / 2][n / 2];
        }
        System.out.println(sum + " " + n);
        return sum;
    }
}

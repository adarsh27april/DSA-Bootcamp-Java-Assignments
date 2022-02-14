package Assignments._1_Easy;

// import java.util.Arrays;

public class _25_ReshapeMatrix {
    public static void main(String[] args) {
        Solution25 ob = new Solution25();
        int mat[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 } },
                r = 42, c = 5;
        ob.matrixReshape(mat, r, c);
    }
}

class Solution25 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (r * c != m * n)
            return mat;

        int[] arr = new int[m * n];
        int[][] newMat = new int[r][c];

        int x = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[x++] = mat[i][j];
            }
        }

        x = 0;
        System.out.println("r: " + r + ", c: " + c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                newMat[i][j] = arr[x];
                ++x;
            }
        }

        return newMat;
    }
}
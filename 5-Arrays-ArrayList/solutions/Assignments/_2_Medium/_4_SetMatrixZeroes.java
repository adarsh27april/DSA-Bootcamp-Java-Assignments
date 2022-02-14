package Assignments._2_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _4_SetMatrixZeroes {
    public static void main(String[] args) {
        Solution4M ob = new Solution4M();
        // int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int[][] matrix = {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 } };
        // System.out.println("--" + matrix[3][0]);
        ob.setZeroes(matrix);
    }
}

class Solution4M {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rowInd = new ArrayList<>();
        ArrayList<Integer> colInd = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        System.out.println("m: " + m + ", n: " + n);
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (matrix[i][j] == 0) {
                    rowInd.add(i);
                    colInd.add(j);
                }
        Collections.sort(rowInd);
        Collections.sort(colInd);
        // System.out.println(rowInd);
        System.out.println("colInd" + colInd);

        ArrayList<Integer> uniqRowInd = new ArrayList<>();
        ArrayList<Integer> uniqColInd = new ArrayList<>();

        int k = 0;
        uniqRowInd.add(rowInd.get(0));
        for (int i = 0; i < rowInd.size(); i++) {
            if (uniqRowInd.get(k) == rowInd.get(i))
                continue;
            else {
                ++k;
                uniqRowInd.add(rowInd.get(i));
            }
        }

        k = 0;
        uniqColInd.add(colInd.get(0));
        for (int i = 0; i < colInd.size(); i++) {
            if (uniqColInd.get(k) == colInd.get(i))
                continue;
            else {
                ++k;
                uniqColInd.add(colInd.get(i));
            }
        }
        System.out.println("uniqRowInd" + uniqRowInd);
        System.out.println("uniqColInd" + uniqColInd);

        // making row zero
        for (int item : uniqRowInd) {
            for (int i = 0; i < n; i++) {
                matrix[item][i] = 0;
            }
        }

        for (int[] ar : matrix) {
            System.out.println(Arrays.toString(ar));
        }

        // making col zero
        for (int item : uniqColInd) {
            for (int i = 0; i < m; i++) {
                System.out.println(item + ", " + i);
                matrix[i][item] = 0;
            }
        }

        for (int[] ar : matrix) {
            System.out.println(Arrays.toString(ar));
        }
        // return matrix;
    }
}

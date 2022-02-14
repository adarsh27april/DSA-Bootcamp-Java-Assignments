package Assignments._2_Medium;

// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.List;

public class _3_SpiralMatrix_III {
    public static void main(String[] args) {
        Solution3 ob = new Solution3();
        // int rows = 1, cols = 4, rStart = 0, cStart = 0;
        int rows = 5, cols = 6, rStart = 1, cStart = 4;
        ob.spiralMatrixIII(rows, cols, rStart, cStart);
    }
}

class Solution3 {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int rowLen = rows, colLen = cols;
        int[][] list = new int[rowLen * colLen][2];
        int k = 0;
        // List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < Math.max(rowLen, colLen); i++) {
            // if (k <= rowLen * colLen) {
            System.out.print("\n i: " + i + " => ");

            for (int j = 0; j < (2 + 2 * (i)); j++) {
                if ((rStart - i) >= 0 && (rStart - i) < rowLen &&
                        (j + cStart - i) >= 0 && (j + cStart - i) < colLen) {
                    list[k][0] = rStart - i;
                    list[k][1] = j + cStart - i;
                    ++k;
                    // System.out.print("{" + (rStart - i) + "," + (j + cStart - i) + "}");
                }
            }

            for (int j = 0 + 1; j < 2 + (i) * 2 - 1; j++) {
                if ((j + rStart - i) >= 0 && (j + rStart - i) < rowLen
                        && (i + cStart + 1) >= 0 && (i + cStart + 1) < colLen) {
                    list[k][0] = j + rStart - i;
                    list[k][1] = i + cStart + 1;
                    ++k;
                    // System.out.print("{" + () + "," + () + "}");
                    // System.out.print("{" + (j + rStart - i) + "," + (i + cStart + 1) + "}");
                }
            }

            for (int j = 0; j < 3 + (i) * 2; j++) {
                if ((rStart + i + 1) >= 0 && (rStart + i + 1) < rowLen &&
                        (-j + cStart + i + 1) >= 0 && (-j + cStart + i + 1) < colLen) {
                    list[k][0] = rStart + i + 1;
                    list[k][1] = -j + cStart + i + 1;
                    ++k;
                    // System.out.print("{" + (rStart + i + 1) + "," + (-j + cStart + i + 1) + "}");
                }
            }

            for (int j = 0; j < 3 + (i) * 2 - 2; j++) {
                if ((-j + rStart + i) >= 0 && (-j + rStart + i) < rowLen &&
                        (cStart - i - 1) >= 0 && (cStart - i - 1) < colLen) {
                    list[k][0] = -j + rStart + i;
                    list[k][1] = cStart - i - 1;
                    ++k;
                    // System.out.print("{" + (-j + rStart + i) + "," + (cStart - i - 1) + "}");
                }
            }
        }
        // }
        for (int[] is : list) {
            System.out.print(Arrays.toString(is) + ", ");
        }
        return list;
    }
}

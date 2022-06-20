package Video_Lecture;

import java.util.Arrays;

public class Binary_Search_2D_arr {
   public static void main(String[] args) {
      int[][] matrix1 = {
            { 10, 20, 30, 40 },
            { 15, 25, 35, 45 },
            { 28, 29, 37, 49 },
            { 33, 34, 38, 50 }
      };
      int[][] matrix2 = {
            { 10 },
            { 15 },
            { 28 },
            { 33 }
      };
      int[][] matrix3 = { { 10, 20, 30, 40 } };
      int target = 30;
      System.out.println(Arrays.toString(Binary_Search_2D_Arr(matrix1, target)));
      System.out.println(Arrays.toString(Binary_Search_2D_Arr(matrix2, target)));
      System.out.println(Arrays.toString(Binary_Search_2D_Arr(matrix3, target)));
   }

   public static int[] Binary_Search_2D_Arr(int[][] matrix, int target) {
      int r = 0, c = matrix[0].length - 1;
      while (r < matrix.length && c >= 0) {
         if (target == matrix[r][c]) {
            return new int[] { r, c };
         }
         if (target > matrix[r][c]) {
            r++;
         } else {
            c--;
         }
      }
      return new int[] { -1, -1 };
   }
}

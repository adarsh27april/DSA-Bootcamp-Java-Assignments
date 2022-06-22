package Video_Lecture;

import java.util.Arrays;

public class Binary_Search_Sorted_2D_Arr {
   public static void main(String[] args) {
      int matrix[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 6, 7, 8 }
      };
      int target = 4;
      System.out.println(Arrays.toString(Binary_Search_in_Sorted_2D_Arr(matrix, target)));
   }

   public static int[] binarySearchRow(int[][] matrix, int row, int cStart, int cEnd, int target) {

      while (cStart <= cEnd) {
         int mid = cStart + (cEnd - cStart) / 2;

         if (matrix[row][mid] == target) {
            return new int[] { row, mid };
         }
         if (matrix[row][mid] < target) {
            cStart = mid + 1;
         } else {
            cEnd = mid - 1;
         }
      }
      return new int[] { -1, -1 };
   }

   public static int[] Binary_Search_in_Sorted_2D_Arr(int[][] matrix, int target) {

      int row = matrix.length, col = matrix[0].length;
      if (row == 1) {
         return binarySearchRow(matrix, 0, 0, col - 1, target);
      }

      // search in the mid col
      int rStart = 0, rEnd = row - 1, cMid = col / 2;

      while (rStart < (rEnd - 1)) {
         int mid = rStart + (rEnd - rStart) / 2;
         if (matrix[mid][cMid] == target) {
            return new int[] { mid, cMid };
         }

         if (matrix[mid][cMid] > target) {
            rEnd = mid;
         } else {
            rStart = mid;
         }
      }

      // now 2 rows remain
      // quad 1
      if (matrix[rStart][cMid] > target) {
         return binarySearchRow(matrix, rStart, 0, cMid - 1, target);
      }
      if (matrix[rStart][cMid] < target && target < matrix[rStart][col - 1]) {
         return binarySearchRow(matrix, rStart, cMid + 1, col - 1, target);
      }
      if (matrix[rStart + 1][cMid] > target) {
         return binarySearchRow(matrix, rStart + 1, 0, cMid - 1, target);

      } else {
         return binarySearchRow(matrix, rStart + 1, cMid + 1, col - 1, target);
      }
   }
}

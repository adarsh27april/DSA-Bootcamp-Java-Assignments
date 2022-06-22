package _1_Easy;

public class _11_1351_Count_Negative_Numbers_in_a_SortedMatrix {
   public static void main(String[] args) {
      int[][] matrix = {
            { 4, 3, 2, -1 },
            { 3, 2, 1, -1 },
            { 1, 1, -1, -2 },
            { -1, -1, -2, -3 }
      };
      Solution11 ob = new Solution11();
      System.out.println(ob.countNegatives(matrix));
   }
}

class Solution11 {
   public int countNegatives(int[][] matrix) {
      int count = 0, row = 0, col = matrix[0].length - 1;

      while (row < matrix.length && col > -1) {

         if (matrix[row][col] < 0) {
            count += matrix.length - row;
            col--;

         } else {
            // matrix[row][col]>0 => all elements before the element in the row is > 0
            row++;
         }
      }
      return count;
   }
}
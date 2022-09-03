package Easy;

import java.util.*;

public class _15_1030_Matrix_Cells_in_Distance_Order {
   public static void main(String[] args) {
      Solution15 ob = new Solution15();
      int ans[][] = ob.allCellsDistOrder(2, 3, 1, 2);
      for (int[] is : ans) {
         System.out.println(Arrays.toString(is));
      }
   }
}


class Solution15 {

   public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {

      int[][] arr = new int[rows * cols][2];

      int x = 0;
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            arr[x][0] = i;
            arr[x][1] = j;
            x++;
         }
      }

      Arrays.sort(arr, new Comparator<int[]>() {

         public int compare(int[] a, int[] b) {

            int dista = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);

            int distb = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);

            return dista - distb;
         }
      });

      return arr;
   }
}
/**
 * Arrays.sort(arr, new Comparator<int[]>(){
 * 
 * public int compare(int[] a,int[] b){
 * 
 * if(condition1){
 * 
 * return 1
 * 
 * }
 * 
 * else if(condition2){
 * 
 * return 0;
 * 
 * }
 * 
 * else{
 * 
 * return -1; }
 * 
 * }
 * 
 * })
 * 
 */

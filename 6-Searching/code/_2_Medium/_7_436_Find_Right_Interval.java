package _2_Medium;

import java.util.Arrays;

public class _7_436_Find_Right_Interval {
   public static void main(String[] args) {
      Solution7 ob = new Solution7();
      // int[][] intervals = { { 1, 2 } };
      // int[][] intervals = { { 3, 4 }, { 2, 3 }, { 1, 2 } };
      // int[][] intervals = { { 1, 4 }, { 2, 3 }, { 3, 4 } };
      int[][] intervals = { { 1, 2 }, { 2, 3 }, { 0, 1 }, { 3, 4 } };
      int ans[] = ob.findRightInterval_NAIVE(intervals);
      System.out.println(Arrays.toString(ans));
   }
}

class Solution7 {
   public int[] findRightInterval_NAIVE(int[][] intervals) {
      int[] rIntervals = new int[intervals.length];
      for (int i = 0; i < rIntervals.length; i++) {
         rIntervals[i] = find_start_j_NAIVE(intervals, intervals[i][1]);
      }
      return rIntervals;
   }

   public int find_start_j_NAIVE(int[][] arr, int end_i) {
      int x = 0;
      for (int j = 0; j < arr.length; j++) {
         int start_j = arr[j][0];
         if (start_j >= end_i) {
            int prev_start_j = arr[x][0];
            if (prev_start_j > end_i && prev_start_j <= start_j)
               continue;
            else {
               x = j;
               if (arr[x][0] == end_i) {
                  return x;
               }
            }
         }
      }
      if (x == 0 && !(arr[x][0] >= end_i)) {
         return -1;
      }
      return x;
   }
}
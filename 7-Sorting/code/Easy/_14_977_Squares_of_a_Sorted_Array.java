package Easy;

import java.util.Arrays;

public class _14_977_Squares_of_a_Sorted_Array {
   public static void main(String[] args) {
      Solution14 ob = new Solution14();
      int[] nums = {-4, -1, 0, 3, 10};
      int[] ans = ob.sortedSquares(nums);
      System.out.println(Arrays.toString(ans));
   }
}


class Solution14 {
   public int[] sortedSquares_naive(int[] nums) {
      for (int i = 0; i < nums.length; i++) {
         nums[i] = nums[i] * nums[i];
      }
      Arrays.sort(nums);
      return nums;
   }

   public int[] sortedSquares(int[] nums) {
      int len = nums.length;
      int[] ans = new int[len];
      int i = 0, j = len - 1;
      for (int x = len - 1; x >= 0; x--) {
         if (Math.abs(nums[i]) > Math.abs(nums[j])) {
            ans[x] = nums[i] * nums[i];
            i++;

         } else {
            ans[x] = nums[j] * nums[j];
            j--;
         }
      }
      return ans;
   }
}

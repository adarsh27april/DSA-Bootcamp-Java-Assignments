package Easy;

import java.util.Arrays;

public class _11_905_Sort_Array_By_Parity {
   public static void main(String[] args) {
      Solution11 ob = new Solution11();
      int[] nums = {3, 1, 2, 4};
      // int[] arr = ob.sortArrayByParity_naive(nums);
      int[] arr = ob.sortArrayByParity_fast(nums);
      System.out.println(Arrays.toString(arr));
   }
}


class Solution11 {
   public int[] sortArrayByParity_naive(int[] nums) {
      int[] arr = new int[nums.length];
      int evenCount = 0, oddCount = 0;

      for (int item : nums) {
         if (item % 2 == 0) {
            arr[evenCount++] = item;

         } else {
            arr[arr.length - 1 - oddCount] = item;
            ++oddCount;
         }
      }
      return arr;
   }

   public int[] sortArrayByParity_fast(int[] nums) {
      /**
       * 100% FAST In Place Swap algorithm
       */

      for (int i = 0, x = 0; i < nums.length; i++) {
         if (nums[i] % 2 == 0) {
            swap(nums, x++, i);
         }
      }
      return nums;
   }

   private void swap(int[] nums, int a, int b) {
      int temp = nums[a];
      nums[a] = nums[b];
      nums[b] = temp;
   }
}

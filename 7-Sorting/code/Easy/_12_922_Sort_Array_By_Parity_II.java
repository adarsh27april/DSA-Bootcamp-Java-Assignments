package Easy;

import java.util.Arrays;

public class _12_922_Sort_Array_By_Parity_II {
   public static void main(String[] args) {
      // int[] nums = {4, 2, 5, 7};
      int[] nums = {3, 1, 4, 2};
      Solution12 ob = new Solution12();
      ob.sortArrayByParityII(nums);
      System.out.println(Arrays.toString(nums));
   }
}


class Solution12 {

   public int[] sortArrayByParityII(int[] nums) {
      int i = 0, j = nums.length - 1;
      int l = nums.length;
      while (i < l) {
         while (i < l && nums[i] % 2 == 0)
            i += 2;

         if (i == l)
            break;

         while (j >= 0 && nums[j] % 2 != 0)
            j -= 2;

         swap(nums, i, j);
      }
      return nums;
   }

   private void swap(int[] nums, int a, int b) {
      int temp = nums[a];
      nums[a] = nums[b];
      nums[b] = temp;
   }
}

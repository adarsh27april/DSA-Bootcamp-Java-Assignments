package Easy;

import java.util.Arrays;

public class _10_628_Maximum_Product_of_Three_Numbers {
   public static void main(String[] args) {
      Solution10 ob = new Solution10();
      // int nums[] = {-100, -98, -1, 2, 3, 4};
      int nums[] = {1, 2, 3};
      System.out.println(ob.maximumProduct_fast(nums));
   }
}


class Solution10 {
   public int maximumProduct_naive(int[] nums) {

      Arrays.sort(nums);
      int l = nums.length;
      return Math.max(nums[l - 1] * nums[l - 2] * nums[l - 3], nums[0] * nums[1] * nums[l - 1]);
   }

   public int maximumProduct_fast(int[] nums) {
      Arrays.sort(nums);
      // int l = nums.length;
      int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE,
            min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
      for (int i = 0; i < nums.length; i++) {
         if (max1 <= nums[i]) {
            max3 = max2;
            max2 = max1;
            max1 = nums[i];
         } else if (nums[i] >= max2) {
            max3 = max2;
            max2 = nums[i];
         } else if (nums[i] >= max3) {
            max3 = nums[i];

         }

         if (min1 > nums[i]) {
            min2 = min1;
            min1 = nums[i];
         } else if (nums[i] > min1) {
            min2 = nums[i];
         }
      }
      int ans = Math.max(max1 * max2 * max3, min1 * min2 * max1);
      if (min1 == Integer.MAX_VALUE) {
         ans = max1 * max2 * max3;
      }
      return ans;
      // return Math.max(nums[l - 1] * nums[l - 2] * nums[l - 3], nums[0] * nums[1] * nums[l - 1]);
   }

}

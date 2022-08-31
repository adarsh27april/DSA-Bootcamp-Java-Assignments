package Easy;

import java.util.Arrays;

public class _13_976_Largest_Perimeter_Triangle {
   public static void main(String[] args) {
      // int nums[] = {2, 1, 2};
      int nums[] = {3, 6, 2, 3};
      Solution13 ob = new Solution13();
      System.out.println(ob.largestPerimeter(nums));
   }
}


class Solution13 {
   public int largestPerimeter(int[] nums) {
      Arrays.sort(nums);
      for (int i = nums.length - 1; i >= 2; i--) {
         if (nums[i] < nums[i - 1] + nums[i - 2]) {
            return nums[i] + nums[i - 1] + nums[i - 2];
         }
      }
      return 0;
   }
}

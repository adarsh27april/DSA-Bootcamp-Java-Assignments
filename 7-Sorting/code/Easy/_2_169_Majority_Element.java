package Easy;

public class _2_169_Majority_Element {
   public static void main(String[] args) {
      Solution2 ob = new Solution2();
      int[] nums = {2, 2, 1, 1, 1, 2, 2};
      int ans = ob.majorityElement(nums);
      System.out.println(ans);
   }
}


class Solution2 {
   public int majorityElement(int[] nums) {
      int currEle = nums[0], count = 1;
      for (int i = 0; i < nums.length; i++) {
         if (count == 0) {
            count = 0;
            currEle = nums[i];
         }
         if (currEle == nums[i]) {
            ++count;
         } else {
            --count;
         }

      }
      return currEle;
   }
}

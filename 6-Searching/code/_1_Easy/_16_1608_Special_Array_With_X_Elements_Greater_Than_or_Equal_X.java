package _1_Easy;

public class _16_1608_Special_Array_With_X_Elements_Greater_Than_or_Equal_X {
   public static void main(String[] args) {
      // int[] nums = { 0, 0 };
      int[] nums = { 3, 5 };
      Solution16 ob = new Solution16();
      System.out.println(ob.specialArray_Fast(nums));
   }
}

class Solution16 {
   public int specialArrayBruteForce(int[] nums) {

      int numOfElems = nums.length;
      int[] count = new int[numOfElems + 1];

      for (int i = 0; i < count.length; i++) {
         for (int j = 0; j < nums.length; j++) {
            if (i <= nums[j]) {
               ++count[i];
            }
         }
         if (count[i] == i)
            return i;
      }
      return -1;
   }

   public int specialArray_Fast(int[] nums) {
      int numsLength = nums.length;
      int[] counts = new int[numsLength + 1];

      for (int i = 0; i < nums.length; i++) {
         if (nums[i] >= numsLength) {
            ++counts[numsLength];

         } else {
            ++counts[nums[i]];
         }
      }

      if (counts[counts.length - 1] == counts.length - 1)
         return counts.length - 1;

      for (int i = counts.length - 2; i >= 0; i--) {
         // traversing counts array from behind
         counts[i] = counts[i] + counts[i + 1];

         if (counts[i] == i)
            return i;
      }

      return -1;
   }
}
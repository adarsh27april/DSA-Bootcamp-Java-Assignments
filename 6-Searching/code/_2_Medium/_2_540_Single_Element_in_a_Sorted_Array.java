package _2_Medium;

public class _2_540_Single_Element_in_a_Sorted_Array {
   public static void main(String[] args) {
      int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
      Solution2 ob = new Solution2();
      System.out.println(ob.singleNonDuplicate(nums));
   }
}

class Solution2 {
   public int singleNonDuplicate(int[] nums) {
      int start = 0, end = nums.length - 1;
      int mid = start + (end - start) / 2;

      while (start < end) {
         mid = start + (end - start) / 2;

         if (mid % 2 == 0) {// mid is even
            if (nums[mid] == nums[mid + 1]) {
               start = mid + 1;

            } else {
               end = mid;
            }
         } else {// mid is odd
            if (nums[mid] == nums[mid - 1]) {
               start = mid + 1;

            } else {
               end = mid;
            }
         }
      }
      return nums[start];
   }
}
package Hard;

public class _41_First_Missing_Positive {
   public static void main(String[] args) {
      Solution1 ob = new Solution1();
      int[] arr = {3, 4, -1, 1};
      int a = ob.firstMissingPositive(arr);
      System.out.println(a);
   }
}


class Solution1 {
   public int firstMissingPositive(int[] nums) {
      int i = 0;
      while (i < nums.length) {
         int correctIndex = nums[i] - 1;

         if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correctIndex]) {
            swap(nums, i, correctIndex);
         } else {
            ++i;
         }
      }
      for (i = 0; i < nums.length; i++) {
         if (nums[i] != i + 1) {
            return i + 1;
         }
      }

      return nums.length + 1;
   }

   public void swap(int[] nums, int a, int b) {
      int temp = nums[a];
      nums[a] = nums[b];
      nums[b] = temp;
   }
}

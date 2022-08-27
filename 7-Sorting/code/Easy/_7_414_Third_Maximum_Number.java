package Easy;

public class _7_414_Third_Maximum_Number {

   public static void main(String[] args) {
      // int[] nums = { 2, 2, 3, 1 };
      // int[] nums = { 2, 1, 3 };
      int[] nums = { 1, 2, -2147483648 };
      // int[] nums = { -2147483648, 1, 1 };
      Solution7 ob = new Solution7();
      int ans = ob.thirdMax(nums);
      System.out.println(ans);
   }
}

class Solution7 {
   public int thirdMax(int[] nums) {
      int max1 = Integer.MIN_VALUE;
      int flag = 0;// for checking if Integer.MIN_VALUE is present

      for (int i = 0; i < nums.length; i++) {
         if (nums[i] > max1) {
            max1 = nums[i];
         }
         if (nums[i] == Integer.MIN_VALUE) {
            flag = 1;
         }
      }

      int x = Integer.MIN_VALUE;
      int max2 = max1;// start by initialising max2 = max1
      for (int i = 0; i < nums.length; i++) {
         if (nums[i] > x && nums[i] < max1) {
            x = nums[i];
         }
      }
      // if there is a max value after max1 => x then max2 = x else max2=max1;
      if (x != Integer.MIN_VALUE || flag == 1) {
         max2 = x;
      }

      x = Integer.MIN_VALUE;
      int max3 = max2;
      for (int i = 0; i < nums.length; i++) {
         if (nums[i] > x && nums[i] < max2) {
            x = nums[i];
         }
      }
      // if there is a max value after max2 => x then max3 = x else max3=max2;
      if (x != Integer.MIN_VALUE || flag == 1) {
         max3 = x;
      }

      /*
       * Now if there is a distinct max3 then return it or else max3 == max2
       * if there are only two max values.
       */
      if (max3 == max2) {
         return max1;
      }

      return max3;
   }
}

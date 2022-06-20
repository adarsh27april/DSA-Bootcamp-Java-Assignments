package _3_Hard;

public class _5_410_Split_Array_Largest_Sum {
   public static void main(String[] args) {
      int nums[] = { 7, 2, 5, 10, 8 }, m = 2;
      Solution5 ob = new Solution5();
      System.out.println(ob.splitArray(nums, m));
   }
}

class Solution5 {
   public int splitArray(int[] nums, int m) {
      int start = 0, end = 0;

      for (int i = 0; i < nums.length; i++) {
         start = Math.max(start, nums[i]);// basic linear search
         end += nums[i];// basic array sum
      }

      while (start < end) {
         int mid = start + (end - start) / 2;
         /**
          * Now Calculate how many pieces(of arr nums)
          * you can create with this max sum( == mid)
          */
         int sum = 0, pieces = 1;

         for (int num : nums) {

            if (sum + num > mid) {
               /**
                * now here we cann't add this into the existing sub array,
                * make a new sub array.
                */
               sum = num; // resetting sum.
               pieces++; // making new *piece*(sub array)

            } else {
               sum += num;
            }
         }
         if (pieces > m) {
            start = mid + 1;
         } else {
            end = mid;
         }
      }
      return end;
   }
}
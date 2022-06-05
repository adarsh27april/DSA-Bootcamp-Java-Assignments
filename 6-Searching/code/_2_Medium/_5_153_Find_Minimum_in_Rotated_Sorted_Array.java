package _2_Medium;

public class _5_153_Find_Minimum_in_Rotated_Sorted_Array {
   public static void main(String[] args) {
      int nums[] = { 3, 4, 5, 1, 2 };

      Solution5 ob = new Solution5();
      System.out.println(ob.findMin(nums));
   }
}

class Solution5 {
   public int findMin(int[] nums) {
      int pivot = findPivot(nums);

      if (pivot == -1) {
         return nums[0];
      }
      return nums[pivot + 1];
   }

   int findPivot(int[] arr) {
      int start = 0, end = arr.length - 1;

      while (start <= end) {
         int mid = start + (end - start) / 2;

         if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
         }
         if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1;
         }

         if (arr[mid] >= arr[start]) {
            start = mid + 1;
         } else if (arr[mid] < arr[start]) {
            end = mid - 1;
         }
      }
      return -1;
   }
}
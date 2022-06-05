package _2_Medium;

public class _4_81_Search_Rotated_Sorted_Array_II {
   public static void main(String[] args) {
      Solution4 ob = new Solution4();
      int nums[] = { 3, 5, 1 }, target = 3;
      System.out.println(ob.search(nums, target));
   }
}

class Solution4 {
   public boolean search(int[] nums, int target) {

      if (nums.length == 1) {
         if (target == nums[0]) {
            return true;
         }
         return false;
      }

      int pivot = findPivot(nums);

      if (pivot > -1) {
         if (binarySearch(nums, target, 0, pivot)) {
            return true;
         }

         return binarySearch(nums, target, pivot + 1, nums.length - 1);
      } else {
         return binarySearch(nums, target, 0, nums.length - 1);
      }

   }

   public int findPivot(int[] arr) {
      int start = 0, end = arr.length - 1;
      while (start <= end) {
         int mid = start + (end - start) / 2;

         if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
         }
         if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1;
         }

         /**
          * If arr[start] == arr[mid] == arr[end] then skip the start and end
          */
         if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
            // NOTE : it is possible that the start and the end are pivots

            // before skipping start checking if it is the pivot
            if (start < end && arr[start] > arr[start + 1]) {
               // start < end => to make sure start+1 exists inside array
               return start;// start is not pivot & it's duplicate => skip it
            }
            start++;

            if (end > start && arr[end] < arr[end - 1]) {
               // to make sure end-1 exists inside array
               return end - 1;
            }
            end--;
         }

         else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
            start = mid + 1;

         } else {
            end = mid - 1;
         }
      }

      return -1;// i.e., array doesn't have pivot
   }

   public boolean binarySearch(int[] arr, int target, int start, int end) {
      while (start <= end) {
         int mid = start + (end - start) / 2;

         if (arr[mid] == target) {
            return true;
         }

         if (arr[mid] < target) {
            start = mid + 1;
         } else {
            end = mid - 1;
         }
      }
      return false;
   }
}
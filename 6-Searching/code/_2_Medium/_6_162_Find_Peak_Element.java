package _2_Medium;

public class _6_162_Find_Peak_Element {
   public static void main(String[] args) {
      Solution6 ob = new Solution6();
      // System.out.println(ob.findPeakElement(new int[] { 1, 2, 3, 1 }));
      System.out.println(ob.findPeakElement(new int[] { 1, 2, 1, 3, 5, 6, 4 }));
   }
}

class Solution6 {
   public int findPeakElement(int[] arr) {
      if (arr.length == 1)
         return 0;

      if (arr[0] > arr[1])
         return 0;
      if (arr[arr.length - 1] > arr[arr.length - 2])
         return arr.length - 1;

      int start = 1, end = arr.length - 2;

      while (start <= end) {
         int mid = start + (end - start) / 2;
         if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
            return mid;
         }

         if (arr[mid] < arr[mid + 1]) {
            start = mid + 1;

         } else {
            end = mid;
         }
      }
      return -1;
   }
}
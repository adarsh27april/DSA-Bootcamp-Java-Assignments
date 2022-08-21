package Easy;

import java.util.Arrays;

public class _4_268_Missing_Number {
   public static void main(String[] args) {
      Solution4 ob = new Solution4();
      // int[] arr = { 4, 0, 2, 1 };
      // int[] arr = { 0, 1 };
      int[] arr = { 1 };
      int ans = ob.missingNumber(arr);
      System.out.println(Arrays.toString(arr));
      System.out.println(ans);

   }
}

class Solution4 {
   public int missingNumber(int[] arr) {
      int i = 0;
      while (i < arr.length) {
         if (arr[i] < arr.length && arr[i] != i) {
            swap(arr, i, arr[i]);
         } else {
            ++i;
         }
      }
      for (int j = 0; j < arr.length; j++) {
         if (arr[j] != j) {
            return j;
         }
      }

      // return bSearch(arr);
      return arr.length;
   }

   void swap(int[] arr, int a, int b) {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
   }

   int bSearch(int[] arr) {
      int start = 0, end = arr.length - 1;
      while (start <= end) {
         int mid = start + (end - start) / 2;
         if (arr[mid] == mid) {
            start = mid + 1;
         } else {
            end = mid;
            if (arr[mid - 1] == mid - 1) {
               return end;
            }
         }
      }
      return arr.length;
   }
}
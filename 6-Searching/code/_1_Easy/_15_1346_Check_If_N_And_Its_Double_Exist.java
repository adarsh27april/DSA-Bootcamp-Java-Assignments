package _1_Easy;

import java.util.Arrays;

public class _15_1346_Check_If_N_And_Its_Double_Exist {
   public static void main(String[] args) {
      // int arr[] = { 10, 2, 5, 3 };
      int arr[] = { -2, 0, 10, -19, 4, 6, -8 };
      Solution15 ob = new Solution15();
      System.out.println(ob.checkIfExist(arr));
   }
}

class Solution15 {
   public boolean checkIfExist(int[] arr) {
      Arrays.sort(arr);
      int zeroCount = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == 0) {
            ++zeroCount;
         }
         if (zeroCount >= 2) {
            return true;
         }
         if (arr[i] != 0)
            if (binarySearch(arr, arr[i]) && binarySearch(arr, arr[i] * 2)) {
               return true;
            }
      }
      return false;
   }

   public boolean binarySearch(int arr[], int target) {
      int start = 0, end = arr.length - 1;
      while (start <= end) {
         int mid = start + (end - start) / 2;
         if (arr[mid] == target) {
            return true;
         }
         if (arr[mid] > target) {
            end = mid - 1;
         } else {
            start = mid + 1;
         }
      }
      return false;
   }
}
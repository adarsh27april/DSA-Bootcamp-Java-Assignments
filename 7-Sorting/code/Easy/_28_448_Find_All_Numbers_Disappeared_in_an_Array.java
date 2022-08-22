package Easy;

import java.util.ArrayList;
import java.util.List;

public class _28_448_Find_All_Numbers_Disappeared_in_an_Array {

   public static void main(String[] args) {
      int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
      Solution28 ob = new Solution28();
      ob.findDisappearedNumbers(arr);
   }
}

class Solution28 {
   public List<Integer> findDisappearedNumbers(int[] nums) {
      List<Integer> list = new ArrayList<>();
      int i = 0;
      while (i < nums.length) {
         int correctIndex = nums[i] - 1;
         if (nums[i] != nums[correctIndex]) {
            swap(nums, i, correctIndex);
         } else {
            ++i;
         }
      }
      for (int j = 0; j < nums.length; j++) {
         if (nums[j] - 1 != j) {
            list.add(j + 1);
         }
      }
      System.out.println(list);
      return list;
   }

   void swap(int[] arr, int a, int b) {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
   }
}
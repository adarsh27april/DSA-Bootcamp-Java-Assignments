package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _442_Find_All_Duplicates_in_an_Array {
   public static void main(String[] args) {
      Solution ob = new Solution();
      int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
      List<Integer> list = ob.findDuplicates(arr);
      System.out.println(Arrays.toString(arr));
      System.out.println(list);
   }
}


class Solution {
   public List<Integer> findDuplicates(int[] arr) {
      List<Integer> list = new ArrayList<>();
      int i = 0;
      while (i < arr.length) {
         int correctIndex = arr[i] - 1;
         if (arr[i] != arr[correctIndex]) {
            swap(arr, i, correctIndex);
         } else {
            ++i;
         }
      }
      for (int j = 0; j < arr.length; j++) {
         if (arr[j] != j + 1) {
            list.add(arr[j]);
         }
      }
      return list;
   }

   private void swap(int[] arr, int a, int b) {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
   }
}

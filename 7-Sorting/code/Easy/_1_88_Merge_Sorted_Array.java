package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1_88_Merge_Sorted_Array {
   public static void main(String[] args) {
      int nums1[] = {1, 2, 3, 0, 0, 0}, m = 3, nums2[] = {2, 5, 6}, n = 3;
      Solution1 ob = new Solution1();
      ob.merge(nums1, m, nums2, n);
      System.out.println(Arrays.toString(nums1));
   }

}


class Solution1 {

   public void merge(int[] nums1, int m, int[] nums2, int n) {
      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < m; i++) {
         list.add(nums1[i]);
      }
      for (int i = 0; i < n; i++) {
         int ind = bSearchFloor(list, nums2[i]);
         list.add(ind + 1, nums2[i]);
      }
      for (int i = 0; i < list.size(); i++) {
         nums1[i] = list.get(i);
      }
   }

   private int bSearchFloor(List<Integer> list, int target) {
      int start = 0, end = list.size() - 1;
      while (start <= end) {
         int mid = start + (end - start) / 2;

         if (list.get(mid) < target) {
            start = mid + 1;

         } else if (list.get(mid) > target) {
            end = mid - 1;

         } else {
            return mid;
         }
      }
      return end;
   }
}

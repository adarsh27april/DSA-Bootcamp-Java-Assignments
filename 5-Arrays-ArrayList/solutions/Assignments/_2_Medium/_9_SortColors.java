package Assignments._2_Medium;

import java.util.Arrays;

public class _9_SortColors {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        Solution9 ob = new Solution9();
        ob.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}

class Solution9 {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}

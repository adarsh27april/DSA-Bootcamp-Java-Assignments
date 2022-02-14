package Assignments._1_Easy;

import java.util.Arrays;

public class _21_TwoSum {
    public static void main(String[] args) {
        Solution21 ob = new Solution21();
        int nums[] = { 3, 2, 4 };
        int target = 6;
        int[] ans = ob.twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}

class Solution21 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int a = 0, b = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    b = j;
                    a = i;
                    ans[0] = a;
                    ans[1] = b;
                    return ans;
                }
            }
        }
        return ans;
    }
}
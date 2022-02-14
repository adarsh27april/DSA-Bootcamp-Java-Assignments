package Assignments._1_Easy;

public class _24_MaximumSubarray {
    public static void main(String[] args) {
        Solution24 ob = new Solution24();
        // int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] nums = { 5, 4, -1, 7, 8 };
        ob.maxSubArray(nums);
    }
}

class Solution24 {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            max = Math.max(sum, max);
        }
        System.out.println(max);
        return max;
    }
}

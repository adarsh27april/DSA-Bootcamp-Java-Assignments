package Assignments._2_Medium;

import java.util.Arrays;

public class _8_RotateArray {
    public static void main(String[] args) {
        Solution8 ob = new Solution8();
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        ob.rotate(nums, k);
        System.out.println("nums inside main: " + Arrays.toString(nums));
    }
}

class Solution8 {
    public void rotate(int[] nums, int k) {
        /*
         * int[] arr = new int[nums.length];
         * int n = nums.length;
         * 
         * for (int i = 0; i < n; i++) {
         * arr[i] = nums[((n - k) + i) % n];
         * }
         * for (int i = 0; i < arr.length; i++)
         * nums[i] = arr[i];
         */

        int[] arr = new int[k];
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            arr[i] = nums[n - k + i];
        }

        for (int i = (n - k - 1); i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }
    }
}

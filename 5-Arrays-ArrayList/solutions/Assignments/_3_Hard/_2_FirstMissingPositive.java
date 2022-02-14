package Assignments._3_Hard;

import java.util.Arrays;

public class _2_FirstMissingPositive {
    public static void main(String[] args) {
        Solution2 ob = new Solution2();
        // int nums[] = { 1, 2, 0 };
        // int nums[] = { 7, 8, 9, 11, 12 };
        int nums[] = { 3, 4, -1, 1 };
        System.out.println(ob.firstMissingPositive(nums));
    }
}

class Solution2 {
    public int firstMissingPositive(int[] nums) {

        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println("max: " + max);
        if (max <= 0) {
            return 1;
        }
        int a = 1;
        int[] present = new int[max + 2];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                present[nums[i]] = 1;
        }
        System.out.println("present: " + Arrays.toString(present));
        for (int i = 1; i < present.length; i++) {
            if (present[i] == 0) {
                a = i;
                break;
            }
        }

        System.out.println("a: " + a);
        return a;
    }
}
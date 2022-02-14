package Assignments._1_Easy;

import java.util.Arrays;

public class _27_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution27 ob = new Solution27();
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        ob.removeDuplicates_fast(nums);
    }
}

class Solution27 {
    public int removeDuplicates_naive(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        } else {
            int count = 0;
            for (int i = 1; i < nums.length - count; i++) {
                if (nums[i] == nums[i - 1]) {
                    nums[i] = Integer.MAX_VALUE;
                    ++count;
                    --i;
                }
                Arrays.sort(nums);
            }
            System.out.println(Arrays.toString(nums));
            System.out.println(nums.length - count);
            return nums.length - count;
        }
    }

    public int removeDuplicates_fast(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        } else {
            int x = 1, y = 0, count = 0;
            while (x < nums.length) {
                if (y != x) {
                    if (nums[x] == nums[y]) {
                        nums[x] = Integer.MAX_VALUE;
                        ++count;
                        --y;
                    }
                    ++x;
                    ++y;
                    if (x < nums.length)
                        if (nums[x] != nums[y]) {
                            y = x - 1;
                        }
                }
            }
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            System.out.println(nums.length - count);
            return nums.length - count;
        }
    }
}
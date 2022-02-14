/*
https://leetcode.com/problems/jump-game/discuss/596454/Python-Simple-solution-with-thinking-process-Runtime-O(n)
*/
package Assignments._2_Medium;

public class _7_JumpGame {
    public static void main(String[] args) {
        // int[] nums = { 2, 3, 1, 1, 4 };
        int[] nums = { 3, 2, 1, 0, 4 };
        Solution7 ob = new Solution7();
        ob.canJump(nums);
    }
}

class Solution7 {
    public boolean canJump(int[] nums) {
        int pseudoLastIndex = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= pseudoLastIndex) {
                pseudoLastIndex = i;
            }
        }

        if (pseudoLastIndex == 0) {
            return true;
        } else
            return false;
    }
}
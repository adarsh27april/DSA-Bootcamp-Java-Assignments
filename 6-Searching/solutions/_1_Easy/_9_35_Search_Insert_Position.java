package _1_Easy;

public class _9_35_Search_Insert_Position {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 },
                // target = 2;
                target = 7;
        // target = 5;
        System.out.println(Solution9.searchInsert(nums, target));
    }
}

class Solution9 {
    public static int searchInsert(int[] nums, int target) {

        int start = 0, n = nums.length, end = n;

        if (nums[n - 1] < target) {
            // corner case
            return n;
        }

        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;

            } else if (nums[mid] > target) {
                end = mid - 1;

            } else {
                return mid;
            }
        }
        return start;
    }
}
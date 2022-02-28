package _2_Medium;

public class _3_33_SearchRotatedSortedArray {
    public static void main(String[] args) {
        Solution3 ob = new Solution3();
        // int nums[] = { 4, 5, 6, 7, 0, 1, 2 }, target = 0;
        // int nums[] = { 4, 5, 6, 7, 0, 1, 2 }, target = 3;
        // int nums[] = { 1 }, target = 0;
        // int nums[] = { 3, 1 }, target = 3;
        int nums[] = { 3, 5, 1 }, target = 3;
        System.out.println(ob.search(nums, target));
    }
}

class Solution3 {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);

        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }

    }

    public int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] >= nums[start]) {
                start = mid + 1;

            } else {
                // nums[mid] <= nums[start]
                end = mid - 1;
            }
        }
        return -1;
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;

            } else if (nums[mid] > target) {
                end = mid - 1;

            } else {
                return mid;
            }
        }
        return -1;
    }
}

package _2_Medium;

import java.util.Arrays;

public class _1_34_FindFirstLastPositionElementSortedArray {

	public static void main(String[] args) {
		Solution1 ob = new Solution1();
		// int nums[] = { 5, 7, 7, 8, 8, 10 }, target = 8;
		int nums[] = {}, target = 0;
		// int nums[] = { 1 }, target = 1;
		// int nums[] = { 2, 2 }, target = 3;
		System.out.println(Arrays.toString(ob.searchRange(nums, target)));
	}
}

// ------ FACEBOOK ------

class Solution1 {
	public int[] searchRange(int[] nums, int target) {
		int ans[] = { -1, -1 };

		ans[0] = search(nums, target, true);
		if (ans[0] != -1)
			ans[1] = search(nums, target, false);
		return ans;
	}

	int search(int[] nums, int target, boolean isFindStartIndex) {
		int ans = -1;

		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] < target) {// [...m...t..]
				start = mid + 1;

			} else if (nums[mid] > target) {
				end = mid - 1;

			} else {// nums[mid] == target
				ans = mid;

				if (isFindStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}

		return ans;
	}
}

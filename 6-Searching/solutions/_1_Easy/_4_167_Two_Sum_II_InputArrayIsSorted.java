package _1_Easy;

import java.util.Arrays;

public class _4_167_Two_Sum_II_InputArrayIsSorted {
    public static void main(String[] args) {
        System.out.println("hellow world");
        System.out.println(Arrays.toString(
                Solution4.twoSum_Naive_BinarySearch(new int[] { 2, 7, 11, 15 }, 9)));
        // Solution4.twoSum_Naive_BinarySearch(new int[] { 2, 3, 4 }, 6)));
    }
}

class Solution4 {
    /**
     * Runtime: 9 ms, faster than 9.70%
     */
    public static int[] twoSum_Naive_BinarySearch(int[] numbers, int target) {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int ind1 = i, ind2 = 1;

            int start = ind1 + 1, end = n - 1, t = target - numbers[ind1];
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (numbers[mid] < t) {
                    start = mid + 1;
                } else if (numbers[mid] > t) {
                    end = mid - 1;
                } else {
                    ind2 = mid;
                    return new int[] { ind1 + 1, ind2 + 1 };
                }
            }
        }
        return new int[] { 0, 0 };
    }
}
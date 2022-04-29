package _1_Easy;

import java.util.ArrayList;

public class _8_1539_KthMissingPositiveNumber {
    public static void main(String[] args) {

        // int[] arr = { 2, 3, 4, 7, 11 };
        // int k = 5;
        int[] arr = { 1, 2, 3, 4 };
        int k = 2;

        Solution8 ob = new Solution8();
        ob.findKthPositive(arr, k);
    }
}

class Solution8 {
    public int findKthPositive(int[] arr, int k) {
        int num = 1, i = 0;
        ArrayList<Integer> missing = new ArrayList<>();

        while (missing.size() <= k) {
            if (i >= arr.length) {
                missing.add(num);
                ++num;

            } else if (arr[i] != num) {
                missing.add(num);
                ++num;

            } else if (arr[i] == num) {
                i++;
                num++;
            }
        }
        System.out.println(missing.get(k - 1));

        return missing.get(k - 1);
    }
}

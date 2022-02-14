package Assignments._1_Easy;

import java.util.Arrays;

public class _22_SumZero {
    public static void main(String[] args) {
        Solution22 ob = new Solution22();
        ob.sumZero(4);
    }
}

class Solution22 {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        // int k = n;
        int j = 0;
        for (int i = -1 * n / 2; i <= n / 2; i++) {
            if (n % 2 == 0 && i == 0)
                continue;
            arr[j] = i;
            j++;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

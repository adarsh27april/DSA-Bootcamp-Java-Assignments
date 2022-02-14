package Assignments._1_Easy;

public class FindHighestAltitude_12 {
    public static void main(String[] args) {
        int[] gain = { -4, -3, -2, -1, 4, 3, 2 };
        Solution12 obj = new Solution12();
        int ans = obj.largestAltitude(gain);
        System.out.println(ans);
    }
}

class Solution12 {
    public int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length + 1];
        for (int i = 1; i <= gain.length; i++) {
            alt[i] = alt[i - 1] + gain[i - 1];
        }
        int max = alt[0];
        for (int i : alt) {
            if (i > max)
                max = i;
        }

        return max;
    }
}
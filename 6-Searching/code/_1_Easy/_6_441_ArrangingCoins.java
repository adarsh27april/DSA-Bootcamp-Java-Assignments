package _1_Easy;

public class _6_441_ArrangingCoins {
    public static void main(String[] args) {
        // int n = 5;
        int n = 1804289383;
        // int n = Integer.MAX_VALUE;
        System.out.println(Solution6.arrangeCoins(n));
    }
}

class Solution6 {
    public static int arrangeCoins_naive(int n) {
        int i = 1, s;

        while (true) {
            s = i * (i + 1) / 2;

            if (s == n) {
                return i;
            }
            if (s > n) {
                return i - 1;
            }
            ++i;
        }
        // return 0;
    }

    public static int arrangeCoins(int n) {
        double sqrt = Math.sqrt(1 + 8 * (long) n);
        return (int) ((-1 + sqrt) / 2);
    }
}

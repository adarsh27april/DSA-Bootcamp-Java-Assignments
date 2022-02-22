package _1_Easy;

public class _5_367_ValidPerfectSquare {
    public static void main(String[] args) {
        // int num = 16;
        // int num = 2_147_483_647;
        // int num = 1;
        // int num = 808201;

        // int num = 431; // 185761
        int num = 185761;
        System.out.println(Solution5.isPerfectSquare(num));
        // Solution5.test();
    }
}

class Solution5 {

    /**
     * LONG ka chakkar babu bhaiya LONG ka chakkar
     */

    public static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long start = 1, end = num / 2;
        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid * mid < num) {
                start = mid + 1;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void test() {
        int i = 1;
        while (true) {
            if (!isPerfectSquare(i * i)) {
                System.out.println(i);
                break;
            }
            ++i;
        }
    }
}

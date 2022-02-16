package LinearSearch._1_Easy;

public class _1_69_sqrtx {
    public static void main(String[] args) {
        System.out.println(Solution1.mySqrt(2147395600));
        System.out.println(Solution1.sqrtFun(2147395600));
        // Solution1.sqrtTest();
    }
}

class Solution1 {
    public static int mySqrt(long x) {
        int k = 0;
        while (k * k <= x) {
            ++k;
        }
        return (k - 1);
    }

    public static int sqrtFun(int x) {
        return (int) Math.sqrt(x);
    }

    public static void sqrtTest() {
        while (true) {
            int max = 50;
            int min = 100;
            int x = (int) (Math.random() * (max - min + 1) + min);
            System.out.println("x: " + x);
            int res1 = mySqrt(x);
            int res2 = sqrtFun(x);

            if (res1 != res2) {
                System.out.println("Wrong answer:\n res1: " + res1 + "\n res2: " + res2);
                break;
            } else {
                System.out.println("correct:\n res: " + res1);
            }
        }
    }
}

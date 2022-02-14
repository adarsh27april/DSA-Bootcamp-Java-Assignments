package video_lec;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5);
        // fun("Adarsh", "Kumar", "Singh");
        fun();
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    // static void fun(String... v) {
    // System.out.println(Arrays.toString(v));
    // }
}

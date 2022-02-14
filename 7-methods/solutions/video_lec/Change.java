package video_lec;

import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 45, 6 };
        change(arr);
        System.out.println(Arrays.toString(arr));
        // refer notebook for the explanation of the o/p above line
    }

    public static void change(int[] nums) {
        nums[0] = 99;
    }
}

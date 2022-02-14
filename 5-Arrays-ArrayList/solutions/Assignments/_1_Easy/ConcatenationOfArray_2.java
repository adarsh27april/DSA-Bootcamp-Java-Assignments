package Assignments._1_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray_2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("enter elements of arr: ");
        String a = ip.nextLine();
        char ch[] = a.toCharArray();
        for (char c : ch) {
            if (c >= 48 && c <= 57) {
                list.add(Integer.parseInt(String.valueOf(c)));
            }
        }

        int arr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println("Input array is: " + Arrays.toString(arr) + "\n");

        // calling the solution class.
        Solution2 obj = new Solution2();
        obj.getConcatenation(arr);
        // System.out.println("Output: " + Arrays.toString(arr));

        ip.close();
    }
}

class Solution2 {
    public int[] getConcatenation(int[] nums) {
        int arr[] = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            arr[i + nums.length] = nums[i];
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

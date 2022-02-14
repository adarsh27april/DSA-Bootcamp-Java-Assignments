package Assignments._1_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
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

        System.out.println("enter n: ");
        int n = ip.nextInt();

        // calling the solution class.
        Solution5 obj = new Solution5();
        obj.shuffle(arr, n);
        // System.out.println(Arrays.toString(arr));
        // System.out.println("Output: " + Arrays.toString(arr));

        ip.close();
    }

}

class Solution5 {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];
        for (int i = 0, j = -1; i < n; i++) {
            arr[++j] = nums[i];
            arr[++j] = nums[i + n];
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
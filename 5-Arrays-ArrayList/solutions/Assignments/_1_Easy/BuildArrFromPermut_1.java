package Assignments._1_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BuildArrFromPermut_1 {
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
        Solution1 obj = new Solution1();
        arr = obj.buildArray(arr);
        System.out.println("Output: " + Arrays.toString(arr));

        ip.close();
    }
}

// More Solutions needed
class Solution1 {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        System.out.println("Correct soln: " + Arrays.toString(arr));

        return arr;

        // solve it without using an extra space (i.e., O(1) memory)

        // look notebook for why it is not working.
        // for (int i = 0; i < nums.length; i++) {
        // int ind1 = i;
        // int ind2 = nums[i];
        // swap(nums, ind1, ind2);
        // System.out.println("-" + Arrays.toString(nums) + "-");
        // }
        // return nums;
    }

    // public void swap(int[] nums, int ind1, int ind2) {
    // int temp = nums[ind1];
    // nums[ind1] = nums[ind2];
    // nums[ind2] = temp;
    // }
}
// solution class ends

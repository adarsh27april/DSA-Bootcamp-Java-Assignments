package Assignments._1_Easy;

import java.util.ArrayList;
// import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class NumberGoodPairs_7 {
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

        // System.out.println("enter extra Candies: ");
        // int extraCandies = ip.nextInt();

        // calling the solution class.
        Solution7 obj = new Solution7();
        obj.numIdenticalPairs(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println("Output: " + Arrays.toString(arr));

        ip.close();
    }

}

class Solution7 {
    public int numIdenticalPairs(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    cnt++;
            }
        }
        System.out.println(cnt);
        return cnt;
    }
}
package Assignments._1_Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class KidsWithGreatestNumCandies_6 {
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

        System.out.println("enter extra Candies: ");
        int extraCandies = ip.nextInt();

        // calling the solution class.
        Solution6 obj = new Solution6();
        obj.kidsWithCandies(arr, extraCandies);
        // System.out.println(Arrays.toString(arr));
        // System.out.println("Output: " + Arrays.toString(arr));

        ip.close();
    }
}

class Solution6 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max_ele = max(candies);
        for (int i = 0; i < candies.length; i++) {
            if (max_ele <= (extraCandies + candies[i])) {
                list.add(true);
            } else
                list.add(false);
        }
        System.out.println(list);
        return list;
    }

    int max(int arr[]) {
        int x = arr[0];
        for (int item : arr) {
            if (item > x)
                x = item;
        }
        return x;
    }
}
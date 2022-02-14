package Assignments._1_Easy;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;

public class RichestCustomerWealth_4 {
    public static void main(String[] args) {

        int arr1[][] = { { 1, 2, 3 }, { 3, 2, 1 } };
        int arr2[][] = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        int arr3[][] = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };

        // calling the solution class.
        Solution4 obj = new Solution4();
        System.out.println(obj.maximumWealth(arr1));
        System.out.println(obj.maximumWealth(arr2));
        System.out.println(obj.maximumWealth(arr3));
        // obj.maximumWealth(arr2);
        // System.out.println("Output: " + Arrays.toString(arr));

        // ip.close();
    }

}

class Solution4 {
    public int maximumWealth(int[][] accounts) {
        int sum[] = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            sum[i] = sumOfArr(accounts[i]);
        }
        return maxOfArr(sum);

    }

    public int sumOfArr(int arr[]) {
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        return sum;
    }

    public int maxOfArr(int arr[]) {
        int x = arr[0];
        for (int item : arr) {
            if (x < item) {
                x = item;
            }
        }
        return x;
    }
}
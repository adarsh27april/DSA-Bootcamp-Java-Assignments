package Video_lec;

import java.util.Arrays;
import java.util.Scanner;

public class MultiD {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(Arrays.toString(arr));// don't do this for multi-D array
        // for clarity have a look at the implementation of this function.
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        int arr2[][] = new int[3][];

        for (int row = 0; row < 3; row++) {
            System.out.println("enter the size of the row: ");
            // int rowSize = ip.nextInt();
            // arr2[row] = new int[rowSize];
            arr2[row] = new int[ip.nextInt()];
            System.out.println("enter the ele. of row: ");
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = ip.nextInt();
            }
        }
        for (int[] row : arr2) {
            System.out.println(Arrays.toString(row));
        }

        ip.close();
    }
}

package Video_lec;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        // arr1={1,2,3,4,5};// this cann't be done if the array has been created using.
        // the above way.
        for (int i = 1; i <= arr1.length; i++) {
            arr1[i - 1] = i * i;
        }
        System.out.println(Arrays.toString(arr1));

        int arr2[] = {1, 2, 3, 4, 5}; // the C++ way of creating a array in java is also valid.

        for (int item : arr2) {
            System.out.print(item + " ");
        }

        int nums[] = {1, 2, 3, 4, 5};
        change(nums);// since array is non-primitive data type so it's value of the ref will be
                     // passed
        System.out.println("\n" + Arrays.toString(nums));
    }

    static void change(int arr[]) {
        arr[0] = 99;// here the original array is being changed
    }
}

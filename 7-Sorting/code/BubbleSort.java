import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 3, 1, 2 };
        // int arr[] = { 5, 4, 3, 2, 1 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // run steps 0 to n-1 times
            boolean swapped = false;
            for (int j = 1; j <= arr.length - 1 - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
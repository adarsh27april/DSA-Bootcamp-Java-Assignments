package _1_Easy;

public class _10_852_Peak_Index_Mountain_Array {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 3, 2, 0 };
        System.out.println(Solution10.peakIndexInMountainArray(arr));
        System.out.println(Solution10.peakIndexInMountainArray_KunalSoln(arr));
    }
}

class Solution10 {
    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0, n = arr.length, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            }

            if (arr[mid] >= arr[end] && arr[mid] <= arr[mid - 1]) {
                end = mid - 1;

            } else if (arr[mid] <= arr[mid + 1] && arr[mid] >= arr[start]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int peakIndexInMountainArray_KunalSoln(int[] arr) {
        /**
         * ex arr : [1, 2, 3, 5, 6, 4, 3, 2]
         */
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // descending part of arr
                end = mid;

            } else {
                // ascending part of arr
                // arr[mid] < arr[mid+1]
                start = mid + 1;
            }
        }
        return start;
        // at the end start == end == peakElement
    }
}

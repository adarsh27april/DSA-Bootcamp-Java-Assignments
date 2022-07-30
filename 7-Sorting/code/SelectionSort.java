import java.util.Arrays;

public class SelectionSort {
   public static void main(String[] args) {
      int[] arr = { 3, 4, 1, 2, 5 };
      // int[] arr = { 5, 4, 3, 2, 1 };
      SelectionSort(arr);
      System.out.println(Arrays.toString(arr));
   }                       

   static void SelectionSort(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
         // find max item in array & swap it with correct index
         int last = arr.length - 1 - i;
         int maxIndex = getMaxIndex(arr, 0, last);
         swap(arr, maxIndex, last);
      }
   }

   static int getMaxIndex(int[] arr, int start, int end) {
      int maxIndex = start;
      for (int i = start; i <= end; i++) {
         if (arr[maxIndex] < arr[i]) {
            maxIndex = i;
         }
      }
      return maxIndex;
   }

   static void swap(int[] arr, int first, int second) {
      int temp = arr[first];
      arr[first] = arr[second];
      arr[second] = temp;
   }
}

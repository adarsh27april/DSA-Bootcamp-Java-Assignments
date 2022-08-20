import java.util.Arrays;

public class CyclicSort {
   public static void main(String[] args) {
      int[] arr = { 3, 2, 1, 4, 5 };
      int i = 0;
      while (i < arr.length) {
         if (arr[i] != i + 1) {
            swap(arr, i, arr[i] - 1);
         } else {
            ++i;
         }
      }
      System.out.println(Arrays.toString(arr));
   }

   static void swap(int[] arr, int a, int b) {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
   }
}

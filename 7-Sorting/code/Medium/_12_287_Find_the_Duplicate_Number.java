package Medium;

public class _12_287_Find_the_Duplicate_Number {
   public static void main(String[] args) {
      Solution12 ob = new Solution12();
      int[] arr = { 1, 3, 4, 2, 2, };
      System.out.println(ob.findDuplicate(arr));
   }
}

class Solution12 {
   public int findDuplicate(int[] arr) {
      int i = 0;
      while (i < arr.length) {
         if (arr[i] != i + 1) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
               swap(arr, i, correctIndex);
            } else {
               return arr[i];
            }
         } else {
            ++i;
         }
      }
      return -1;
   }

   void swap(int[] arr, int a, int b) {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
   }
}

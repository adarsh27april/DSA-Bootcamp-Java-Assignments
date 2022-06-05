package Video_Lecture;

public class Pivot_Rotated_Sorted_Array_with_Duplicates {
   public static void main(String[] args) {
      // int arr[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1 };
      int arr[] = { 1, 1, 3 };
      System.out.println(findPivot(arr));
   }

   static int findPivot(int[] arr) {
      int start = 0, end = arr.length - 1;
      while (start <= end) {
         int mid = start + (end - start) / 2;

         if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
         }
         if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1;
         }

         /**
          * If arr[start] == arr[mid] == arr[end] then skip the start and end
          */
         if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
            // NOTE : it is possible that the start and the end are pivots

            // before skipping start checking if it is the pivot
            if (start < end && arr[start] > arr[start + 1]) {
               // start < end => to make sure start+1 exists inside array
               return start;// start is not pivot & it's duplicate => skip it
            }
            start++;

            if (end > start && arr[end] < arr[end - 1]) {
               // to make sure end-1 exists inside array
               return end - 1;
            }
            end--;
         }

         else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
            start = mid + 1;

         } else {
            end = mid - 1;
         }
      }

      return -1;// i.e., array doesn't have pivot
   }
}

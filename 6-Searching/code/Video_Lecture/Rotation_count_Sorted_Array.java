package Video_Lecture;

/**
 * GFG
 */
public class Rotation_count_Sorted_Array {
   public static void main(String[] args) {
      int arr[] = { 15, 18, 2, 3, 6, 12 };
      int pivot = findPivot(arr);

      System.out.println(pivot + 1);
   }

   public static int findPivot(int arr[]) {
      int start = 0, end = arr.length;
      while (start <= end) {
         int mid = start + (end - start) / 2;
         if (arr[mid] > arr[mid + 1]) {
            return mid;
         }
         if (arr[mid] < arr[mid - 1]) {
            return mid - 1;
         }

         if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
            if (arr[start] > arr[start + 1]) {
               return start;
            }
            ++start;
            if (arr[end] < arr[end - 1]) {
               return end - 1;
            }
            --end;

         } else if (arr[mid] > arr[start] || (arr[mid] == arr[start] && arr[mid] > arr[end])) {
            start = mid + 1;

         } else {
            end = mid - 1;
         }
      }
      return -1;// arr sorted
   }
}
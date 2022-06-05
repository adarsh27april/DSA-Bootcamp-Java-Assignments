
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution6 {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int ans = -1;
        int peak = peakInMountainArray(mountainArr);
        // if(mountainArr.get(peak) == target){
        //     return peak;
        // }

        int start=0, end=peak;
        ans = orderAgnosticBS(mountainArr, target, start, end, true);// true = isAsc
        
        if(ans == -1){
            start=peak+1;
            end=mountainArr.length()-1;
            ans = orderAgnosticBS(mountainArr, target, start, end, false);
        }
        return ans;

    }

    int peakInMountainArray(MountainArray arr){
        int start = 0, n = arr.length(), end = n - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;

            // if (arr.get(mid) > arr.get(mid + 1) && arr.get(mid) > arr.get(mid - 1)) {
            //     return mid;
            // }

            if (arr.get(mid) > arr.get(mid+1)) {
                end = mid;

            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    int orderAgnosticBS(MountainArray arr, int target, int start, int end, boolean isAsc){
        // int start = 0, end = arr.length() - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr.get(mid) == target){
                return mid;
            }

            if(isAsc){
                if(arr.get(mid) > target){
                    // ..t...m
                    end = mid-1;

                }else{
                    start = mid+1;
                }

            }else{
                if(arr.get(mid) > target){
                    // ..m...t
                    start = mid+1;

                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
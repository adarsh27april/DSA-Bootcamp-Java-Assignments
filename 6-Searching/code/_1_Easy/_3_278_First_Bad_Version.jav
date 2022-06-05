/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); 

ex: 
Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.

*/

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int start = 1, end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid - 1) == false && isBadVersion(mid) == true) {
                return mid;
            }

            if (isBadVersion(mid) == true) {

                /**
                 * `.` is Bad Version
                 * 
                 * [---.---|------]
                 * 
                 **** `|` is mid
                 * 
                 * it could be possible that mid itself is bad version.
                 */

                end = mid;
            }

            else if (isBadVersion(mid) == false) {

                /**
                 * `.` is Bad Version
                 * [------|---.---]
                 * 
                 **** `|` is mid
                 */

                start = mid + 1;
            }

        }
        return -1;
    }
}
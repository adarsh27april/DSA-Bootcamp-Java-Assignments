package _1_Easy;

/**
                             BINARY SEARCH SOLUTION
 */

/**
 * Forward declaration of guess API.
 * 
 * @param num your guess
 * @return -1 if num is lower than the guess number
 *         1 if num is higher than the guess number
 *         otherwise return 0
 *         int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1, end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (guess(mid) == -1) {
                /*
                 * p < mid
                 * 
                 * [---p---|------]
                 * 
                 **** `|` is mid
                 */
                end = mid - 1;
            } else if (guess(mid) == 1) {
                /*
                 * p > mid
                 * 
                 * [------|---p---]
                 * 
                 **** `|` is mid
                 */
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
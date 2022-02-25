package _1_Easy;

public class _7_744_FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char letters[] = { 'c', 'f', 'j' },
                // target = 'a';
                target = 'f';
        System.out.println(Solution7.nextGreatestLetter(letters, target));
    }
}

class Solution7 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if (letters[mid] >= target) {
            if (letters[mid] > target) {
                end = mid - 1;

            } else if (letters[mid] <= target) {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}

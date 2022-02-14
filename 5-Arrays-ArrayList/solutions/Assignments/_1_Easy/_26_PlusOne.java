package Assignments._1_Easy;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _26_PlusOne {
    public static void main(String[] args) {
        Solution26 ob = new Solution26();
        int[] digits = { 9 };
        // int[] digits = { 4, 3, 2, 1 };
        ob.plusOne(digits);
    }
}

class Solution26 {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>(Collections.nCopies(digits.length, 0));
        int carry = 1;
        System.out.println("--" + list);
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.println(i + "--" + list);
            list.set(i, (digits[i] + carry));
            carry = list.get(i) / 10;
            list.set(i, list.get(i) % 10);
        }
        while (carry > 0) {
            list.add(0, carry % 10);
            carry = carry / 10;
        }
        int[] newNum = new int[list.size()];
        int i = 0;
        for (int item : list) {
            newNum[i++] = item;
        }
        System.out.println(Arrays.toString(newNum));
        return newNum;
    }
}
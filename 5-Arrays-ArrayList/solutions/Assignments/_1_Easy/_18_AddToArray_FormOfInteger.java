package Assignments._1_Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _18_AddToArray_FormOfInteger {
    public static void main(String[] args) {
        int[] num = {9, 9, 9};
        Solution18 ob = new Solution18();
        ob.addToArrayForm(num, 1);
    }
}


class Solution18 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        // List<Integer> numList = new ArrayList<>(Collections.nCopies(num.length, 0));
        List<Integer> numList = new ArrayList<>();
        for (int i : num)
            numList.add(i);

        int carry = k;
        for (int i = num.length - 1; i >= 0; i--) {
            numList.set(i, carry + num[i]);
            carry = numList.get(i) / 10;
            numList.set(i, numList.get(i) % 10);
        }
        while (carry != 0) {
            numList.add(0, carry % 10);
            carry = carry / 10;
        }
        System.out.println(numList);
        return numList;
    }
}

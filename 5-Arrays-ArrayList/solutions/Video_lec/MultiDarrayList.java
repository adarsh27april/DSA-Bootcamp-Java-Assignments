package Video_lec;

import java.util.ArrayList;

public class MultiDarrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();// []

        // initialization
        for (int i = 0; i < 4; i++) {
            list.add(new ArrayList<>());// [[], ] in 1st iter., in next iters more arraLists will be added.
            // System.out.println("enter the ele. of row-" + i + " : ");
            for (int j = 0; j <= (i + 4); j++) {
                list.get(i).add(j);
            }
        }

        System.out.println(list);
    }
}

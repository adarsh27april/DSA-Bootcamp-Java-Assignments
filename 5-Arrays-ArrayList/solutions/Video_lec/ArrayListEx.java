package Video_lec;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            list.add(i);
        }
        System.out.println(list);// internally ArrayList is using toString() func. to print the array
        System.out.println(list.contains(11));
        System.out.println(list.contains(1));
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(3));// note that list[ind] will not work.

        list.set(3, 99);
        System.out.println(list);
    }
}

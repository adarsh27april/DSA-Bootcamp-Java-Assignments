package Assignments._1_Easy;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CountItemsMatchingRule_11 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        List<List<String>> items = new ArrayList<>();
        System.out.println("enter the num. of items in list: ");
        int n = ip.nextInt();
        System.out.println("enter `items` : ");
        for (int i = 0; i < n; i++) {
            items.add(new ArrayList<>());
            String type = ip.next();
            String color = ip.next();
            String name = ip.next();
            items.get(i).add(type);
            items.get(i).add(color);
            items.get(i).add(name);
        }
        String ruleKey = ip.next();
        String ruleValue = ip.next();

        System.out.println("=======");
        for (int i = 0; i < n; i++) {
            System.out.println(items.get(i));
        }
        System.out.println("--" + ruleKey);
        System.out.println("--" + ruleValue);
        System.out.println("=======");

        Solution11 obj = new Solution11();
        obj.countMatches(items, ruleKey, ruleValue);

        ip.close();
    }
}

class Solution11 {
    public int countMatches(List<List<String>> items,
            String ruleKey, String ruleValue) {
        int n = items.size(), count = 0;

        for (int i = 0; i < n; i++) {
            if (ruleKey.equals("type")) {
                if (items.get(i).get(0).equals(ruleValue)) {
                    count++;
                }
            } else if (ruleKey.endsWith("color")) {
                if (items.get(i).get(1).equals(ruleValue)) {
                    count++;
                }
            } else if (ruleKey.equals("name")) {
                if (items.get(i).get(2).equals(ruleValue)) {
                    count++;
                }
            }

        }
        System.out.println(count);
        return count;
    }
}
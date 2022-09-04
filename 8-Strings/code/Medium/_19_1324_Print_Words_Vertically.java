package Medium;

import java.util.ArrayList;
import java.util.List;

public class _19_1324_Print_Words_Vertically {
   public static void main(String[] args) {
      Solution19 ob = new Solution19();
      // List<String> l = ob.printVertically("HOW ARE YOU");
      List<String> l = ob.printVertically("TO BE OR NOT TO BE");
      System.out.println(l);
   }
}

class Solution19 {
   public List<String> printVertically(String s) {
      List<String> list = new ArrayList<>();
      String str[] = s.split(" ");

      int maxLength = 0;
      for (String word : str) {
         if (word.length() > maxLength) {
            maxLength = word.length();
         }
      }
      for (int i = 0; i < maxLength; i++) {
         StringBuilder a = new StringBuilder();
         for (int j = 0; j < str.length; j++) {
            if (i < str[j].length()) {
               a.append(str[j].charAt(i));
            } else {
               a.append(" ");
            }
         }
         list.add(a.toString().stripTrailing());
      }
      return list;
   }
}
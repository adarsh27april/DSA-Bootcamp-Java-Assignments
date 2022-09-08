package Medium;

import java.util.ArrayList;
import java.util.List;

public class _18_1023_Camelcase_Matching {
   public static void main(String[] args) {
      Solution18 ob = new Solution18();
      List<Boolean> list = ob.camelMatch(
            new String[] {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"},
            "FrBu");
      System.out.println(list);

   }
}


class Solution18 {
   public List<Boolean> camelMatch(String[] queries, String pattern) {
      List<Boolean> list = new ArrayList<>();
      char[] patternArr = pattern.toCharArray();
      for (int i = 0; i < queries.length; i++) {
         boolean ans = matchPattern(patternArr, queries[i].toCharArray());
         list.add(ans);
      }
      return list;
   }

   public boolean matchPattern(char[] patternArr, char[] queryArr) {

      int x = 0;// patternCounter
      for (int i = 0; i < queryArr.length; i++) {
         if (patternArr.length > x && patternArr[x] == queryArr[i]) {
            x++;

         } else if (queryArr[i] >= 'A' && queryArr[i] <= 'Z') {
            return false;
         }
      }

      if (x == patternArr.length) {
         return true;
      }

      return false;
   }
}


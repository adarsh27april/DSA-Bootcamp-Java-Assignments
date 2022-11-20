package Assignments._1_Easy;

import java.util.*;

public class _10_1832_Check_if_theSentenceIsPangram {
   public static void main(String[] args) {
      Solution10 ob = new Solution10();
      boolean a = ob.checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
      System.out.println(a);
   }
}


class Solution10 {
   public boolean checkIfPangram(String sentence) {

      Set<Character> set = new HashSet<>();
      for (int i = 0; i < sentence.length(); i++) {
         set.add(sentence.charAt(i));
      }
      if (set.size() == 26)
         return true;
      return false;
   }
}

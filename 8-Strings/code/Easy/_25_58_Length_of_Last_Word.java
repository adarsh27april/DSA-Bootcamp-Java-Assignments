package Easy;

public class _25_58_Length_of_Last_Word {
   public static void main(String[] args) {
      Solution25 ob = new Solution25();
      System.out.println(ob.lengthOfLastWord("   day"));
   }
}


class Solution25 {
   public int lengthOfLastWord(String s) {
      // String[] str = s.split(" ");
      // return str[str.length-1].length();
      // 20%

      // 100%
      if (s.length() > 1)
         s = s.trim();

      if (s.length() == 1 && s.charAt(0) != ' ') {
         return 1;
      }

      int c = 1, i = s.length() - 1;
      char ch = s.charAt(s.length() - 1);
      while (i >= 0) {
         ch = s.charAt(i);
         if (ch == ' ') {
            return c;
         } else {
            ++c;
         }
         --i;
      }
      return c;
   }
}

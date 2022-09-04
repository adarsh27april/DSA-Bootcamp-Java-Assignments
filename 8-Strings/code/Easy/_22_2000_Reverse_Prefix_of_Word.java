package Easy;

public class _22_2000_Reverse_Prefix_of_Word {
   public static void main(String[] args) {
      Solution22 ob = new Solution22();
      String s = ob.reversePrefix("abcdefd", 'd');
      System.out.println(s);
   }
}

class Solution22 {
   public String reversePrefix(String word, char ch) {
      int x = word.indexOf(ch);
      StringBuilder s = new StringBuilder();
      for (int i = x; i >= 0; i--) {
         s.append(word.charAt(i));
      }
      if (x == word.length()) {
         return s.toString();
      }
      for (int i = x + 1; i < word.length(); i++) {
         s.append(word.charAt(i));
      }
      return s.toString();
   }
}

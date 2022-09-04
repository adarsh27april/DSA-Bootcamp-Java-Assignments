package Easy;

public class _21_1768_Merge_Strings_Alternately {
   public static void main(String[] args) {
      Solution21 ob = new Solution21();
      System.out.println(ob.merge("as", "qwer"));
   }
}

class Solution21 {
   public String merge(String str1, String str2) {
      StringBuilder str = new StringBuilder();
      int i = 0;
      int run = Math.min(str1.length(), str2.length());
      while (i < run) {
         str.append(str1.charAt(i));
         str.append(str2.charAt(i));
         ++i;
      }
      if (str1.length() > str2.length()) {
         while (i < str1.length()) {
            str.append(str1.charAt(i));
            ++i;
         }
      } else {
         while (i < str2.length()) {
            str.append(str2.charAt(i));
            ++i;
         }
      }
      return str.toString();
   }
}
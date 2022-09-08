package Medium;

public class _17_1545_Find_Kth_Bit_in_Nth_Binary_String {
   public static void main(String[] args) {
      Solution17 ob = new Solution17();
      System.out.println(ob.findKthBit_naive(3, 1));
   }
}


class Solution17 {
   public char findKthBit_naive(int n, int k) {

      String s[] = new String[n + 1];
      s[1] = "0";
      for (int i = 2; i < n + 1; i++) {
         s[i] = s[i - 1] + "1" + reverse(invert(s[i - 1]));
      }

      return s[n].charAt(k - 1);
   }

   public String reverse(String s) {

      StringBuilder sb = new StringBuilder("");
      for (int i = s.length() - 1; i >= 0; i--) {
         sb.append(s.charAt(i));
      }

      return sb.toString();
   }

   public String invert(String s) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
         sb.append(s.charAt(i) == '1' ? "0" : "1");
      }
      return sb.toString();
   }


   public char findKthBit(int n, int k) {

      String s[] = new String[n + 1];
      s[1] = "0";
      for (int i = 2; i < n + 1; i++) {
         s[i] = s[i - 1] + "1" + reverse_invert(s[i - 1]);
      }

      return s[n].charAt(k - 1);
   }

   public String reverse_invert(String s) {
      StringBuilder sb = new StringBuilder();
      for (int i = s.length() - 1; i >= 0; i--) {
         sb.append(s.charAt(i));
      }
      StringBuilder sb2 = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
         sb2.append(sb.charAt(i) == '1' ? "0" : "1");
      }
      return sb2.toString();
   }
}

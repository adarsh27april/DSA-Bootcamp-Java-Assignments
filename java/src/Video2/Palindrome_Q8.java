package Video2;

import java.util.Scanner;

public class Palindrome_Q8 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str1 = ip.next();
        int n = str1.length();
        char ch[] = new char[n];
        for (int i = 0; i < n; i++) {
            ch[i] = str1.charAt(n - i - 1);
        }
        /* Char array to string */
        String str2 = String.valueOf(ch);
        System.out.println((str1.equals(str2)) ? ("palindrome") : ("not palindrome"));
        ip.close();
    }
}

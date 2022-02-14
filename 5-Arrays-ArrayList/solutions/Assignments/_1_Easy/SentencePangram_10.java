package Assignments._1_Easy;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Arrays;
import java.util.Scanner;

public class SentencePangram_10 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("enter sentence: ");
        String a = ip.next();
        Solution10 obj = new Solution10();
        obj.checkIfPangram(a);

        ip.close();
    }

}

class Solution10 {
    public boolean checkIfPangram(String sentence) {
        char alphabet[] = new char[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabet[i++] = ch;
        }
        boolean found = false;
        for (i = 0; i < alphabet.length; i++) {
            found = false;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == alphabet[i]) {
                    found = true;
                    break;
                }
            }
            if (found == false)
                break;
        }
        System.out.println(found);
        return found;
    }
}

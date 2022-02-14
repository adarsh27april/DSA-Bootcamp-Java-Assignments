package Video2;

import java.util.Scanner;

public class Largest_Q5 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        System.out.println((a > b) ? a : b);
        ip.close();
    }
}

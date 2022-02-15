package Assignments;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        System.out.println(isprime(n));
        ip.close();
    }

    static boolean isprime(int n) {
        // int original = n;

        if (n <= 1)
            return false;
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;

    }
}

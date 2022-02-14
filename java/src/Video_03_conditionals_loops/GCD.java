package Video_03_conditionals_loops;

import java.util.Scanner;

/** GCD == HCF */
public class GCD {
    public static long gcd(long a, long b) {

        if (b == 1)
            return b;
        else if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static long large_num(long p, long q) {
        if (p > q)
            return gcd(p, q);
        return gcd(q, p);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("enter a: ");
        long a = ip.nextInt();
        System.out.println("enter b: ");
        long b = ip.nextInt();
        System.out.println("gcd is: " + large_num(a, b));
        ip.close();
    }
}

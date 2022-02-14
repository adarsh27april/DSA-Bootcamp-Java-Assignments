package Video_03_conditionals_loops;

import java.util.Scanner;

public class nCr__nPr {
    public static long factorial(int a) {
        if (a == 1)
            return 1;
        return a * factorial(a - 1);
    }

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.println("enter n, enter r");
        int n = ip.nextInt();
        int r = ip.nextInt();

        System.out.println("nCr : " + factorial(n) / ((factorial(n - r) * factorial(r))));
        System.out.println("nPr : " + factorial(n) / factorial(r));

        ip.close();

    }
}

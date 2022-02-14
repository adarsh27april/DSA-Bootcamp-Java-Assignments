package Video2;

import java.util.Scanner;

public class Armstrong {
    public static void armstrong(int n) {
        int a = n / 100;
        int b = (n % 100) / 10;
        int c = (n % 100) % 10;

        if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == n) {
            System.out.println("Armstrong Num = " + n);
        }
        // return;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int f = ip.nextInt();
        int l = ip.nextInt();

        for (int i = f; i < l; i++) {
            armstrong(i);
        }
        ip.close();
    }
}

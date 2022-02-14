package Video_03_conditionals_loops;

import java.util.Scanner;
// import Video_03_conditionals_loops.GCD;

public class LCM {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("enter a");
        long a = ip.nextInt();
        System.out.println("enter b");
        long b = ip.nextInt();
        long hcf = GCD.large_num(a, b);
        System.out.println("hcf: " + hcf);

        /**
         * ---- LCM(a, b) * HCF(a, b) == a * b ---- *
         */
        System.out.println("LCM: " + (a * b) / hcf);

        ip.close();
    }
}

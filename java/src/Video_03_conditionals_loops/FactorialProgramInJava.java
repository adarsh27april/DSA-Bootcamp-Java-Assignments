package Video_03_conditionals_loops;

import java.util.Scanner;

public class FactorialProgramInJava {
    public static long factorial(int a) {
        if (a == 1)
            return 1;
        return a * factorial(a - 1);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        long fac = factorial(a);
        System.out.println("factorial is: " + fac);

        ip.close();
    }
}

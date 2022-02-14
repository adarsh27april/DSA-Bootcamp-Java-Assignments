package Video_03_conditionals_loops;

import java.util.Scanner;

public class PowerInJava {
    public static double power(double a, int b) {
        double res = 1;
        for (int i = 1; i <= b; i++) {
            res *= a;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("enter the number: ");
        double a = ip.nextDouble();
        System.out.println("enter the power");
        int b = ip.nextInt();
        System.out.println(a + "^" + b + " = " + power(a, b));
        ip.close();
    }
}

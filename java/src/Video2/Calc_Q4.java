package Video2;

import java.util.Scanner;

public class Calc_Q4 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double n1 = ip.nextDouble();
        double n2 = ip.nextDouble();

        char op = ip.next().charAt(0); // inputing a char
        if (op == '+') {
            System.out.println(n1 + n2);
        } else if (op == '-') {
            System.out.println(n1 - n2);
        } else if (op == '*') {
            System.out.println(n1 * n2);
        } else if (op == '/') {
            System.out.println(n1 / n2);
        }

        ip.close();
    }
}

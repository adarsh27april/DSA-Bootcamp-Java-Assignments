package Video2;

import java.util.Scanner;

public class SimpleIntrest_Q3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double p = ip.nextDouble();
        double r = ip.nextDouble();
        double t = ip.nextDouble();
        System.out.println("SI is: " + p * r * t / 100);
        ip.close();
    }
}

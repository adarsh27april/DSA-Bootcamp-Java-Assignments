package Video2;

import java.util.Scanner;

public class Greet_Q2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String name = ip.next();
        System.out.println("Hello " + name + ", Welcome");
        ip.close();
    }
}

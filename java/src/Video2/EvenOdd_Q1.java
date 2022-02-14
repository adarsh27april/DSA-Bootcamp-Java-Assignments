package Video2;

import java.util.Scanner;

public class EvenOdd_Q1 {
    // public void Even_Odd() {
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        ip.close();
    }
}

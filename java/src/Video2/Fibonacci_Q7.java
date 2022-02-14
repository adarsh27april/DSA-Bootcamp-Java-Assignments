package Video2;

import java.util.Scanner;

public class Fibonacci_Q7 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] FibArr = new int[n]; // declaring an array of size n and type n.
        FibArr[0] = 1;
        FibArr[1] = 1;
        for (int i = 2; i < n; i++) {
            //
            FibArr[i] = FibArr[i - 1] + FibArr[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(FibArr[i] + " ");
        }
        System.out.println();

        ip.close();
    }
}

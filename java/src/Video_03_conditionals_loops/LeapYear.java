package Video_03_conditionals_loops;

import java.util.Scanner;

public class LeapYear {
    public static void leapYear(int year) {
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("enter year");
        int year = ip.nextInt();
        leapYear(year);
        ip.close();
    }
}

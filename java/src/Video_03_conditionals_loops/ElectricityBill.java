package Video_03_conditionals_loops;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("enter the initial meter reading in kWh");
        double start = ip.nextDouble();
        System.out.println("enter the final meter reading in kWh");
        double end = ip.nextDouble();
        System.out.println("enter the cost per unit of meter");
        double perUnitCost = ip.nextDouble();
        System.out.println("total cost : " + (end - start) * perUnitCost);
        ip.close();
    }
}

import java.util.Scanner;

class _2_first_java {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("hello world");
        _2_first_java obj = new _2_first_java();
        // obj.evenOdd(ip);
        // obj.greet(ip);
        // obj.fibonacciUpto_n(ip);
        obj.armstrongBwTwoNums(ip);

        ip.close();
    }

    public void evenOdd(Scanner ip) {
        int x;
        System.out.println("enter num : ");
        x = ip.nextInt();
        System.out.println(x % 2 == 0);
    }

    public void greet(Scanner ip) {
        System.out.println("enter name : ");
        System.out.printf("greetings %S\n", ip.next());
    }

    public void fibonacciUpto_n(Scanner ip) {
        System.out.println("enter n : ");
        int n = ip.nextInt();
        int a = 0, b = 1;
        System.out.printf("%d ", a);
        if (n == 0)
            return;
        else if (n == 1) {
            System.out.printf("%d ", b);
            return;
        } else {
            for (int i = 2; i <= n; i++) {
                int t;
                t = a;
                a = a + b;
                b = t;
                System.out.printf("%d ",a);
            }
            System.out.println();
        }
    }

    /**
     * Narsisist or Armstrong num, : k-> num of digits, then if sum of Math.pow(each_digit, k) == num
     * in general we consider k = 3
     * Armstrong numbers lie b/w 100 & 999
     */
    public void armstrongBwTwoNums(Scanner ip){
        System.out.println("Enter the two numbers : ");
        int a= ip.nextInt(), b = ip.nextInt();
        for (int i = a; i <=b; i++) {
            if(isArmstrong(i))
            System.out.printf("%d is armstrong\n", i);
        }
    }

    public boolean isArmstrong(int num){
        int sum=0, n = num;
        while(n>0){
            int digit = n%10;
            sum+= Math.pow(digit, 3);
            n = n/10;
        }
        return sum==num;
    }
}

//_22_1281_Subtract_Product_Sum_of_Digits_of_Int

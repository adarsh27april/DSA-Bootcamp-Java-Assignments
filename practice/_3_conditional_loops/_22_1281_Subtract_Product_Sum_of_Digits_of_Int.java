package _3_conditional_loops;

public class _22_1281_Subtract_Product_Sum_of_Digits_of_Int {
    public static void main(String[] args) {
        _22_1281_Subtract_Product_Sum_of_Digits_of_Int ob = new _22_1281_Subtract_Product_Sum_of_Digits_of_Int();
        System.out.println(ob.subtractProductAndSum(243));
    }

    public int subtractProductAndSum(int n) {
        int prod = 1, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            prod *= digit;
            sum += digit;
            n = n / 10;
        }
        return prod - sum;
    }
}

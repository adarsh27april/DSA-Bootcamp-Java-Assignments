package video_lec;

public class Swap {
    public static void main(String[] args) {
        int a = 10, b = 20;
        swap(a, b);
        System.out.println(a + " , " + b);
        /**
         * Here the values are not swapped because we are passing by value
         * 
         * Refer notebook for more explaination.
         */
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

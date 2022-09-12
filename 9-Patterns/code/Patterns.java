public class Patterns {
   public static void main(String[] args) {
      // p5(5);
      // p3(5);
   }

   static void p3(int n) {
      for (int i = 1; i <= n; i++) {
         for (int j = n; j >= i; j--) {
            System.out.print("* ");
         }
         System.out.println();
      }
   }

   static void p5(int n) {
      for (int row = 0; row < 2 * n - 1; row++) {
         int totalColInRow = 797997;
         if (row <= n) {
            totalColInRow = row;

         } else {
            totalColInRow = 2 * n - 1 - row;
         }
         /*
          * Thumb rule : 1. run outer loop 2. figure out num of times sol need to be print and print
          * col.
          */
         for (int col = 0; col < totalColInRow; col++) {
            System.out.print("* ");
         }
         System.out.println();
      }
   }

   // private static void p6(int n) {
   // for (int i = 0; i < n; i++) {
   // for (int j = n - 1; j >= 0; j--) {
   // if (j > n - i - 1) {
   // System.out.print(" *");
   // }
   // }
   // System.out.println();
   // }
   // }

   // static void p13(int n) {
   // for (int i = 1; i <= n; i++) {
   // for (int j = 0; j <= 2 * n - 1; j++) {
   // // if()e
   // }
   // }
   // }
}


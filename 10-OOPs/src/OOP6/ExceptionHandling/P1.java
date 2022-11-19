package OOP6.ExceptionHandling;

public class P1 {
   public static void main(String[] args) {
      int a = 5;
      int b = 0;

      try {
         // int c = a / b; // Arithmetic Exception (/ by Zero )
         // System.out.println(c);

         divide(a, b);

      } catch (ArithmeticException e) {
         // the exception thrown is catched here

         System.out.println("Exception Catched :\n" + e.getMessage());
      } catch (Exception e) {
         // the exception thrown is catched here

         System.out.println("Exception Catched :\n" + e.getMessage());
      } finally {
         System.out.println("this will always execute, doesn't matter if error is thrown or not thrown");
      }
   }

   static int divide(int a, int b) throws ArithmeticException {
      // here we have to explicity declare the exception
      if (b == 0) {
         // here we are explicitly throwing an exception
         throw new ArithmeticException("please do not divide by 0");
         // here constructor of ArithmeticException is called when throwing
      }
      return a / b;
   }
}

package OOP6.ExceptionHandling;

public class P2 {
   public static void main(String[] args) {
      try {
         String name = "Adarsh";
         if (name == "Adarsh") {
            throw new CustomException("--Custom Exception--");
         }

      } catch (CustomException e) {
         System.out.println(e.getMessage());
      }
   }
}

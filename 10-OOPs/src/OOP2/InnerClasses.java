package OOP2;

public class InnerClasses {

   static class Test {
      String name;

      public Test(String name) {
         this.name = name;
      }
   }

   public static void main(String[] args) {
      Test ob1 = new Test("Adarsh");
      Test ob2 = new Test("Kumar");

      System.out.println(ob1.name);
      System.out.println(ob2.name);
   }
}

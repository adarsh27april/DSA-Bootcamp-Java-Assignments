package OOP2;

public class StaticBlock {
   static int a = 4;
   static int b;

   static {
      System.out.println("I'm in static block");
      b = 20;
   }

   public static void main(String[] args) {
      StaticBlock ob1 = new StaticBlock();
      System.out.println(StaticBlock.a + " " + StaticBlock.b);

      // ob1.b += 3;// Error : The static field StaticBlock.b should be accessed in a
      // static way
      StaticBlock.b += 3;

      System.out.println(StaticBlock.a + " " + StaticBlock.b);

      StaticBlock ob2 = new StaticBlock();
      System.out.println(StaticBlock.a + " " + StaticBlock.b);
      System.out.println(ob1);
      System.out.println(ob2);

   }
}

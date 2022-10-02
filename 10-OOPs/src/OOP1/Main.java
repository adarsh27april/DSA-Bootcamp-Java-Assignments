package OOP1;

class Base {
   Base() {
      System.out.println("Inside Base Class");
   }
}

class Derived extends Base {
   Derived() {
      System.out.println("This is Derived Class");
   }
}

public class Main {
   public static void main(String[] args) {
      Derived d = new Derived();
   }
}

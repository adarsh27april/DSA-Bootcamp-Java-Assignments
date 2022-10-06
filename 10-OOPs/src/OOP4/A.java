package OOP4;

public class A {
   protected int num;
   String name;
   int[] arr;

   public A() {
   }

   public A(int num, String name) {
      this.num = num;
      this.name = name;
      this.arr = new int[num];
   }

   public int getNum() {
      return num;
   }

}

// public class B extends A {}
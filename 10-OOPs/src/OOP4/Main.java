package OOP4;

public class Main {
   public static void main(String[] args) {
      A obj = new A(34, "Kunal");
      // obj.num; // error for this.
      obj.getNum();
      int x = obj.num;
   }
}

package OOP3.Inheritance;

public class App {
   public static void main(String[] args) {
      Box box1 = new Box();
      System.out.println(box1.l + " " + " " + box1.w + " " + box1.h);

      BoxWeight bw = new BoxWeight();
      System.out.println(bw.weight + " " + bw.l + " " + " " + bw.w + " " + bw.h);

      Box ob1 = new BoxWeight(5.0, 10);

      BoxPrice ob2 = new BoxPrice(5.0, 10, 200);
      System.out.println(ob2);
   }
}

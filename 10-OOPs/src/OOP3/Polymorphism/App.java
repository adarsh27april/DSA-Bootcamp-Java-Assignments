package OOP3.Polymorphism;

public class App {
   public static void main(String[] args) {
      Shapes o1 = new Shapes();
      Shapes o2 = new Circle();
      Shapes o3 = new Square();

      o1.area();
      o2.area();
      o3.area();

   }
}

package OOP3.Polymorphism;

public class Circle extends Shapes {

   @Override // this annotation is a kind of check that the method below is overridden
   void area() {
      System.out.println("area of circle is :  * r * r");
   }
}

package OOP2;

public class Singleton {

   private Singleton() {

   }

   @Override // overriding the default toString function for printing the object
   public String toString() {
      return "This is Singleton Class";
   }

   private static Singleton instance;// it is static so we don't need to create an object

   public static Singleton getInstance() {
      if (instance == null) {
         instance = new Singleton();
      }
      return instance;
   }
}

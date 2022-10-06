package OOP4;

public class ObjectDemo {

   int roll;

   public ObjectDemo(int roll, float gpa) {
      this.roll = roll;
   }

   @Override
   public int hashCode() {
      // TODO Auto-generated method stub
      // hashCode is not the address of the object
      return super.hashCode();
      // it gives the number representaion of an object
   }

   @Override
   public boolean equals(Object obj) {
      // TODO Auto-generated method stub
      // return super.equals(obj);

      return this.roll == ((ObjectDemo) obj).roll;
      // -------------------- ^ type casting to different type of Object
   }

   @Override
   protected Object clone() throws CloneNotSupportedException {
      // TODO Auto-generated method stub
      return super.clone();
   }

   @Override
   public String toString() {
      // TODO Auto-generated method stub
      return super.toString();
   }

   @Override
   protected void finalize() throws Throwable {
      // TODO Auto-generated method stub
      super.finalize();
   }

   public static void main(String[] args) {
      ObjectDemo ob1 = new ObjectDemo(5, 7.55f);
      ObjectDemo ob2 = new ObjectDemo(22, 7.8f);

      if (ob1 == ob2) {
         /**
          * here is will be checked if both the vars ob1 & ob2 point to the same object.
          */
         System.out.println("ob1 == ob2");
      } else {
         System.out.println("ob1 != ob2");
      }

      if (ob1.equals(ob2)) {
         /**
          * here it is just a function which can be overloaded to compare whatever we
          * want
          */
         System.out.println("ob1 equals ob2");
      } else {
         System.out.println("ob1 not equals ob2");
      }

      /**
       * instanceof method
       */

      System.out.println("ob1 instanceof ObjectDemo : " + (ob1 instanceof ObjectDemo));
      System.out.println("ob1 instanceof Object : " + (ob1 instanceof Object));

      /**
       * getClass() method to get some data about the class
       * it is final method
       * the information obj1.getClass() is stored in a HEAP
       */

      System.out.println(ob1.getClass());
      System.out.println(ob1.getClass().getName());

   }
}

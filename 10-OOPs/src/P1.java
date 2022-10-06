import OOP4.A;

class Student {
   int roll;
   String name;
   float salary;

   Student(int roll, String name, float salary) {
      this.roll = roll;
      this.name = name;
      this.salary = salary;
   }

   Student(Student o1) {
      this.roll = o1.roll;
      this.name = o1.name;
      this.salary = o1.salary;
   }
}

public class P1 extends A {
   public P1() {
      super();
   }

   public static void main(String[] args) {
      Student s1 = new Student(5, "Adarsh", 12000);
      System.out.println(s1);

      A obA = new A(5, "Adarsh");
      // int x = obA.num;

      P1 ob_P1 = new P1();
      // ob_P1.num;
   }
}

class P2 extends P1 {
   public P2() {
      super();
   }

   public static void main(String[] args) {
      P2 ob2 = new P2();
      // ob2.num;
   }
}
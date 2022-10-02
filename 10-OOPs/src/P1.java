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

public class P1 {
   public static void main(String[] args) {
      Student s1 = new Student(5, "Adarsh", 12000);
      System.out.println(s1);
   }
}

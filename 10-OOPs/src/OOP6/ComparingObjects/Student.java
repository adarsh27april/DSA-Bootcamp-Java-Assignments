package OOP6.ComparingObjects;

public class Student implements Comparable<Student> {
   int roll;
   float marks;

   public Student(int roll, float marks) {
      this.roll = roll;
      this.marks = marks;
   }

   @Override
   public int compareTo(Student o) {
      int diff = (int) (this.marks - o.marks);
      /**
       * diff == 0 : both have same marks
       * diff < 0 : o is bigger
       * diff > 0 : o is smaller
       */
      return diff;
   }

   @Override
   public String toString() {

      return "" + this.marks;
      // return "r: " + this.roll + " m: " + this.marks;
   }
}

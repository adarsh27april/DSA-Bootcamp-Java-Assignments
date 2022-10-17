package OOP6.ComparingObjects;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
   public static void main(String[] args) {
      Student adarsh = new Student(5, 75.5f);
      Student kushagra = new Student(65, 77.7f);
      Student abhishek = new Student(3, 74.4f);
      Student vikash = new Student(138, 83.0f);
      Student pratik = new Student(94, 70.0f);

      Student list[] = { adarsh, kushagra, abhishek, vikash, pratik };

      // Arrays.sort(list);
      // Arrays.sort(list, new Comparator<Student>() {

      // @Override
      // public int compare(Student o1, Student o2) {
      // // think of it as
      // // calling o1.compareTo(o2)
      // // or
      // // o1 - o2
      // return (int) (o1.marks - o2.marks);
      // // to sort in reverse order use
      // // -(int)(o1.marks - o2.marks)
      // }

      // });

      // using lambda expression
      Arrays.sort(list,
            (o1, o2) -> -(int) (o1.marks - o2.marks));

      System.out.println(Arrays.toString(list));
      // the sort method of Arrays class uses compareTo method to compare any two
      // elements of the List

      // if (adarsh.compareTo(kushagra) < 0) {
      // /**
      // * Now whenever we will be doing this
      // * then it will be calling the `compareTo` method and checking it's return
      // value
      // */
      // // for comparing such things we need to implement Comparable in our class
      // System.out.println("Kushagra has more marks than Adarsh");
      // }
   }
}

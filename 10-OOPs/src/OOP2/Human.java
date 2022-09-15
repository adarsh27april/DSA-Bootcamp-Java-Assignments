package OOP2;

public class Human {
   int age;
   String name;
   boolean married;
   String gender;

   static long population;

   Human(int age, String name, boolean married, String gender) {
      this.age = age;
      this.name = name;
      this.married = married;
      this.gender = gender;

      Human.population++;
   }
}

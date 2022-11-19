```java

public class CustomArrayList {

   private int[] data;
   private static int DEFAULT_SIZE = 10;
   private int size = 0;// size is also working as index value;
   // here size is fooling us, here size = no. of data present in the arr.

   public CustomArrayList() {
      this.data = new int[DEFAULT_SIZE];
   }

   public void add(int num) {
      if (isFull()) {
         resize();
      }
      this.data[size++] = num;
   }

   public boolean isFull() {
      return size == data.length;
   }

   private void resize() {
      /*
       * this function will remain private since we don't want it to be called by the
       * outside world
       */
      int[] temp = new int[data.length * 2];
      // copy the current items in new array;
      for (int i = 0; i < data.length; i++) {
         temp[i] = data[i];
         data = temp;
      }
   }

   public int remove() {
      int removed = data[--size];
      return removed;
      /**
       * here we are not actually deleting the element from the array but instead we
       * are just --size
       * so if we try to add some element then it will ovverride the elemetn at
       * index==size
       */
   }

   public int size() {
      return size;
   }

   public int get(int index) {
      return data[index];
   }

   public void set(int index, int num) {
      data[index] = num;
   }

   @Override
   public String toString() {
      // TODO Auto-generated method stub
      return "Custom ArrayList \ndata: { " + Arrays.toString(data) + " }\nsize : " + size;
   }
}

```


# Using Generics

```java
package OOP6.Generics;

import java.util.Arrays;

public class CusomGenericArrayList<T> {

   private Object[] data;
   /**
    * Since Object type is parent of all the Wrapper Classes as well
    * so we can use Object type array to store any other type like int, char, etc.
    */
   private static int DEFAULT_SIZE = 10;
   private int size = 0;

   public CusomGenericArrayList() {
      this.data = new Object[DEFAULT_SIZE];
   }

   public void add(T num) {
      if (isFull()) {
         resize();
      }
      this.data[size++] = num;
   }

   public boolean isFull() {
      return size == data.length;
   }

   private void resize() {

      Object[] temp = new Object[data.length * 2];
      for (int i = 0; i < data.length; i++) {
         temp[i] = data[i];
         data = temp;
      }
   }

   public T remove() {
      T removed = (T) (data[--size]);
      /**
       * Type casting from Object type to T type
       * i.e., from a less restriceive type (Object) to a more restrictive type (T)
       */
      return removed;
   }

   public int size() {
      return size;
   }

   public T get(int index) {
      return (T) (data[index]);
   }

   public void set(int index, T num) {
      data[index] = num;
   }

   @Override
   public String toString() {
      return "Custom ArrayList \ndata: { " + Arrays.toString(data) + " }\nsize : "
            + size;
      // String ans = "[";
      // System.out.print("[");
      // for (int i = 0; i < size; i++) {
      // System.out.print(data[i] + ", ");
      // }
      // System.out.print("]");
   }

   public static void main(String[] args) {
      CusomGenericArrayList<Integer> list1 = new CusomGenericArrayList<>();
      list1.add(20);
      list1.add(22);
      list1.add(23);
      list1.add(55);
      list1.remove();

      System.out.println(list1);
   }

}
```


# Using Wild Cards

for making the Generics more restrictive

```java
Wildcard Example

...
/**
 * Now, here since T is extending Number class so only Number and it's subclasses can
 * be used
 */
public class CusomGenericArrayList<T extends Number> {

   private Object[] data;
   
   private static int DEFAULT_SIZE = 10;
   private int size = 0;

   public CusomGenericArrayList() {
      this.data = new Object[DEFAULT_SIZE];
   }
   ...
   ...
   ...

   public static void main(String[] args) {
      ...
   }

}
```


```java
public void getList(List<Number> list){
   //do something
}
```
Here we can only pass Number type. If we pass it's subclasses then it'll give an error

```java
public void getList(List<? extends Number> list){
   //do something
}
```
<a>Now Here if we can pass both Number type and it's child-classes type</a>


# Generic Interface

`GenInt.java`
```java
package OOP6.GenericInterfaces;

public interface GenInt<T> {
   public void display(T value);
}
```

`Main.java`
```java
package OOP6.GenericInterfaces;
public class Main implements GenInt<Integer> {
   @Override
   public void display(Integer value) {
      // TODO Auto-generated method stub
      System.out.println(value);
   }
}
```

# Comparing Objects
## using Comparable interface

Comparable Interface is a `generic interface` which has `compareTo` method declared in it so we just have to define it when we are implementing it

```java
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
```

`Main.java`
```java
public class Main {
   public static void main(String[] args) {
      Student A = new Student(5, 75.5f);
      Student B = new Student(65, 77.7f);

      if (A.compareTo(B) < 0) {
         // for comparing such things we need to implement Comparable in our class
         System.out.println("B has more marks than A");
      }
   }
}
```

## Using Comparator in sorting using built-in methods

Using the `compareTo` method defined in the `Student` class only

```java
...
public class Main {
   public static void main(String[] args) {
      Student adarsh = new Student(5, 75.5f);
      Student kushagra = new Student(65, 77.7f);
      Student abhishek = new Student(3, 74.4f);
      Student vikash = new Student(138, 83.0f);
      Student pratik = new Student(94, 70.0f);

      Student list[] = { adarsh, kushagra, abhishek, vikash, pratik };

      Arrays.sort(list);
      System.out.println(Arrays.toString(list));
      // the sort method of Arrays class uses compareTo method to compare any two elements of the List
   }
}
O/P : [70.0, 74.4, 75.5, 77.7, 83.0]
```

## Other flavours of using the Comparator

### Overriding the `compare` method of the `Comparator interface` by implementing it in the argument list only.
```java
Arrays.sort(list, new Comparator<Student>() {
   @Override
   public int compare(Student o1, Student o2) {
      // think of it as
      // calling o1.compareTo(o2)
      // or
      // o1 - o2
      return (int) (o1.marks - o2.marks);
      // to sort in reverse order use
      // -(int)(o1.marks - o2.marks)
   }
});
```

### Using lambda expression
```java
Arrays.sort(list,
      (o1, o2) -> (int) (o1.marks - o2.marks));
```


# Lambda Expressions

```java

import java.util.function.Consumer;

public class LambdaFun {
   public static void main(String[] args) {
      // compare it with javascript arrow functions
      // labda functions can be use to convert in to onle line functions 

      ArrayList<Integer> arr = new ArrayList<>();
      for (int i = 0; i < 5; i++) {
         arr.add(i + 1);
      }

      // * Example 1
      arr.forEach((item) -> System.out.println(item * 2));


      // * Example 2

      // Consumer is a built-in interface present in java
      // we can store lambda expressions in a variable that areof type Interfaces
      Consumer<Integer> lambdaFun = (item) -> System.out.println(item);
      arr.forEach(lambdaFun);


      // * Example 3
      
      // Operation is an interface look below
      Operation sum = (a, b) -> a + b;
      Operation prod = (a, b) -> a * b;
      Operation diff = (a, b) -> a - b;
      // here this acts as the body of the function declared in the interface

      LambdaFun myCalc = new LambdaFun();
      int l = myCalc.operate(4, 5, sum);
      int m = myCalc.operate(4, 5, prod);
      int n = myCalc.operate(4, 5, diff);
      // at run time it is decided about which particular 
      // body is to be exec. for operation method of Operation interface

      System.out.println(l + ", " + m + ", " + n);
   }

   private int operate(int a, int b, Operation o1) {
      return o1.operation(a, b);
   }
}

interface Operation {
   int operation(int a, int b);
   // if we make more that one function of similar type then we will get error.
}
```


# Exception Handling

The 5 Keywords : 

 * `try`
 * `catch`
 * `finally`
 * `throw`
 * `throws`

```java
public static void main(String[] args) {
      int a = 5;
      int b = 0;

      try {
         // int c = a / b; // java can by default catch the exceptions but we can explicitly throw them as well
         // System.out.println(c);

         divide(a, b);

      } catch (Exception e) {
         // the exception thrown is catched here

         System.out.println("Exception Catched :\n" + e.getMessage());
      } finally {
         System.out.println("this will always execute, doesn't matter if error is thrown or not thrown");
      }
}

static int divide(int a, int b) throws ArithmeticException {
      // here we have to explicity declare the exception
      if (b == 0) {
         // here we are explicitly throwing an exception
         throw new ArithmeticException("please do not divide by 0");
         // here constructor of ArithmeticException is called when throwing
      }
      return a / b;
   }
```

Handling multiple exceptions

```java
try {
   divide(a, b);
} catch (ArithmeticException e) {
   // More strict exception rules should be handled first

   System.out.println("Exception Catched :\n" + e.getMessage());

} catch (Exception e) {
   System.out.println("Exception Catched :\n" + e.getMessage());

} finally {
   System.out.println("this will always execute, doesn't matter if error is thrown or not thrown");
}
```

## Custom Exception

```java
package OOP6.ExceptionHandling;

public class CustomException extends Exception {
   public CustomException(String message) {
      super(message);
   }
}
```

Usage : 

```java
package OOP6.ExceptionHandling;

public class P2 {
   public static void main(String[] args) {
      try {
         String name = "Adarsh";
         if (name == "Adarsh") {
            throw new CustomException("--Custom Exception--");
         }

      } catch (CustomException e) {
         System.out.println(e.getMessage());
      }
   }
}
```

# Object Cloning

Naive way of cloning a Object

`Human.java`
```java
public class Human {
   int age;
   String name;

   public Human(int age, String name) {
      this.age = age;
      this.name = name;
   }

   public Human(Human other) {
      this.age = other.age;
      this.name = other.name;
   }

}
```

`Main.java`
```java
public class Main {
   public static void main(String[] args) {
      Human adarshKS = new Human(22, "Adarsh");
      Human asdf = new Human(adarshKS);
   }
}
```

The `new` Keyword usage has a significant time overhead

In `java.lang` package we have `Cloneable` interface which we can implement in the class the object of whose clone we want to create.

`Human.java`
```java
public class Human implements Cloneable {
   int age;
   String name;

   public Human(int age, String name) {
      this.age = age;
      this.name = name;
   }

   public Human(Human other) {
      this.age = other.age;
      this.name = other.name;
   }

   @Override
   public Object clone() throws CloneNotSupportedException {
      return super.clone();
   }
}
```

```java
public class Main {
   public static void main(String[] args) throws CloneNotSupportedException {
      Human adarshKS = new Human(22, "Adarsh");
      Human asdf = new Human(adarshKS);

      Human twin = (Human) adarshKS.clone();

      System.out.println(twin.age + ", " + twin.name);
   }
}
```

In the `java.lang` packege the implementation of `Cloneable` interface we do not have any methods defined, it's actually only telling the JVM that we have to perform `clone()` on our object of `class-type`

`.clone()` is doing <a>shallow-copy</a>

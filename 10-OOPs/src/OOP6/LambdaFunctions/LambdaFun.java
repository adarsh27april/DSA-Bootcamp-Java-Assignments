package OOP6.LambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFun {
   public static void main(String[] args) {
      // compare it with javascript arrow functions
      // labda functions can be use to convert in to onle line functions

      // we can store lambda expressions in a variable that areof type Interfaces

      ArrayList<Integer> arr = new ArrayList<>();
      for (int i = 0; i < 5; i++) {
         arr.add(i + 1);
      }

      // arr.forEach((item) -> System.out.println(item * 2));

      // Consumer is a built-in interface present in java
      Consumer<Integer> lambdaFun = (item) -> System.out.println(item);
      arr.forEach(lambdaFun);

      Operation sum = (a, b) -> a + b;
      Operation prod = (a, b) -> a * b;
      Operation diff = (a, b) -> a - b;
      // here this acts as the body of the function declared in the interface

      LambdaFun myCalc = new LambdaFun();
      int l = myCalc.operate(4, 5, sum);
      int m = myCalc.operate(4, 5, prod);
      int n = myCalc.operate(4, 5, diff);
      // at run time it is decided about which particular body id to be exec.

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
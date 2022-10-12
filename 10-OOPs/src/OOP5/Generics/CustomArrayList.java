package OOP5.Generics;

import java.util.ArrayList;

public class CustomArrayList {

   private int[] data;
   private static int DEFAULT_SIZE = 10;
   private int size = 0;

   public CustomArrayList() {
      this.data = new int[DEFAULT_SIZE];
   }

   public static void main(String[] args) {

      ArrayList<Integer> list = new ArrayList<>();
      // default functions
      list.add(10);
      list.add(12);
      list.remove(1);// index
      list.get(0);
      list.size();
      list.isEmpty();

   }
}

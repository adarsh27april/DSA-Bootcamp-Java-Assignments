package OOP6.Generics;

import java.util.ArrayList;
import java.util.Arrays;

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

   public static void main(String[] args) {

      ArrayList<Integer> list = new ArrayList<>();
      // default functions
      list.add(10);
      list.add(12);
      list.remove(1);// index
      list.get(0);
      list.size();
      list.isEmpty();

      CustomArrayList cList = new CustomArrayList();
      cList.add(20);
      cList.add(22);
      cList.add(23);
      cList.add(55);
      cList.remove();

      System.out.println(cList);
   }
}

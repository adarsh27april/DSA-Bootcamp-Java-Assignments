package OOP6.Generics;

import java.util.Arrays;

/**
 * Now, since T is extending Number class so only Number and it's subclasses can
 * be used
 */
public class CusomGenericArrayList<T extends Number> {

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

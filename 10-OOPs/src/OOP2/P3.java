package OOP2;

public class P3 {
   public static void main(String[] args) {
      Singleton o1 = Singleton.getInstance();
      Singleton o2 = Singleton.getInstance();
      Singleton o3 = Singleton.getInstance();

      System.out.println(o1);
      System.out.println(o2);
      System.out.println(o3);
   }
}

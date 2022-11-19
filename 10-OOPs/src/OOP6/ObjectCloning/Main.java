package OOP6.ObjectCloning;

public class Main {
   public static void main(String[] args) throws CloneNotSupportedException {
      Human adarshKS = new Human(22, "Adarsh");
      Human asdf = new Human(adarshKS);

      Human twin = (Human) adarshKS.clone();

      System.out.println(twin.age + ", " + twin.name);
   }
}

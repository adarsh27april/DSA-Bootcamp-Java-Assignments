package OOP2;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Human Adarsh = new Human(22, "Adarsh", false, "Male");
        Human Harsh = new Human(20, "Harsh", false, "Male");
        Human Satyam = new Human(17, "Satyam", false, "Male");
        Human Ankita = new Human(8, "Ankita", false, "Female");

        System.out.println(Human.population);
    }

    void greeting() {
        System.out.println("Namaskaram");
    }
}

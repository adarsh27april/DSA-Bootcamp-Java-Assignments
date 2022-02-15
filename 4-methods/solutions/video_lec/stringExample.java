package video_lec;

public class stringExample {
    public static void main(String[] args) {
        String msg = greet();
        System.out.println("msg : " + msg);

        String name = "Adarsh";
        change(name);
        System.out.println(name);// strings are immutable so thay won't be changed.
    }

    public static String greet() {
        String greeting = "Namaskaram";
        return greeting;
    }

    public static void change(String naam) {
        naam = "Singh";
    }
}

package video_lec;

public class Shadowing {
    static int x = 40;

    public static void main(String[] args) {

        {
            System.out.println(x);
            int x = 90;
            System.out.println(x);
            x += 50;
            System.out.println(x);
        }
        System.out.println(x);
    }

}

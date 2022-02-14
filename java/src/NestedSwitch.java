import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int empId = ip.nextInt();
        String department = ip.next();
        switch (empId) {
        case 1:
            System.out.println("Adarsh KS");
            break;
        case 2:
            System.out.println("Some employee Name");
            break;
        case 3:
            System.out.println("Emp id 3: ");
            switch (department) {
            case "IT":
                System.out.println("IT Department");
                break;
            case "Civil":
                System.out.println("Civil Department");
                break;
            default:
                System.out.println("Enter correct Department");
                break;
            }
            break;
        default:
            System.out.println("Enter correct id");
            break;
        }
        ip.close();
    }
}

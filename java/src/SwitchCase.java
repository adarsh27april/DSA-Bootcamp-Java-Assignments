import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int day = ip.nextInt();
		switch (day) {
		case 1:
			System.out.println("Weekday");
			break;
		case 2:
			System.out.println("Weekday");
			break;
		case 3:
			System.out.println("Weekday");
			break;
		case 4:
			System.out.println("Weekday");
			break;
		case 5:
			System.out.println("Weekday");
			break;
		case 6:
			System.out.println("Weekend");
			break;
		case 7:
			System.out.println("Weekend");
			break;

		default:
			break;
		}

		/** Alternative */

		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekday");
			break;
		case 6:
		case 7:
			System.out.println("Weekend");
			break;
		}

		ip.close();
	}
}

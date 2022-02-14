package Video_03_conditionals_loops;

import java.util.*;
// import java.util.Scanner;

public class perfect {
	public static boolean isPerfect(int n) {
		List<Integer> factors = new ArrayList<Integer>();
		factors.add(1);
		// factors.add(n);
		for (int i = 2; i < Math.pow(n, 0.5); i++) {
			// System.out.println("hello");
			if (n % i == 0) {
				factors.add(i);
				factors.add(n / i);
			}
		}
		// for (Integer integer : factors) {
		// System.out.println("--> " + integer);
		// }
		int sum = 0;
		for (int i = 0; i < factors.size(); i++) {
			sum += factors.get(i);
		}
		// System.out.println("-n-: " + n + " -sum-: " + sum);
		if (sum == n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("enter the number to be checked");
		int start = ip.nextInt();
		int end = ip.nextInt();
		int count = 0;

		for (int i = start; i < end; i++) {
			if (isPerfect(i)) {

				System.out.println("Perfect num. " + ++count + " is : " + i);

			}
			// else {

			// System.out.println("non-perfect: " + i);
			// }
		}
		ip.close();
	}
}

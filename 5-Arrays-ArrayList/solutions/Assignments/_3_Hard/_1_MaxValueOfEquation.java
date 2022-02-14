package Assignments._3_Hard;

public class _1_MaxValueOfEquation {
	public static void main(String[] args) {
		Solution1 ob = new Solution1();
		// int k = 10, points[][] = { { -19, 9 }, { -15, -19 }, { -5, -8 } };
		int points[][] = { { 1, 100 }, { 2, 99 }, { 3, 101 }, { 500, 500 } }, k = 498;
		ob.findMaxValueOfEquation(points, k);
	}
}

class Solution1 {
	public int findMaxValueOfEquation(int[][] points, int k) {

		// int prevExpVal = Integer.MIN_VALUE, expVal = 0;
		// for (int i = 0; i < points.length; i++) {
		// for (int j = i + 1; j < points.length; j++) {

		// int yi = points[i][1];
		// int yj = points[j][1];
		// int xi = points[i][0];
		// int xj = points[j][0];

		// expVal = yi + yj + Math.abs(xi - xj);
		// if (Math.abs(xi - xj) <= k && expVal > prevExpVal) {
		// System.out.println(
		// "i:" + i + ", j:" + j + ", expVal: " + expVal + ", prevExpVal: " + prevExpVal
		// + ", k: " + k);

		// prevExpVal = expVal;

		// }
		// }
		// }

		// System.out.println(prevExpVal);
		// return prevExpVal;

		int prev = 0;
		int curr = 1;
		int best = Integer.MIN_VALUE;
		int diff = 0;

		while (curr < points.length) {
			// calculate the distance between points.
			diff = points[curr][0] - points[prev][0];
			// if the distance is within the maximum k calculate the value between the
			// points
			if (diff <= k) {
				// store the equation value if it is the best
				best = Math.max(best, points[curr][1] + points[prev][1] + diff);
				// verify if the [prev] point could possibly be better then [curr];
				// ex: [2,5][3,2][5,5], k = 4 | in this case [2,5] will be better than [3,2]
				// when compared to [5,5]
				// [prv][cur] | so we only advance [curr], otherwise we advance [prev]
				if (points[prev][1] >= points[curr][1] - diff) {
					curr++;
				} else {
					prev++;
					if (prev == curr) {
						curr++;
					}
				}
			} else {
				prev++;
				if (prev == curr) {
					curr++;
				}
			}
		}
		System.out.println(best);
		return best;
	}
}

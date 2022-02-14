package Assignments._1_Easy;

public class _19_MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = { { 1950, 1961 }, { 1960, 1971 }, { 1970, 1981 } };
        Solution19 ob = new Solution19();
        ob.maximumPopulation_fast_Leetcode(logs);
    }
}

class Solution19 {
    public int maximumPopulation_naive(int[][] logs) {
        int max = logs[0][0], min = logs[0][0];
        for (int i = 0; i < logs.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (logs[i][j] > max) {
                    max = logs[i][j];
                }
                if (logs[i][j] < min) {
                    min = logs[i][j];
                }
            }
        }
        int[] popln = new int[max - min + 1];
        System.out.println(popln.length + ", " + max + ", " + min);

        for (int yr = min; yr <= max; yr++) {
            for (int j = 0; j < logs.length; j++) {
                if ((yr < logs[j][1]) && (yr >= logs[j][0])) {
                    ++popln[yr - min];
                }
            }
        }

        int ind = 0;
        for (int i = 0; i < popln.length; i++) {
            if (popln[i] > popln[ind]) {
                ind = i;
            }
        }
        int maxPoplnYr = (min + ind);
        System.out.println(maxPoplnYr);

        // for (int i = 0; i < popln.length; i++)
        // System.out.print("[" + (min + i) + "-" + popln[i] + "], ");

        return maxPoplnYr;
    }

    public int maximumPopulation_fast_Leetcode(int[][] logs) {
        int[] popln = new int[2051];
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                ++popln[j];
            }
        }
        for (int i = 1950; i < 2050; i++)
            System.out.print("[" + (i) + "-" + popln[i] + "], ");

        int maxPoplnYr = 0;
        for (int i = 0; i < popln.length; i++) {
            if (popln[i] > popln[maxPoplnYr]) {
                maxPoplnYr = i;
            }
        }
        System.out.println(maxPoplnYr);
        return maxPoplnYr;
    }

    // public int maximumPopulation_fast_my(int[][] logs) {

    // }
}
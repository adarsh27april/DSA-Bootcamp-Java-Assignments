package Assignments._1_Easy;

// import java.util.Arrays;

public class _20_DeterminMatrixRotation {
    public static void main(String[] args) {
        Solution20 ob = new Solution20();
        int[][] mat = {
                { 0, 0, 0 },
                { 0, 1, 0 },
                { 1, 1, 1 } };
        int[][] target = {
                { 1, 1, 1 },
                { 0, 1, 0 },
                { 0, 0, 0 } };
        boolean ans = ob.findRotation(mat, target);
        // int[][] abc = {
        // { 1, 0, 0 },
        // { 1, 1, 0 },
        // { 1, 0, 0 } };
        // ob.rotate(abc);
        System.out.println(ans);
    }
}

class Solution20 {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        boolean ans = false;
        for (int x = 0; x <= 3; x++) {
            int flag = 1;// kya mat aur target alag hai

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] != target[i][j]) {
                        flag = 0;
                        break;
                    }
                    /*
                     * agar mat aur target alag hai to aage dono ko
                     * compare karna band karo & break here
                     */
                }

                if (flag == 0)
                    break;
            }

            if (flag == 1) {
                ans = true;
                break;
            } else {
                ans = false;
            }
            // agar mat aur target alag nahi hai to break karo kuki mari manzil a gayi

            mat = rotate(mat);// agar mat aur target alag hai to mat ko fir se rotate karo

        }

        return ans;
    }

    public int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] rm = new int[n][n];
        int k = n - 1;
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= k; j++) {
                rm[j][k - i] = mat[i][j];
            }
        }
        return rm;
    }
}
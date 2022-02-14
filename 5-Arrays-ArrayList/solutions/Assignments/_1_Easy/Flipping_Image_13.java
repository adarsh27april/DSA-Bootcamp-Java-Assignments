package Assignments._1_Easy;

import java.util.Arrays;

public class Flipping_Image_13 {
    public static void main(String[] args) {
        // int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        // op: [[1,0,0],[0,1,0],[1,1,1]]
        int[][] image = {
                { 1, 1, 0, 0 },
                { 1, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 } };
        // op: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
        Solution13 obj = new Solution13();
        image = obj.flipAndInvertImage(image);
        for (int[] is : image) {
            System.out.println(Arrays.toString(is));
        }

    }
}

class Solution13 {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int row = 0; row < n; row++) {
            int mid = n / 2;
            for (int i = 0; i < mid; i++) {
                int temp = image[row][i];
                image[row][i] = image[row][n - i - 1];
                image[row][n - i - 1] = temp;
            }
        }
        for (int row = 0; row < n; row++) {
            for (int i = 0; i < n; i++) {
                if (image[row][i] == 0)
                    image[row][i] = 1;
                else if (image[row][i] == 1)
                    image[row][i] = 0;
            }
        }
        return image;
    }

}

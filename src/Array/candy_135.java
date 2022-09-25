package Array;

import java.util.Arrays;

public class candy_135 {
    public static void main(String[] args) {
        int[] ratings = {1,0,2};
//        int[] ratings = {1,2,87,87,87,2,1};
//        int[] ratings = {29,51,87,87,72,12};

        int ans = candy(ratings);
        System.out.println(ans);
    }

    private static int candy(int[] ratings) {
        int sum = 0;
        int[] left2right = new int[ratings.length];
        int[] right2left = new int[ratings.length];
        Arrays.fill(left2right, 1);
        Arrays.fill(right2left, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left2right[i] = left2right[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right2left[i] = right2left[i + 1] + 1;
            }
        }
        for (int i = 0; i < ratings.length; i++) {
            sum += Math.max(left2right[i], right2left[i]);
        }
        return sum;
    }
}

package Array;

import java.util.Arrays;

public class sumEvenAfterQueries_985 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        int[] ans = sumEvenAfterQueries(nums, queries);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[]ans = new int[nums.length];
        int index, val, sum=0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum = sum + num;
            }
        }
        for (int row=0; row < queries.length; row++){
            val = queries[row][0];
            index = queries[row][1];
            if (nums[index] % 2 == 0) sum = sum - nums[index];
            nums[index] += val;
            if (nums[index] % 2 == 0) sum = sum + nums[index];
            ans[row] = sum;
        }
        return ans;
    }
}

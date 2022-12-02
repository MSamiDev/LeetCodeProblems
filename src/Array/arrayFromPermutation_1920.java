package Array;

import java.util.Arrays;

public class arrayFromPermutation_1920 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
//        int[] nums = {5,0,1,2,3,4};
        int[] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int j = n-1;
        for (int i=0; i <= n/2; i++){

            ans[j] = nums[nums[j]];
            ans[i] = nums[nums[i]];
            j--;
        }
        return ans;
    }
}

package Array;

import java.util.Arrays;

public class concatenateArray_1929 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        //        int[] nums = {5,0,1,2,3,4};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        int j = n-1;
        for(int i = 0; i <= n/2; i++){
            ans[i] = ans[n + i] = nums[i];
            ans[j] = ans[n + j] = nums[j];
            j--;
        }
        return ans;
    }
}

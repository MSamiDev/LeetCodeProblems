package Array;

import java.util.Arrays;

public class sumOfArray_1480 {
    public static void main(String[] args) {
//        int[] nums = {0,2,1,5,3,4};
        int[] nums = {1,1,1,1,1,1,1};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}

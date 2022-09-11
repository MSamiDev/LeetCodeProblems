import java.util.Arrays;

public class sumOfArray_1480 {
    public static void main(String[] args) {
//        int[] nums = {0,2,1,5,3,4};
        int[] nums = {1,1,1,1,1,1,1};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i] + sum;
            sum = sum + nums[i];
        }
        return ans;
    }
}

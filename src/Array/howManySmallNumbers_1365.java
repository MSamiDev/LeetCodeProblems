package Array;

import java.util.Arrays;

public class howManySmallNumbers_1365 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i < nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}

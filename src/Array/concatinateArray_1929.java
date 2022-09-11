package Array;

import java.util.Arrays;

public class concatinateArray_1929 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        //        int[] nums = {5,0,1,2,3,4};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2* nums.length];
        int j = 0;
        while (j < 2) {
            if(j == 0){
                System.arraycopy(nums, 0, ans, 0, nums.length);
            }else System.arraycopy(nums, 0, ans, nums.length, nums.length);
            j++;
        }
        return ans;
    }
}

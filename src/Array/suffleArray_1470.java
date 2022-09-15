package Array;

import java.util.Arrays;

public class suffleArray_1470 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] ans = shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int p1=0,p2=n,idx=0;
        while(n-->0)
        {
            ans[idx++]=nums[p1++];
            ans[idx++]=nums[p2++];
        }
        return ans;
    }
}

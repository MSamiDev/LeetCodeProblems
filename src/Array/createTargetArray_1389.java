package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class createTargetArray_1389 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ansTemp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            ansTemp.add(index[i],nums[i]);
        }
        return ansTemp.stream().mapToInt(i->i).toArray();
    }
}

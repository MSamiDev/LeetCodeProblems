package Array;


public class goodPairs_1512 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }

    private static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for(int i=0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) ans++;
            }
        return ans;
    }
    private static int numIdenticalPairs1(int[] nums) {
        int result = 0;
        int[] range = new int[nums.length * 2];
        for (int num : nums) {
            range[num]++;
        }
        for(int v : range){
            result +=(v*(v-1))/2;
        }
        return result;
    }
}

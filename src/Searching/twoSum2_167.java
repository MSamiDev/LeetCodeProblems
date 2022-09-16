package Searching;

import java.util.Arrays;

public class twoSum2_167 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(numbers, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int sum;
        while (start < end){
            sum = numbers[start] + numbers[end];
            if(sum == target){
                return new int[]{start + 1, end + 1};
            }
            else if(sum < target){
                start++;
            }else{
                end--;
            }

        }
        return new int[] {0};
    }
}

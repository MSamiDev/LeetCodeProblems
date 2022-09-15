package Array;

public class customerWealth_1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    private static int maximumWealth(int[][] accounts) {
        int ans = 0;
        int sum = 0;
        for (int[] account : accounts) {
            for (int i : account) {
                sum = sum + i;
            }
            if (sum > ans) {
                ans = sum;
            }
            sum = 0;
        }
        return ans;
    }
}

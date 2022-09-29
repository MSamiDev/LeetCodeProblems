package Searching;

public class arrangingCoins_441 {
    public static void main(String[] args) {
        int n = 8;
        int ans = arrangingCoins(n);
        System.out.println(ans);
    }

    private static int arrangingCoins(int n) {
        long left = 0, right = n;
        long k, curr;
        while (left <= right) {
            k = left + (right - left) / 2;
            curr = k * (k + 1) / 2;

            if (curr == n) return (int)k;

            if (n < curr) {
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return (int)right;
    }


    private static int arrangingCoins1(int n) {
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);
    }

}

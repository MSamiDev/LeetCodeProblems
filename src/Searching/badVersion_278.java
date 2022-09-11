package Searching;

import java.util.Scanner;

public class badVersion_278 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int bad = input.nextInt();
        int ans = firstBadVersion(n, bad);
        System.out.println(ans);
    }

    private static int firstBadVersion(int n, int bad) {
        int start = 0;
        int end = n;
        while(start < end ){

            int mid = start + (end - start)/2;
            boolean res = isBadVersion(mid, bad);
            if(res){
                end = mid ;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static boolean isBadVersion(int n, int bad){
        return n == bad || n > bad;
    }
}

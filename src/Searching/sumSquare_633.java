package Searching;

public class sumSquare_633 {
    public static void main(String[] args) {
        int c = 808201;
        boolean ans = judgeSquareSum(c);
        System.out.println(ans);
    }


    public static boolean judgeSquareSum(int c) {
        long lC = c;
        long start = 0 ;
        long end = (int)Math.sqrt(c);
        long mid = 0 ;

        while(start <= end){
            mid = start*start + end*end ;

            if(mid == lC){
                return true ;
            }
            else if(mid > lC){
                end-- ;
            }
            else{
                start++ ;
            }
        }
        return false ;
    }

    private static boolean judgeSquareSum1(int c) {
        for (long a = 0; a * a <= c; a++) {
            int b = c - (int)(a * a);
            if (isPerfectSquare(0, b, b))
                return true;
        }
        return false;
    }

    private static boolean isPerfectSquare(long start, long end, int num) {
        long lNum = (long) num;
        if (lNum < 16 && lNum >= 4){
            end = lNum/2;
        }else if (lNum >= 16) {
            end = lNum/4;
        }else {
            end = lNum;
        }
        if( start*start == lNum || end*end == lNum){
            return true;
        }
        while (start < end){
            Long mid = start + (end - start)/2;
            if( start*start == lNum || end*end == lNum){
                return true;
            }
            if(mid*mid == lNum){
                return true;
            }else if(mid*mid > lNum){
                end = mid - 1;
            }else if(mid*mid < lNum){
                start = mid + 1;
            }
        }
        return false;
    }
}

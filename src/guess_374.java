import java.util.Scanner;

public class guess_374 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int pick = input.nextInt();

        int ans = guessNumber(n, pick);
        System.out.println(ans);

    }
    public static int guessNumber(int n, int pick){
        if(n < pick){
            System.out.println("The guessed number is not in the defined length of numbers. \n error: guess outOfbBound");
            return -1;
        }
        int start = 1;
        int end = n;
        while (start <= end){

            int mid = start + (end - start)/2;
            if (start == pick){
                return start;
            } else if (end == pick) {
                return end;
            }else if (pick > mid){
                start = mid + 1;
            } else if (pick < mid) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        System.out.println("Guess Not found.");
        return -1;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class spiralMatrix2_59 {
    public static void main(String[] args) {

//      Scanner input = new Scanner(System.in);
//      int n = input.nextInt();
        int n = 3;
        int[][] spiralOrder = spiralOrder(n);

        System.out.println(Arrays.deepToString(spiralOrder));

    }

    private static int[][] spiralOrder(int n) {
        int[][] spiralOrder = new int[n][n];
        int[][] helper = new int[n][n];
        int[] Tcount = new int[n * n];
        for (int i = 0; i < n * n; i++) {
            Tcount[i] = i + 1;
        }
        int flat2 = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                helper[row][col] = Tcount[flat2];
                flat2++;
            }
        }
        System.out.println(Arrays.toString(Tcount));
        List<Integer> list = new ArrayList<>();
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int count = n*n ;
        int currentCount = 0;
        while (currentCount < count) {
            for (int i = left ; i <= right && currentCount < count ; i++) {
                list.add(helper[top][i]);
                currentCount++;
            }
            top++;
            for (int i = top ; i <= bottom && currentCount < count ; i++) {
                list.add(helper[i][right]);
                currentCount++;
            }
            right--;
            for (int i = right ; i >= left && currentCount < count ; i--) {
                list.add(helper[bottom][i]);
                currentCount++;
            }
            bottom--;
            for (int i = bottom ; i >= top && currentCount < count ; i--) {
                list.add(helper[i][left]);
                currentCount++;
            }
            left++;
        }
        System.out.println(list);

//
//        int x = 0;
//        for (int row = 0; row < n; row++) {
//            for (int col = 0; col < n; col++) {
//                spiralOrder[row][col] = list.get(x);
//                x++;
//            }
//        }


        return spiralOrder;
    }

}

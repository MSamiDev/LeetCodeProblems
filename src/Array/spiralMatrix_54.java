package Array;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix_54 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}, {13,14,15,16}};

        List<Integer> spiralOrder = spiralOrder1(matrix);
        System.out.println(spiralOrder);

    }
    private static List<Integer> spiralOrder1(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int count = matrix.length * matrix[0].length ;
        int currentCount = 0;
        while (currentCount < count) {
            for (int i = left ; i <= right && currentCount < count ; i++) {
                list.add(matrix[top][i]);
                currentCount++;
            }
            top++;
            for (int i = top ; i <= bottom && currentCount < count ; i++) {
                list.add(matrix[i][right]);
                currentCount++;
            }
            right--;
            for (int i = right ; i >= left && currentCount < count ; i--) {
                list.add(matrix[bottom][i]);
                currentCount++;
            }
            bottom--;
            for (int i = bottom ; i >= top && currentCount < count ; i--) {
                list.add(matrix[i][left]);
                currentCount++;
            }
            left++;
        }
        return list;
    }

}
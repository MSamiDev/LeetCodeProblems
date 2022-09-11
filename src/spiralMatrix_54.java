import java.util.ArrayList;
import java.util.List;

public class spiralMatrix_54 {
    public static void main(String[] args) {
//        int[][] matrix = {{1,2},{3,4}};
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
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
    private static List<Integer> spiralOrder(int[][] matrix) {
        int direction = 0;
        List<Integer> list = new ArrayList<>();
        int x = 0;
        int y = 0;
        int xLow = 0;
        int yLow = 0;
        int xHigh = matrix.length - 1;
        int yHigh = matrix[0].length - 1;
        while(list.size() < matrix.length * matrix[0].length - 1){
            if(direction % 4 == 0){
                while(y < yHigh){
                    list.add(matrix[x][y]);
                    y++;
                }
                xLow++;
            }else if(direction % 4 == 1){
                while(x < xHigh){
                    list.add(matrix[x][y]);
                    x++;
                }
                yLow++;
            }else if(direction % 4 == 2){
                while(y >= yLow){
                    list.add(matrix[x][y]);
                    y--;
                }
                xHigh--;
            }else if(direction % 4 == 3){
                while(x > xLow){
                    list.add(matrix[x][y]);
                    x--;
                }
                yHigh--;
            }
            direction++;
        }
        list.add(matrix[x][y]);
        return list;
    }

}






//else if(col == matrix[row].length - 1){
//        spiralOrder.add(matrix[row][col]);
//        if(row == matrix.length - 1){
//        for(int i = matrix[row].length - 2 ; i >= 0; i--) {
//        spiralOrder.add(matrix[row][i]);
//        }
//        }
//        }
//        if ( spiralOrder.size() == (2*matrix[row].length)+matrix.length - 2 && matrix.length > 2) {
//        for(int i = 0 ; i < matrix[row].length - 1; i++) {
//        spiralOrder.add(matrix[row - 1][i]);
//        }
//        }
//        if(col == matrix[row].length - 3){
//        spiralOrder.add(matrix[row][col]);
//        if(row == matrix.length - 1){
//        for(int i = matrix[row].length - 2 ; i >= 0; i--) {
//        spiralOrder.add(matrix[row][i]);
//        }
//        }
//        }

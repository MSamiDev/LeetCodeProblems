package Array;

import java.util.Arrays;

public class flippingImage_832 {
    public static void main(String[] args) {
//        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
//        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] image = {{0,1,0},{0,0,1},{0,1,1}};
        System.out.println(Arrays.deepToString(image));
        int[][] ans = flipAndInvertImage1(image);
        System.out.println(Arrays.deepToString(ans));
    }

    private static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];
//        int row = 0;
            int first = 0, last = image.length -1;
            for (int row = 0; row < image.length ;){
                if (first < last){
                    ans[row][first] = (image[row][last] == 0 ? 1 : 0);
                    ans[row][last] = (image[row][first] == 0 ? 1 : 0);
                }else if (first == last){
                    ans[row][first] = (image[row][first] == 0 ? 1 : 0);
                }

                if(first == last || first > last){
                    row++;
                    if (row < image.length ){
                        first = 0;
                        last = image[row].length -1;
                    }

                }else {
                    first++;
                    last--;
                }
            }
//            while (row < image.length - 1){
//                if (first != last){
//                    ans[row][first] = (image[row][last] == 0 ? 1 : 0);
//                    ans[row][last] = (image[row][first] == 0 ? 1 : 0);
//                }else {
//                    ans[row][first] = (image[row][first] == 0 ? 1 : 0);
//                }
//
//                if(first == last || first > last){
//                    row++;
//                    first = 0;
//                    last = image[row].length -1;
//                }else {
//                    first++;
//                    last--;
//                }
//            }
//            if (row == image.length){
//                if (first != last){
//                    ans[row][first] = (image[row][last] == 0 ? 1 : 0);
//                    ans[row][last] = (image[row][first] == 0 ? 1 : 0);
//                }else {
//                    ans[row][first] = (image[row][first] == 0 ? 1 : 0);
//                }
//
//                if(first == last || first > last){
//                    row++;
//                    first = 0;
//                    last = image[row].length -1;
//                }else {
//                    first++;
//                    last--;
//                }
//            }

        return ans;
    }




    private static int[][] flipAndInvertImage1(int[][] image) {
        int[][] ans = new int[image.length][image.length];
//        int row = 0;
        int first = 0, last = image.length -1;
        int firstRow = 0, lastRow = image.length -1;

        int row = 0;
        while (firstRow <= lastRow) {
            if (first < last){
                ans[firstRow][first] = (image[firstRow][last] == 0 ? 1 : 0);
                ans[firstRow][last] = (image[firstRow][first] == 0 ? 1 : 0);
                if (firstRow != lastRow){
                    ans[lastRow][first] = (image[lastRow][last] == 0 ? 1 : 0);
                    ans[lastRow][last] = (image[lastRow][first] == 0 ? 1 : 0);
                }

            }else if (first == last){
                ans[firstRow][first] = (image[firstRow][first] == 0 ? 1 : 0);
                if ( firstRow != lastRow){
                    ans[lastRow][last] = (image[lastRow][last] == 0 ? 1 : 0);
                }

            }

            if(first == last || first > last){
                firstRow++;
                lastRow--;
                if (firstRow <= lastRow){
                    first = 0;
                    last = image[row].length -1;
                }
            }else {
                first++;
                last--;
            }
        }
        return ans;
    }
}

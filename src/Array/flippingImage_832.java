package Array;

import java.util.Arrays;

public class flippingImage_832 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(ans));
    }

    private static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];
        for (int row = 0; row < image.length; row++){
            int first = 0, last = image[row].length -1;
            while (first <= last){
                if (first != last){
                    ans[row][first] = (image[row][last] == 0 ? 1 : 0);
                    ans[row][last] = (image[row][first] == 0 ? 1 : 0);
                }else {
                    ans[row][first] = (image[row][first] == 0 ? 1 : 0);
                }


                first++;
                last--;
            }
        }
        return ans;
    }
}

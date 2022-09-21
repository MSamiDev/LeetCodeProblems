package Array;

public class mostWater_11 {
    public static void main(String[] args) {
//        int[] height = {1,1};
        int[] height = {1,2,4,3};
        int ans = maxArea(height);
        System.out.println(ans);
    }

    private static int maxArea(int[] height) {
        int volume = 0;
        int first = height[0], fP_index = 0;
        int last = height[height.length - 1], lP_index = height.length -1;
        for(int i = 0; i < height.length; i++){
            if(first >= last){
                int temp = last * (lP_index - fP_index );
                if(temp > volume) volume = temp;
                if(lP_index != 0)lP_index -= 1;
                last = height[lP_index];
            }else {
                int temp = first * (lP_index - fP_index);
                if(temp > volume) volume = temp;
                fP_index += 1;
                first = height[fP_index];
            }
        }
        return volume;
    }
}

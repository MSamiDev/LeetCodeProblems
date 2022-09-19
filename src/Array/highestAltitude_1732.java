package Array;


public class highestAltitude_1732 {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int ans = largestAltitude(gain);
        System.out.println(ans);
    }

    private static int largestAltitude(int[] gain) {
        int ans = 0;
        int[] altitudes = new int[gain.length + 1];
        for(int i = 0; i < altitudes.length; i++){
            if(i==0)altitudes[i] = 0;
            else {
                altitudes[i] = altitudes[i-1] + gain[i-1];
                if(ans < altitudes[i]){
                    ans = altitudes[i];
                }
            }

        }
        return ans;
    }
}

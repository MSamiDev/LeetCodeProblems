package Array;

import java.util.ArrayList;
import java.util.List;

public class kidWithGreatestCandies_1431 {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> ans = kidsWithCandies(candies, extraCandies);
        System.out.println(ans);
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>(candies.length);
        int max = max(candies);
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                ans.add(Boolean.TRUE);
            } else {
                ans.add(Boolean.FALSE);
            }
        }
        return ans;
    }
    public static int max(int[] elementData )
    {
        int max = elementData[0];
        for (int i = 1; i < elementData.length; i++)
        {
            if (elementData[i] > max)
            {
                max = elementData[i];
            }
        }
        return max;
    }
}

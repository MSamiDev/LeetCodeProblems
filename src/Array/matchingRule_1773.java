package Array;

public class matchingRule_1773 {
    public static void main(String[] args) {
        String [][] items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        String ruleKey = "color";
        String ruleValue = "silver";
        int ans = countMatches1(items, ruleKey, ruleValue);
        System.out.println(ans);
    }

    private static int countMatches(String[][] items, String ruleKey, String ruleValue) {
        int ans = 0, k = 0;

        if(ruleKey.equals("type")) k=0;
        if(ruleKey.equals("color")) k=1;
        if(ruleKey.equals("name")) k=2;

        for (String[] item : items) {
            for (int col = 0; col < item.length; col++) {
                String s = item[col];
                if (ruleValue.equals(s) && k == col) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private static int countMatches1(String[][] items, String ruleKey, String ruleValue) {
        int col=-0, ans=0;

        if(ruleKey.equals("type")) col=0;
        if(ruleKey.equals("color")) col=1;
        if(ruleKey.equals("name")) col=2;

        for (String[] item : items) {
            if (item[col].equals(ruleValue)) ans++;
        }
        return ans ;
    }

}

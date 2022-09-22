package Array;

public class reverseWords_557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.println(ans);

    }

    private static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] split = s.split("\\s+");
        for(int str=0; str< split.length; str++){
            split[str] = new StringBuilder(split[str]).reverse().toString();
            if(str != 0) ans.append(" ").append(split[str]);
            else ans.append(split[str]);
        }
        
        return ans.toString();
    }
}

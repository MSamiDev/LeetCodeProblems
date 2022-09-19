package Array;

public class sentenceIsPangram_1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
    }

    private static boolean checkIfPangram(String sentence) {
        boolean ans = true;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < 26; i++){
            if(sentence.indexOf(alphabet.charAt(i)) == -1) return false;
        }
        return ans;
    }
}

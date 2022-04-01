package CodeWars.SevenKyu.TidyNumber;

public class Solution {

    public static boolean tidyNumber(int number) {
        String[] s = String.valueOf(number).split("");

        for(int i = 0; i < s.length; i++) {
            if(i + 1 != s.length) {
                if (!(Integer.parseInt(s[i]) <= Integer.parseInt(s[i + 1]))) {
                    return false;
                }
            }
        }

        return true;
    }
}

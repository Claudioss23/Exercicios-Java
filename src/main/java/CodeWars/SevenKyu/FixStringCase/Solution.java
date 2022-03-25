package CodeWars.SevenKyu.FixStringCase;

import java.util.Locale;

public class Solution {

    public static String solve(final String str) {
        char[] c = str.toCharArray();
        int uc = 0;
        int lc = 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(c[i])) {
                uc++;
            } else {
                lc++;
            }
        }

        if(uc > lc) {
            return str.toUpperCase();
        } else if(lc > uc) {
            return str.toLowerCase();
        } else {
            return str.toLowerCase();
        }
    }
}

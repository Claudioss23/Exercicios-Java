package CodeWars.SixKyu.ConsecutiveStrings;

import java.util.ArrayList;
import java.util.List;
import static java.util.Comparator.comparing;

class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        if(k > strarr.length || k <= 0) {
            return "";
        }
        List<String> l = new ArrayList<>();

        for(int i = 0; i < strarr.length; i++) {
            String s = strarr[i];

            for(int j = 1; j < k; j++) {
                if(i + j >= strarr.length) {
                    break;
                }

                s = s.concat(strarr[i + j]);
            }

            l.add(s);
        }

        return l.stream().max(comparing(String::length)).get();
    }
}

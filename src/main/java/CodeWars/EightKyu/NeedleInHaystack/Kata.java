package CodeWars.EightKyu.NeedleInHaystack;

import java.util.Arrays;

public class Kata {

    public static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
}

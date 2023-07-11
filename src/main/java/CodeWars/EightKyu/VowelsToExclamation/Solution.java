package CodeWars.EightKyu.VowelsToExclamation;

public class Solution {

    public static String replace(final String s) {
        return s.replaceAll("(?i)([aeiou])", "!");
    }
}

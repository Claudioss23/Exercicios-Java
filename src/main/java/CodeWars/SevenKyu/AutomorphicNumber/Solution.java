package CodeWars.SevenKyu.AutomorphicNumber;

public class Solution {

    public static String autoMorphic(int number) {
        String s = String.valueOf(number);

        if(String.valueOf((int) Math.pow(number, 2)).endsWith(s)) {
            return "Automorphic";
        } else {
            return "Not!!";
        }
    }
}

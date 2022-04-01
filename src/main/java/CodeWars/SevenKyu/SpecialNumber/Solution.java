package CodeWars.SevenKyu.SpecialNumber;

public class Solution {

    public static String specialNumber(int number) {
        if(number <= 5) {
            return "Special!!";
        }

        String s = String.valueOf(number);

        return s.matches(".*[6-9].*") ? "NOT!!" : "Special!!";
    }
}

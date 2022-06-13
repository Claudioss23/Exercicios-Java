package CodeWars.SevenKyu.ValidPINCode;

public class Solution {

    public static boolean validatePin(String pin) {
        return !pin.matches(".*\\D.*") && pin.length() >= 4 && pin.length() != 5 && pin.length() <= 6;
    }
}

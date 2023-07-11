package CodeWars.SevenKyu.FilterTheNumber;

public class Kata {
    public static long filterString(final String value) {
        return Long.parseLong(value.replaceAll("\\D", ""));
    }
}
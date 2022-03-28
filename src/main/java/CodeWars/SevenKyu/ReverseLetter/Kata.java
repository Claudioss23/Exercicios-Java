package CodeWars.SevenKyu.ReverseLetter;

public class Kata {

    public static String reverseLetter(final String str) {
        StringBuilder sb = new StringBuilder(str.replaceAll("[^A-Za-z]", ""));

        sb.reverse();

        return sb.toString();
    }
}

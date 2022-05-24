package CodeWars.EightKyu.ReversedString;

public class Kata {

    public static String solution(String str) {
        StringBuilder s = new StringBuilder(str);

        return s.reverse().toString();
    }
}

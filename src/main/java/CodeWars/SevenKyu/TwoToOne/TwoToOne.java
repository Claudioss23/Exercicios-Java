package CodeWars.SevenKyu.TwoToOne;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        StringBuilder res = new StringBuilder();

        (s1 + s2).chars().distinct().sorted().forEach(c -> res.append((char) c));

        return res.toString();
    }
}

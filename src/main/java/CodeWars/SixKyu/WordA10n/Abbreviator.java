package CodeWars.SixKyu.WordA10n;

public class Abbreviator {

    public String abbreviate(String string) {
        String ab = "";

        String[] arr = string.split("((?=[^a-zA-Z])|(?<=[^a-zA-Z]))");

        for (String s : arr) {
            if(s.charAt(0) == ' ' || s.length() < 4) {
                ab += s;
                continue;
            }

            int count = s.substring(1, s.length() - 1).length();

            ab += s.substring(0, 1) +
                    count +
                    s.substring(count + 1);
        }

        return ab;
    }
}
package CodeWars.EightKyu.RemoveFirstAndLastChar;

public class RemoveChars {

    public static String remove(String str) {
        StringBuilder s = new StringBuilder(str);

        s.deleteCharAt(0);
        s.deleteCharAt(str.length() - 2);

        return s.toString();
    }
}

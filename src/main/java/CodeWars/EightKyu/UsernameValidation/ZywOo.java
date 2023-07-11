package CodeWars.EightKyu.UsernameValidation;

public class ZywOo {
    public static boolean validateUsr(String s) {
        return s.matches("[a-z0-9_]{4,16}");
    }
}
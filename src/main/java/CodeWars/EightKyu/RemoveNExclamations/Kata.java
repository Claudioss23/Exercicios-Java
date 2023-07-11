package CodeWars.EightKyu.RemoveNExclamations;

public class Kata {
    public static String remove(String s, int n){
        while(n > 0) {
            s = s.replaceFirst("!", "");
            n--;
        }
        return s;
    }
}

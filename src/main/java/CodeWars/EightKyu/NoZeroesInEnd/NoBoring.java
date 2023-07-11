package CodeWars.EightKyu.NoZeroesInEnd;

public class NoBoring {
    public static int noBoringZeros(int n) {
        return n == 0 ? n : Integer.parseInt(Integer.toString(n).replaceAll("0*$", ""));
    }
}
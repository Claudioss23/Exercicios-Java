package CodeWars.SevenKyu.DivBySeven;

public class DivSeven {
    public static long[] seven(long m) {
        long steps = 0;

        while(String.valueOf(m).length() > 2) {
            m = (m / 10) - (2 * (m % 10));
            steps++;
        }

        return new long[] {m, steps};
    }
}
package CodeWars.EightKyu.ClockMs;

public class Clock {

    public static int Past(int h, int m, int s) {
        h *= 3600000;
        m *= 60000;
        s *= 1000;

        return (h + m + s);
    }
}

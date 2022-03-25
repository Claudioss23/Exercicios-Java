package CodeWars.SevenKyu.HighestAndLowest;

import java.util.Arrays;

public class Kata {

    public static String highAndLow(String numbers) {
        var s = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();

        return s.getMax() + " " + s.getMin();
    }
}

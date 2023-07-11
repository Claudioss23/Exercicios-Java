package CodeWars.EightKyu.LarioAndMuigi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static int[] pipeFix(int[] numbers) {
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();

        return IntStream.rangeClosed(min, max).toArray();
    }
}
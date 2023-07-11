package CodeWars.SevenKyu.SumOfOddCubes;

import java.util.Arrays;
public class FindOddCubes {

    public static int cubeOdd(int[] arr) {
        return Arrays.stream(arr)
                .map(a -> (int) Math.pow(a, 3))
                .reduce(0, (a, b) -> b % 2 != 0 ? a + b : a);
    }
}
package CodeWars.SevenKyu.MinMax;

import java.util.Arrays;

public class MinMax {

    public static int[] minMax(int[] arr) {
        int[] arr2 = new int[2];
        arr2[0] = Arrays.stream(arr).min().getAsInt();
        arr2[1] = Arrays.stream(arr).max().getAsInt();

        return arr2;
    }
}

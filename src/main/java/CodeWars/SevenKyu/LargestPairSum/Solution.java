package CodeWars.SevenKyu.LargestPairSum;

import java.util.Arrays;

public class Solution {

    public static int largestPairSum(int[] numbers){
        int size = numbers.length;

        Arrays.sort(numbers);

        int sec = numbers[size-2];

        return Arrays.stream(numbers).max().getAsInt() + sec;
    }
}

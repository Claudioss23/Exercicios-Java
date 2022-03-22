package CodeWars.SixKyu.FindOdd;

public class FindOddNumber {

    public static int findIt(int[] a) {
        int odd = 0;

        for (int i : a) {
            odd ^= i;
        }

        return odd;
    }
}

package CodeWars.EightKyu.ReduceButGrow;

public class Kata {

    public static int grow(int[] x){
        int a = 1;

        for (int j : x) {
            a *= j;
        }

        return a;
    }
}

package CodeWars.SevenKyu.Factorial;

public class Factorial {
    public static long factorial(int n) {
        long f = 1;

        for(int i = 1; i <= n; i++) {
            f *= i;
        }

        return f;
    }
}
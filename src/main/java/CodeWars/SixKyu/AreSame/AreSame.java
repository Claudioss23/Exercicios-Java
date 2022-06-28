package CodeWars.SixKyu.AreSame;

import java.util.Arrays;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if(a == null || b == null || a.length != b.length) {
            return false;
        }

        for(int i = 0; i < b.length; i++) {
            a[i] *= a[i];
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < b.length; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}

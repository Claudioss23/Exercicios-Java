package CodeWars.SixKyu.Tribonacci;

import java.util.ArrayList;
import java.util.List;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        if(n == 0) {return new double[]{};}
        if(s.length < 3) {return s;}

        double counter = 0,
                n1 = s[0],
                n2 = s[1],
                n3 = s[2];
        List<Double> a = new ArrayList<>();
        double[] b = new double[n];

        b[0] = n1;

        if(n >= 2) {
            b[1] = n2;
            if(n > 2) {
                b[2] = n3;
            }
        }

        while (counter < (n - 3)) {
            double n4 = n3 + n2 + n1;

            a.add(n4);

            n1 = n2;
            n2 = n3;
            n3 = n4;
            counter++;
        }

        for(int i = 3; i < b.length; i++) {
            b[i] = a.get(i - 3);
        }

        return b;
    }
}

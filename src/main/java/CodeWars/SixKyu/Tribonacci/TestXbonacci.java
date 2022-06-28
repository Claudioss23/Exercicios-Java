package CodeWars.SixKyu.Tribonacci;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestXbonacci {
    private static Xbonacci variabonacci;

    @BeforeAll
    static void setUp() {
        variabonacci = new Xbonacci();
    }

    @AfterAll
    static void tearDown() {
        variabonacci = null;
    }

    @Test
    public void sampleTests() {
        double precision = 1e-10;
        assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, variabonacci.tribonacci(new double []{1,1,1},10), precision);
        assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, variabonacci.tribonacci(new double []{0,0,1},10), precision);
        assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, variabonacci.tribonacci(new double []{0,1,1},10), precision);
    }
}

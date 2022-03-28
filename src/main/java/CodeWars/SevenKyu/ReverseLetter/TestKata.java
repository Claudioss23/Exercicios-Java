package CodeWars.SevenKyu.ReverseLetter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestKata {

    @Test
    public void testSomething() {
        doTest("krishan", "nahsirk");
        doTest("ultr53o?n", "nortlu");
        doTest("ab23c", "cba");
        doTest("krish21an", "nahsirk");
    }

    private void doTest(final String str, final String expected) {
        assertEquals(expected, Kata.reverseLetter(str));
    }
}

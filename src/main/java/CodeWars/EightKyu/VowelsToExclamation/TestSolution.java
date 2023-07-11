package CodeWars.EightKyu.VowelsToExclamation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution {

    @Test
    public void basicTests() {
        assertEquals("H!!",      Solution.replace("Hi!"));
        assertEquals("!H!! H!!", Solution.replace("!Hi! Hi!"));
        assertEquals("!!!!!",    Solution.replace("aeiou"));
        assertEquals("!BCD!",    Solution.replace("ABCDE"));
    }
}

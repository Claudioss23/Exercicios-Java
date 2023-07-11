package CodeWars.EightKyu.IsItADigit;

import CodeWars.EightKyu.ClockMs.Clock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStringUtils {

    @Test
    public void fixedTests() {
        assertFalse(StringUtils.isDigit(""));
        assertTrue(StringUtils.isDigit("7"));
        assertFalse(StringUtils.isDigit(" "));
        assertFalse(StringUtils.isDigit("a"));
        assertFalse(StringUtils.isDigit("a5"));
        assertFalse(StringUtils.isDigit("14"));
    }
}

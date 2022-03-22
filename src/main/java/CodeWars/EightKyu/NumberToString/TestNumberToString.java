package CodeWars.EightKyu.NumberToString;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestNumberToString {

    @Test
    public void tests() {
        assertEquals("67", NumberToString.numberToString(67));
        assertEquals("123", NumberToString.numberToString(123));
        assertEquals("999", NumberToString.numberToString(999));
    }
}

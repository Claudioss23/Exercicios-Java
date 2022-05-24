package CodeWars.SevenKyu.MIddleCharacter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestKata {
    @Test
    public void evenTests() {
        assertEquals("es", Kata.getMiddle("test"));
        assertEquals("dd", Kata.getMiddle("middle"));
    }
}

package CodeWars.EightKyu.RemoveNExclamations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestKata {

    @Test
    public void fixedTests() {
        // assertEquals("expected", "actual");
        assertEquals("Hi", Kata.remove("Hi!", 1));
        assertEquals("Hi", Kata.remove("Hi!", 100));
        assertEquals("Hi!!", Kata.remove("Hi!!!", 1));
        assertEquals("Hi", Kata.remove("Hi!!!", 100));
        assertEquals("Hi", Kata.remove("!Hi", 1));
        assertEquals("Hi!", Kata.remove("!Hi!", 1));
        assertEquals("Hi", Kata.remove("!Hi!", 100));
        assertEquals("!!Hi !!hi!!! !hi", Kata.remove("!!!Hi !!hi!!! !hi", 1));
        assertEquals("Hi !!hi!!! !hi", Kata.remove("!!!Hi !!hi!!! !hi", 3));
        assertEquals("Hi hi!!! !hi", Kata.remove("!!!Hi !!hi!!! !hi", 5));
        assertEquals("Hi hi hi", Kata.remove("!!!Hi !!hi!!! !hi", 100));
    }
}

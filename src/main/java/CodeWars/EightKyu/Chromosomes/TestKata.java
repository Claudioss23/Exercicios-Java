package CodeWars.EightKyu.Chromosomes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestKata {
    @Test
    public void tests() {
        assertEquals("Congratulations! You're going to have a son.", Kata.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", Kata.chromosomeCheck("XX"));
    }
}
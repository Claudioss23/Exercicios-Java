package CodeWars.EightKyu.SentenceSmash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSmashWords {

    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", SmashWords.smash("Bilal", "Djaghout"));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", SmashWords.smash());
    }

    @Test
    public void validateOneWord() {
        assertEquals("Bilal", SmashWords.smash("Bilal"));
    }
}

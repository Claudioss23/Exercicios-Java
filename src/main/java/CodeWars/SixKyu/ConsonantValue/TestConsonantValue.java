package CodeWars.SixKyu.ConsonantValue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConsonantValue {

    @Test
    public void basicTests() {
        assertEquals(ConsonantValue.solve("zodiac"), 26);
        assertEquals(ConsonantValue.solve("chruschtschov"), 80);
        assertEquals(ConsonantValue.solve("khrushchev"), 38);
        assertEquals(ConsonantValue.solve("strength"), 57);
        assertEquals(ConsonantValue.solve("catchphrase"), 73);
        assertEquals(ConsonantValue.solve("twelfthstreet"), 103);
        assertEquals(ConsonantValue.solve("mischtschenkoana"), 80);
    }
}

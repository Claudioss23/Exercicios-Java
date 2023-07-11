package CodeWars.EightKyu.UsernameValidation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestZywOo {

    @Test
    public void basicTests() {
        assertTrue(ZywOo.validateUsr("regex"));
        assertFalse(ZywOo.validateUsr("a"));
        assertFalse(ZywOo.validateUsr("Hass"));
        assertFalse(ZywOo.validateUsr("Hasd_12assssssasasasasasaasasasasas"));
        assertFalse(ZywOo.validateUsr(""));
        assertTrue(ZywOo.validateUsr("____"));
        assertFalse(ZywOo.validateUsr("012"));
        assertTrue(ZywOo.validateUsr("p1pp1"));
        assertFalse(ZywOo.validateUsr("asd43 34"));
        assertTrue(ZywOo.validateUsr("asd43_34"));
    }
}

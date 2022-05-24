package CodeWars.EightKyu.BooleanToString;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBooleanToString {

    @Test
    public void testTrue(){
        assertEquals(BooleanToString.convert(true), "true");
    }

    @Test
    public void testFalse(){
        assertEquals(BooleanToString.convert(false), "false");
    }
}

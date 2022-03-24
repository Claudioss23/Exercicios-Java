package CodeWars.EightKyu.Exclamation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution {

    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", Solution.removeExclamationMarks("Hello World!"));
    }
}

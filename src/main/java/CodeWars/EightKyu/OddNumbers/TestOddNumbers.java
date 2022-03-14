package CodeWars.EightKyu.OddNumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestOddNumbers {

    @Test
    public void testOddNumber() {
        Assertions.assertEquals(7, OddNumbers.oddCount(15));
    }
}

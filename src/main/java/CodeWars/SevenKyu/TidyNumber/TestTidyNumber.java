package CodeWars.SevenKyu.TidyNumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTidyNumber {

    @Test
    public void Check_Small_Values()
    {
        assertTrue(Solution.tidyNumber(12));
        assertFalse(Solution.tidyNumber(32));
        assertTrue(Solution.tidyNumber(39));
    }
    @Test
    public void Check_Larger_Values()
    {
        assertFalse(Solution.tidyNumber(1024));
        assertFalse(Solution.tidyNumber(12576));
        assertTrue(Solution.tidyNumber(13579));
        assertTrue(Solution.tidyNumber(2335));
    }
}

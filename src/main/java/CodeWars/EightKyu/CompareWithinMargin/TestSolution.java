package CodeWars.EightKyu.CompareWithinMargin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSolution {

    @Test
    public void exampleTestCases() {
        assertEquals(-1, Solution.closeCompare(4, 5));
        assertEquals(0, Solution.closeCompare(5, 5));
        assertEquals(1, Solution.closeCompare(6, 5));
        assertEquals(-1, Solution.closeCompare(-6, -5));

        assertEquals(0, Solution.closeCompare(2, 5, 3));
        assertEquals(1, Solution.closeCompare(8.1, 5, 3));
        assertEquals(-1, Solution.closeCompare(1.99, 5, 3));
    }
}
